package taigaAPI;

import org.json.JSONObject;
import taigaAPI.utility.Constants;
import taigaAPI.utility.InputOutput;

public class TaigaMenu {

    private String taigaAuthenticationToken;
    private String taigaProjectSlug;


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
                case 2: getProjectSlug();
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
        JSONObject jsonObjectTaigaLoginResponse = TaigaConnector.getResponseFromUrlAsJsonPOST(Constants.URL_TAIGA_AUTHENTICATION, jsonMessageBody);

        taigaAuthenticationToken = jsonObjectTaigaLoginResponse.get(Constants.STR_JSON_RESPONSE_KEY_AUTHENTICATION_TOKEN).toString();
        taigaAuthenticationToken = TaigaConnector.getValueOfKeyFromJSON(jsonObjectTaigaLoginResponse,Constants.STR_JSON_RESPONSE_KEY_AUTHENTICATION_TOKEN);

        if(taigaAuthenticationToken!=null && taigaAuthenticationToken.length() > 0) {
            return Constants.CODE_STATUS_OPERATION_SUCCESS;
        } else {
            return Constants.CODE_STATUS_OPERATION_FAILED;
        }
    }

    private void getProjectSlug() {

    }
    
    public void displayProjectInformationMenu() {

        int inputByUser = -1;
        do {
            inputByUser = InputOutput.readIntegerFromConsoleString(textExitMenu);

            switch (inputByUser){
                case 1: displayAllSprints();
                        break;
                case 2: displayAllUserStories();
                    break;
                case 3: displaySprintDetailsBasedOnSprintNumber();
                    break;
                default: InputOutput.displayOnConsole(msgInvalidInput);
            }

        }while(inputByUser != Constants.CODE_STATUS_OPERATION_TERMINATE);
        
    }

    public void displayAllSprints() {

    }

    public void displayAllUserStories() {

    }

    public void displaySprintDetailsBasedOnSprintNumber() {
        int sprintNumber = InputOutput.readIntegerFromConsoleString("Enter the sprint's number");

    }

    public static void main(String[] args) {
        TaigaMenu taigaMenu = new TaigaMenu();
        taigaMenu.getAuthenticationTokenWithUserCredentials();
    }

}