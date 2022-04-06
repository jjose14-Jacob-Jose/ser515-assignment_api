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
import taigaAPI.POJO.UserstoryBySlug.UserStoryBySlug;
import taigaAPI.utility.Constants;
import taigaAPI.utility.CurrentSession;
import taigaAPI.utility.InputOutput;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {

    private static final String MENU_TEXT_INPUT_INSTRUCTION_INTEGER = "Please enter the corresponding index number.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_STRING = "Please enter.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING = "\n"
            + "0 - Exit";
    private static final String MENU_TEXT_LOGIN = "1 - Login via credentials" + "\n"
            + "2 - Slug";
    private static final String MENU_TEXT_PROJECT = "1 - List all Sprints" + "\n"
            + "2 - List all User Stories" + "\n"
            + "3 - Get a specific Sprint's information";
    private static final String MENU_TEXT_SLUG = "Enter project's slug:";
    private static final String MENU_TEXT_INVALID_INPUT = "Your input is not valid.";

    private static CurrentSession currentSession = new CurrentSession();

    private String concatenateStrings (String prefix, String middle, String suffix) {
        return prefix + "\n" + middle + "\n" + suffix;
    }

    public void showMainMenu() {

        int userInput = Constants.CODE_TERMINATE;
        do {
            String stringToBeDisplayed = concatenateStrings(MENU_TEXT_INPUT_INSTRUCTION_INTEGER, MENU_TEXT_LOGIN, MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING);
            userInput = InputOutput.readIntegerFromConsoleString(stringToBeDisplayed);

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
        String stringToBeDisplayed = "#" +  "\t" + "Member Full Name" + "\t" + "Role";

        InputOutput.displayOnConsole(stringToBeDisplayed);
        int index = 1;
        for(MembersItem memberItem: currentSession.getResponseBySlug().getMembers()) {
            stringToBeDisplayed = index + "\t" + memberItem.getFullName() + "\t" + memberItem.getRoleName();
            InputOutput.displayOnConsole(stringToBeDisplayed);
        }
    }

    private void displayProjectMenu() {

        int userInput = Constants.CODE_TERMINATE;
        do {
            String stringToBeDisplayed = concatenateStrings(MENU_TEXT_INPUT_INSTRUCTION_INTEGER, MENU_TEXT_PROJECT, MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING);
            userInput = InputOutput.readIntegerFromConsoleString(stringToBeDisplayed);

            switch (userInput) {
                case 1: displayAllSprints();
                        break;
                case 2: displayAllUserStories();
                case 3: break;
                default: InputOutput.displayOnConsole(MENU_TEXT_INVALID_INPUT);
            }
        }while(userInput != Constants.CODE_TERMINATE);
    }

    private void displayAllSprints() {

        String finalURL = Constants.URL_TAIGA_PROJECT_BY_MILESTONES + currentSession.getResponseBySlug().getId();
        MilestonesByProject milestonesByProject;

        JsonArray jsonArray = Connector.getResponseFromUrlAsJsonArrayGET(finalURL);
        try {
            String stringToBeDisplayed = "#" + "\t"
                    + "Sprint Name" + "\t"
                    + "Start Date" + "\t"
                    + "End Date" + "\t"
                    + "Total Points" + "\t"
                    + "Finished Points" + "\t";

            InputOutput.displayOnConsole(stringToBeDisplayed);
            int index = 1;
            for (JsonElement jsonElement : jsonArray) {

                milestonesByProject = new ObjectMapper().readValue(jsonElement.toString(), MilestonesByProject.class);


                stringToBeDisplayed = index + "\t"
                        + milestonesByProject.getName() + "\t"
                        + milestonesByProject.getEstimatedStart() + "\t"
                        + milestonesByProject.getEstimatedFinish() + "\t"
                        + milestonesByProject.getTotalPoints() + "\t"
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
        String stringToBeDisplayed = "#" + "\t"
                + "UserStory Name" + "\t"
                + "Completion Status" + "\t"
                + "Date of creation" + "\t"
                + "Date moved to sprint" + "\t"
                + "Sprint" + "\t";

        InputOutput.displayOnConsole(stringToBeDisplayed);
        int index = 0;
        for (JsonElement jsonElement : jsonArray) {

            JsonObject jsonObjectHoldingUserStory = jsonElement.getAsJsonObject();
            String userStoryName = String.valueOf(jsonObjectHoldingUserStory.get("subject"));
            String userStoryCompletionStatus = String.valueOf(jsonObjectHoldingUserStory.get("is_closed"));
            String userStoryCreationDate = String.valueOf(jsonObjectHoldingUserStory.get("created_date"));
            String userStoryDateMovedToSprint = String.valueOf(jsonObjectHoldingUserStory.get("modified_date"));
            String userStorySprint = String.valueOf(jsonObjectHoldingUserStory.get("milestone"));

            userStoryCompletionStatus = (userStoryCompletionStatus.equalsIgnoreCase("TRUE") ? Constants.MSG_USER_STORY_COMPLETED : Constants.MSG_USER_STORY_NOT_COMPLETED);

            stringToBeDisplayed = index + "\t"
                    + userStoryName + "\t"
                    + userStoryCompletionStatus + "\t"
                    + userStoryCreationDate + "\t"
                    + userStoryDateMovedToSprint+ "\t"
                    + userStorySprint;
            InputOutput.displayOnConsole(stringToBeDisplayed);
        }

    }

//    private void displayAllUserStoriesOld() {
//
//        String finalURL = Constants.URL_TAIGA_PROJECT_BY_USERSTORIES + currentSession.getResponseBySlug().getId();
////        UserstoryBySlug [] userstoryBySlug;
//
//        JsonArray jsonArray = Connector.getResponseFromUrlAsJsonArrayGET(finalURL);
//        String stringToBeDisplayed = "#" + "\t"
//                + "UserStory Name" + "\t"
//                + "Completion Status" + "\t"
//                + "Date of creation" + "\t"
//                + "Date moved to sprint" + "\t"
//                + "Sprint" + "\t";
//
//        InputOutput.displayOnConsole(stringToBeDisplayed);
////        int index = 0;
//        for(int index=0; index<jsonArray.size(); index++) {
////        for (JsonElement jsonElement : jsonArray) {
//
//            JsonObject jsonElement = jsonArray.get(index).getAsJsonObject();
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//            try {
////                userstoryBySlug = objectMapper.readValue(jsonElement.toString(), UserstoryBySlug[].class);
//
////                String userStoryCompletionStatus = (userStoriesBySlug.isIsClosed() ? Constants.MSG_USER_STORY_COMPLETED : Constants.MSG_USER_STORY_NOT_COMPLETED);
//
////                stringToBeDisplayed = index + "\t"
////                        + userStoriesBySlugItem.getSubject() + "\t"
////                        + userStoryCompletionStatus + "\t"
////                        + userStoriesBySlugItem.getCreatedDate() + "\t"
////                        + userStoriesBySlugItem.getModifiedDate() + "\t"
////                        + userStoriesBySlugItem.getMilestoneName();
//                InputOutput.displayOnConsole(stringToBeDisplayed);
//            } catch (JsonProcessingException jsonProcessingException) {
//
//            }
//        }
//
//    }



}
