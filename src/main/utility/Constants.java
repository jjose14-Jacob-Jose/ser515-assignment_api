package main.utility;

public class Constants {

    public static final int CODE_RESPONSE_SUCCESSFUL_HTTP_CONNECTION = 200;
    public static final int CODE_RESPONSE_FAIL = -1;
    public static final int CODE_TERMINATE = 0;

    public static final String URL_TAIGA_USER_AUTHENTICATION = "https://api.taiga.io/api/v1/auth";
    public static final String URL_TAIGA_PROJECT_BY_SLUG = "https://api.taiga.io/api/v1/projects/by_slug?slug=";
    public static final String URL_TAIGA_PROJECT_BY_MILESTONES = "https://api.taiga.io/api/v1/milestones?project=";
    public static final String URL_TAIGA_PROJECT_BY_USERSTORIES = "https://api.taiga.io/api/v1/userstories?project=";
    public static final String URL_TAIGA_PROJECT_BY_TASKS_IN_A_SPRINT_PART_ONE_UPTO_PROJECT = "https://api.taiga.io/api/v1/tasks/filters_data?project=";
    public static final String URL_TAIGA_PROJECT_BY_TASKS_IN_A_SPRINT_PART_TWO_SPRINT = "&milestone=";

    public static final String TYPE_CONNECTION_REQUEST_GET = "GET";
    public static final String TYPE_CONNECTION_REQUEST_POST = "POST";
    public static final String TYPE_STR_ENCODING_FORMAT_UTF_EIGHT = "UTF-8";

    public static final String JSON_KEY_SLUG = "slug";

    public static final String MSG_USER_STORY_COMPLETED = "Done/Completed";
    public static final String MSG_USER_STORY_NOT_COMPLETED = "Not Completed";

    public static final String MSG_CONSOLE_LINE_SEPARATOR = "  ";
    public static final String MSG_CONSOLE_HEADING_BOUNDARY = "***********************************************";
    public static final String MSG_CONSOLE_NEW_LINE = "\n";



}
