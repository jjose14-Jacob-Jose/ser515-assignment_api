package taigaAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import taigaAPI.POJO.MembersItem;
import taigaAPI.POJO.ResponseBySlug;
import taigaAPI.utility.Constants;
import taigaAPI.utility.CurrentSession;
import taigaAPI.utility.InputOutput;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class Menu {

    private static final String MENU_TEXT_INPUT_INSTRUCTION_INTEGER = "Please enter the corresponding index number.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_STRING = "Please enter.";
    private static final String MENU_TEXT_INPUT_INSTRUCTION_FOR_EXITING = "\n" + "0 - Exit";
    private static final String MENU_TEXT_LOGIN = "1 - Login via credentials" + "\n" + "2 - Slug";
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

        JsonObject jsonObject = Connector.getResponseFromUrlAsJsonPOST(finalURL);
        try {
            responseBySlug = new ObjectMapper().readValue(jsonObject.toString(), ResponseBySlug.class);
            if(userInputSlug.equalsIgnoreCase(responseBySlug.getSlug())) {
                currentSession.setResponseBySlug(responseBySlug);
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
}
