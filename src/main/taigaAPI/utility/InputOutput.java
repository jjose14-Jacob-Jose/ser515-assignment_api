package taigaAPI.utility;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputOutput {
    private static BufferedReader bufferedReader;
    private static InputStreamReader inputStreamReader;

    private static void initializeMembers() {
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inputStreamReader);
    }

    public static void displayOnConsole(String stringToBeDisplayed) {
        initializeMembers();
        System.out.println(stringToBeDisplayed);
    }

    public static String readTextFromConsoleString(String promptToBeDisplayed) {
        try{
            initializeMembers();
            displayOnConsole(promptToBeDisplayed);
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int readIntegerFromConsoleString(String promptToBeDisplayed) {
        try{
            initializeMembers();
            displayOnConsole(promptToBeDisplayed);
            String userInput = bufferedReader.readLine();
            int inputFromConsole = Integer.parseInt(userInput);
            return  inputFromConsole;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String readPasswordFromConsoleString(String promptToBeDisplayed) {
        initializeMembers();
        displayOnConsole(promptToBeDisplayed);

        Console console = System.console();
        if(console == null)
        {
            String password = InputOutput.readTextFromConsoleString(Constants.MSG_ERROR_PASSWORD_FAILED_TO_GET_CONSOLE);
            return  password;
        } else {
            char[] arrayPassword = console.readPassword();

            return Arrays.toString(arrayPassword);
        }

    }
}
