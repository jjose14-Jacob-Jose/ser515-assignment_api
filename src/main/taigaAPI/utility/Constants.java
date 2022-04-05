package taigaAPI.utility;

public class Constants {

    public static final int CODE_RESPONSE_SUCCESSFUL_HTTP_CONNECTION = 200;
    public static final int CODE_STATUS_OPERATION_SUCCESS = 1;
    public static final int CODE_STATUS_OPERATION_FAILED = -1;
    public static final int CODE_STATUS_OPERATION_TERMINATE = 0;

    public static final String URL_TAIGA_AUTHENTICATION = "https://api.taiga.io/api/v1/auth";

    public static final String STR_CONNECTION_REQUEST_METHOD_TYPE_POST = "POST";
    public static final String STR_ENCODING_FORMAT_UTF_EIGHT = "UTF-8";
    public static final String STR_JSON_RESPONSE_KEY_AUTHENTICATION_TOKEN = "auth_token";

    public static final String MSG_ERROR_CONNECTION_FAILED = "Error while connecting to Taiga API. Please try again later.";
    public static final String MSG_ERROR_PASSWORD_FAILED_TO_GET_CONSOLE = "Unable to get Console reader to mask your password. +" +
            "Your password will not be masked." +
            "\n " + " Enter your password. ";

    public static final String JSON_TEST_CREDENTIALS = "{\"username\": \"jacobjose123\", \"password\": \"Kochi.345.\", \"type\": \"normal\"}";

    public static final String JSON_TEST_PARAMETER_KEY = "username";
    public static final String JSON_TEST_PARAMETER_KEY_EXPECTED_VALUE = "jacobjose123";
}
