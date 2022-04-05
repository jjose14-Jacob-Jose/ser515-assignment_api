package taigaAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import taigaAPI.utility.Constants;
import taigaAPI.utility.InputOutput;

public class TaigaMenu {

    private String taigaAuthenticationToken;
    private String taigaProjectSlug;
    private String taigaProjectID;


    private String textMenuInputInformation;
    private String textMainMenu;
    private String textProjectMenu;
    private String textExitMenu;
    private String msgInvalidInput;

    public TaigaMenu() {

        textMenuInputInformation = "\n" + "Please enter the corresponding index number:" + "\n";
        textExitMenu = "0 - Exit";

        textMainMenu = "1 - Login via credentials" +
                "\n" + "2 - Slug (method)";
        textMainMenu = addPrefixSuffixToSprint(textMenuInputInformation,textMainMenu,textExitMenu);

        textProjectMenu = "1 - List all Sprints" + "\n" +
                "2 - List all User Stories" + "\n" +
                "3 - Show a specific Sprint's information";
        textProjectMenu = addPrefixSuffixToSprint(textMenuInputInformation,textProjectMenu,textExitMenu);

        msgInvalidInput = "Your input is has caused an error. Please enter a valid input";

    }

    private String addPrefixSuffixToSprint(String stringPrefix, String stringMain, String stringSuffix) {
        return stringPrefix + stringMain + stringSuffix;
    }

    public void displayMainMenu () {

        int inputByUser = -1;
        do {
            inputByUser = InputOutput.readIntegerFromConsoleString(textMainMenu);

            switch (inputByUser) {
                case 1: inputByUser = getAuthenticationTokenWithUserCredentials();
                        break;
                case 2: readProjectSlug();
                        displayProjectInformationMenu();
                        break;
                default: InputOutput.displayOnConsole(msgInvalidInput);

            }
            
        }while(inputByUser != Constants.CODE_STATUS_OPERATION_TERMINATE);
    }

    public int getAuthenticationTokenWithUserCredentials() {
        InputOutput.displayOnConsole("Enter:");
        String username = InputOutput.readTextFromConsoleString("username:");
        String password = InputOutput.readPasswordFromConsoleString("password:");
        String jsonMessageBody = "{\"username\": \"" + username + "\", \"password\": \"" + password + "\", \"type\": \"normal\"}";
        JSONObject jsonObjectTaigaLoginResponse = TaigaConnector.getResponseFromUrlAsJsonGET(Constants.URL_TAIGA_AUTHENTICATION, jsonMessageBody);

        taigaAuthenticationToken = TaigaConnector.getValueOfKeyFromJSON(jsonObjectTaigaLoginResponse,Constants.STR_JSON_RESPONSE_KEY_AUTHENTICATION_TOKEN);

        if(taigaAuthenticationToken!=null && taigaAuthenticationToken.length() > 0) {
            taigaProjectID = TaigaConnector.getValueOfKeyFromJSON(jsonObjectTaigaLoginResponse,Constants.STR_JSON_RESPONSE_KEY_PROJECT_ID);
            return Constants.CODE_STATUS_OPERATION_SUCCESS;
        } else {
            return Constants.CODE_STATUS_OPERATION_FAILED;
        }
    }

    private void readProjectSlug() {
        taigaProjectSlug = InputOutput.readTextFromConsoleString("Enter project's slug:");

        JSONObject jsonValidateSlug = getJsonUsingProjectSlug();
        String taigaProjectSlugFromResponse = TaigaConnector.getValueOfKeyFromJSON(jsonValidateSlug,Constants.STR_JSON_RESPONSE_KEY_SLUG);

        if(taigaProjectSlug.equalsIgnoreCase(taigaProjectSlugFromResponse)) {
            InputOutput.displayOnConsole(Constants.MSG_SUCCESS_CONNECTION);
        }
    }

    private JSONObject getJsonUsingProjectSlug() {

        if(taigaProjectSlug == null || taigaProjectSlug.length() == 0) {
            return null;
        } else {
        JSONObject jsonValidateSlug = TaigaConnector.getResponseFromUrlAsJsonGET(Constants.URL_TAIGA_PROJECT_BY_SLUG + taigaProjectSlug);
        return jsonValidateSlug;
        }
    }


    public void displayProjectInformationMenu() {

        int inputByUser = -1;
        do {
            inputByUser = InputOutput.readIntegerFromConsoleString(textProjectMenu);

            switch (inputByUser) {
                case 1:
                    displayAllSprints();
                    break;
                case 2:
                    displayAllUserStories();
                    break;
                case 3:
                    displaySprintDetailsBasedOnSprintNumber();
                    break;
                default:
                    InputOutput.displayOnConsole(msgInvalidInput);
            }

        }while(inputByUser != Constants.CODE_STATUS_OPERATION_TERMINATE);
        
    }

    public void displayAllSprints() {
        JSONObject jsonContainingSprints = TaigaConnector.getResponseFromUrlAsJsonGET(Constants.URL_TAIGA_PROJECT_MILESTONES + taigaProjectID);
        String sprintsInProject = jsonContainingSprints.get(Constants.STR_JSON_RESPONSE_KEY_SPRINTS_MILESTONES).toString();
        ObjectMapper objectMapper = new ObjectMapper();


    }

    public void displayAllUserStories() {

    }

    public void displaySprintDetailsBasedOnSprintNumber() {
        int sprintNumber = InputOutput.readIntegerFromConsoleString("Enter the sprint's number");

    }

    public static void main(String[] args) {
        TaigaMenu taigaMenu = new TaigaMenu();
        taigaMenu.displayMainMenu();
//        taigaMenu.getAuthenticationTokenWithUserCredentials();
//        taigaMenu.displayAllSprints();

    }

}