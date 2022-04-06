package taigaAPI;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import taigaAPI.POJO.MilestonesBySlug.MilestonesByProject;
import taigaAPI.POJO.ResponseBySlug.MembersItem;
import taigaAPI.POJO.ResponseBySlug.ResponseBySlug;
import taigaAPI.POJO.TasksOnASprint.AssignedToItem;
import taigaAPI.POJO.TasksOnASprint.TasksOnASprint;
import taigaAPI.POJO.UserstoryBySlug.UserStoryBySlug;
import taigaAPI.utility.Constants;
import taigaAPI.utility.CurrentSession;
import taigaAPI.utility.InputOutput;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

import static taigaAPI.utility.Constants.MSG_CONSOLE_NEW_LINE;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {

    private static final String MENU_TEXT_INPUT_INSTRUCTION_INTEGER = "Please enter the corresponding index number.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_STRING = "Please enter.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING = "\n"
            + "0 - Exit";
    private static final String MENU_TEXT_LOGIN = "1 - Login via credentials" + "\n"
            + "2 - Slug";
    private static final String MENU_TEXT_PROJECT = "1 - List all Sprints" + "\n"
            + "2 - Get User Stories of a specific sprint. " + "\n"
            + "3 - List all User Stories in the project." + "\n"
            + "4 - List tasks a team member was assigned in a sprint.";

    private static final String MENU_TEXT_SLUG = "Enter project's slug:";
    private static final String MENU_TEXT_INVALID_INPUT = "Your input is not valid.";
    private static final String MENU_TEXT_ENTER_SPRINT_ID = "Enter the ID number of the Sprint whose user stories you want see";

    private static CurrentSession currentSession = new CurrentSession();

    private String concatenateStrings (String prefix, String middle, String suffix, String concatenationSymbol) {
        return prefix + concatenationSymbol + middle + concatenationSymbol + suffix;
    }

    public void showMainMenu() {

        int userInput = Constants.CODE_TERMINATE;
        do {
            String stringToBeDisplayed = concatenateStrings(MENU_TEXT_INPUT_INSTRUCTION_INTEGER, MENU_TEXT_LOGIN, MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING, MSG_CONSOLE_NEW_LINE);
            InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
            userInput = InputOutput.readIntegerFromConsoleString();

            switch (userInput) {
                case 1: break;
                case 2: loginViaSlug();
                        displayMembersInProject();
                        displayProjectMenu();
                        break;
                default: InputOutput.displayOnConsole(MENU_TEXT_INVALID_INPUT);
            }
        }while(userInput != Constants.CODE_TERMINATE);
    }

    @JsonIgnoreProperties
    private void loginViaSlug () {
        ResponseBySlug responseBySlug;
        String userInputSlug = InputOutput.readTextFromConsoleString(MENU_TEXT_SLUG);
        String finalURL = Constants.URL_TAIGA_PROJECT_BY_SLUG + userInputSlug;

        JsonObject jsonObject = Connector.getResponseFromUrlAsJsonGET(finalURL);
        try {
            responseBySlug = new ObjectMapper().readValue(jsonObject.toString(), ResponseBySlug.class);
            if(userInputSlug.equalsIgnoreCase(responseBySlug.getSlug())) {
                currentSession.setResponseBySlug(responseBySlug);
                currentSession.setProjectSlug(userInputSlug);
            }
        } catch (JsonProcessingException e) {
            InputOutput.displayOnConsole("The slug you entered is wrong. Can't establish connection.");
        }
    }

    private void displayMembersInProject() {
        String stringToBeDisplayed = "#" +  Constants.MSG_CONSOLE_LINE_SEPARATOR + "Member Full Name" + Constants.MSG_CONSOLE_LINE_SEPARATOR + "Role";

        InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
        int index = 1;
        for(MembersItem memberItem: currentSession.getResponseBySlug().getMembers()) {
            stringToBeDisplayed = index + Constants.MSG_CONSOLE_LINE_SEPARATOR + memberItem.getFullName() + Constants.MSG_CONSOLE_LINE_SEPARATOR + memberItem.getRoleName();
            InputOutput.displayOnConsole(stringToBeDisplayed);
        }
    }

    private void displayProjectMenu() {

        int userInput = Constants.CODE_TERMINATE;
        do {
            String stringToBeDisplayed = concatenateStrings(MENU_TEXT_INPUT_INSTRUCTION_INTEGER, MENU_TEXT_PROJECT, MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING, MSG_CONSOLE_NEW_LINE);
            InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
            userInput = InputOutput.readIntegerFromConsoleString();

            switch (userInput) {
                case 1: displayAllSprints();
                        break;
                case 2: displayAllSprints();
                        userInput = InputOutput.readIntegerFromConsoleString(MENU_TEXT_ENTER_SPRINT_ID);
                        displayUserStoriesOfASprint(userInput);
                        break;
                case 3:displayAllUserStories();
                        break;
                case 4: displayAllSprints();
                        userInput = InputOutput.readIntegerFromConsoleString(MENU_TEXT_ENTER_SPRINT_ID);
                        displayTasksAssignedToUsersInASprint(userInput);
                        break;
                default: InputOutput.displayOnConsole(MENU_TEXT_INVALID_INPUT);
            }
        }while(userInput != Constants.CODE_TERMINATE);
    }

    private void displayAllSprints() {

        String finalURL = Constants.URL_TAIGA_PROJECT_BY_MILESTONES + currentSession.getResponseBySlug().getId();
        MilestonesByProject milestonesByProject;

        JsonArray jsonArray = Connector.getResponseFromUrlAsJsonArrayGET(finalURL);
        try {
            String stringToBeDisplayed = "#" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "Sprint ID" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "Sprint Name" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "Start Date" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "End Date" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "Total Points" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + "Finished Points" + Constants.MSG_CONSOLE_LINE_SEPARATOR;

            InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
            int index = 1;
            for (JsonElement jsonElement : jsonArray) {

                milestonesByProject = new ObjectMapper().readValue(jsonElement.toString(), MilestonesByProject.class);


                stringToBeDisplayed = index + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getId() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getName() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getEstimatedStart() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getEstimatedFinish() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getTotalPoints() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + milestonesByProject.getClosedPoints();
                InputOutput.displayOnConsole(stringToBeDisplayed);
                index++;
            }
        } catch (JsonProcessingException e) {
            InputOutput.displayOnConsole("The slug you entered is wrong. Can't establish connection.");
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private void displayAllUserStories() {

        String finalURL = Constants.URL_TAIGA_PROJECT_BY_USERSTORIES + currentSession.getResponseBySlug().getId();
        MilestonesByProject milestonesByProject;

        JsonArray jsonArray = Connector.getResponseFromUrlAsJsonArrayGET(finalURL);
        String stringToBeDisplayed = "#" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "UserStory ID" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "UserStory Name" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Completion Status" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Date of creation" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Date moved to sprint" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Sprint" + Constants.MSG_CONSOLE_LINE_SEPARATOR;

        InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
        int index = 0;
        for (JsonElement jsonElement : jsonArray) {

            JsonObject jsonObjectHoldingUserStory = jsonElement.getAsJsonObject();
            String userStoryID = String.valueOf(jsonObjectHoldingUserStory.get("id"));
            String userStoryName = String.valueOf(jsonObjectHoldingUserStory.get("subject"));
            String userStoryCompletionStatus = String.valueOf(jsonObjectHoldingUserStory.get("is_closed"));
            String userStoryCreationDate = String.valueOf(jsonObjectHoldingUserStory.get("created_date"));
            String userStoryDateMovedToSprint = String.valueOf(jsonObjectHoldingUserStory.get("modified_date"));
            String userStorySprint = String.valueOf(jsonObjectHoldingUserStory.get("milestone"));

            userStoryCompletionStatus = (userStoryCompletionStatus.equalsIgnoreCase("TRUE") ? Constants.MSG_USER_STORY_COMPLETED : Constants.MSG_USER_STORY_NOT_COMPLETED);

            stringToBeDisplayed = index + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStoryID + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStoryName + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStoryCompletionStatus + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStoryCreationDate + Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStoryDateMovedToSprint+ Constants.MSG_CONSOLE_LINE_SEPARATOR
                    + userStorySprint;
            InputOutput.displayOnConsole(stringToBeDisplayed);
            index++;
        }

    }

    private void displayUserStoriesOfASprint(int sprintID) {

        String finalURL = Constants.URL_TAIGA_PROJECT_BY_USERSTORIES + currentSession.getResponseBySlug().getId();
        MilestonesByProject milestonesByProject;

        JsonArray jsonArray = Connector.getResponseFromUrlAsJsonArrayGET(finalURL);
        String stringToBeDisplayed = "#" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "UserStory ID" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "UserStory Name" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Completion Status" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Date of creation" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Date moved to sprint" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                + "Sprint" + Constants.MSG_CONSOLE_LINE_SEPARATOR;

        InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
        int index = 0;
        for (JsonElement jsonElement : jsonArray) {

            JsonObject jsonObjectHoldingUserStory = jsonElement.getAsJsonObject();
            String userStorySprintID = String.valueOf(jsonObjectHoldingUserStory.get("milestone"));

            if(userStorySprintID.equalsIgnoreCase(String.valueOf(sprintID))) {
                String userStoryID = String.valueOf(jsonObjectHoldingUserStory.get("id"));
                String userStoryName = String.valueOf(jsonObjectHoldingUserStory.get("subject"));
                String userStoryCompletionStatus = String.valueOf(jsonObjectHoldingUserStory.get("is_closed"));
                String userStoryCreationDate = String.valueOf(jsonObjectHoldingUserStory.get("created_date"));
                String userStoryDateMovedToSprint = String.valueOf(jsonObjectHoldingUserStory.get("modified_date"));
                String userStorySprint = String.valueOf(jsonObjectHoldingUserStory.get("milestone"));

                userStoryCompletionStatus = (userStoryCompletionStatus.equalsIgnoreCase("TRUE") ? Constants.MSG_USER_STORY_COMPLETED : Constants.MSG_USER_STORY_NOT_COMPLETED);

                stringToBeDisplayed = index + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStoryID + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStoryName + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStoryCompletionStatus + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStoryCreationDate + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStoryDateMovedToSprint+ Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + userStorySprint;
                InputOutput.displayOnConsole(stringToBeDisplayed);
                index++;

            }


        }

    }

    private void displayTasksAssignedToUsersInASprint(int sprintID) {

        String finalURL = concatenateStrings( Constants.URL_TAIGA_PROJECT_BY_TASKS_IN_A_SPRINT_PART_ONE_UPTO_PROJECT,String.valueOf(currentSession.getResponseBySlug().getId()), Constants.URL_TAIGA_PROJECT_BY_TASKS_IN_A_SPRINT_PART_TWO_SPRINT, "");
        finalURL = finalURL + sprintID;
        TasksOnASprint tasksOnASprint;

        JsonObject jsonObject = Connector.getResponseFromUrlAsJsonGET(finalURL);
        try {

            tasksOnASprint = new ObjectMapper().readValue(jsonObject.toString(), TasksOnASprint.class);

            Map<String, Integer> userAssignedTasks = new HashMap<String, Integer>();

            for(AssignedToItem assignedToItem: tasksOnASprint.getAssignedTo()){
                String userName = assignedToItem.getFullName();
                if(userAssignedTasks.containsKey(userName)) {
                    userAssignedTasks.put(userName, userAssignedTasks.get(userName) + 1);
                } else if(userName.length()>3){
                    userAssignedTasks.put(userName, 0);
                }
            }
            if(userAssignedTasks.keySet().size()>0) {
                String stringToBeDisplayed = "#" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + "Name of User" + Constants.MSG_CONSOLE_LINE_SEPARATOR
                        + "Tasks Assigned" + Constants.MSG_CONSOLE_LINE_SEPARATOR;

                InputOutput.displayHeadingOnConsole(stringToBeDisplayed);
                int index = 0;
                for (Map.Entry<String, Integer> userTaskInformation : userAssignedTasks.entrySet()) {
                    stringToBeDisplayed = index + Constants.MSG_CONSOLE_LINE_SEPARATOR
                            + userTaskInformation.getKey() + Constants.MSG_CONSOLE_LINE_SEPARATOR
                            + userTaskInformation.getValue();
                    InputOutput.displayOnConsole(stringToBeDisplayed);
                    index++;
                }
            }

        } catch (JsonProcessingException e) {
            InputOutput.displayOnConsole("The slug you entered is wrong. Can't establish connection.");
        }

    }


}
