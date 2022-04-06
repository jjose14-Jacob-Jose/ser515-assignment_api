package main.utility;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static main.utility.Constants.MSG_CONSOLE_HEADING_BOUNDARY;

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

    public static void displayHeadingOnConsole(String stringToBeDisplayed) {
        initializeMembers();
        System.out.println(MSG_CONSOLE_HEADING_BOUNDARY);
        System.out.println(stringToBeDisplayed);
        System.out.println(MSG_CONSOLE_HEADING_BOUNDARY);

    }

    public static String readTextFromConsoleString(String promptToBeDisplayed) {
        try{
            displayOnConsole(promptToBeDisplayed);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userInput = br.readLine();
            return  userInput;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int readIntegerFromConsoleString(String promptToBeDisplayed) {
        try{
            initializeMembers();
            displayOnConsole(promptToBeDisplayed);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userInput = br.readLine();
            return Integer.parseInt(userInput);
        } catch (IOException e) {
            e.printStackTrace();
            return Constants.CODE_RESPONSE_FAIL;
        }
    }

    public static int readIntegerFromConsoleString() {
        try{
            initializeMembers();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userInput = br.readLine();;
            return Integer.parseInt(userInput);
        } catch (IOException e) {
            e.printStackTrace();
            return Constants.CODE_RESPONSE_FAIL;
        }
    }

    public static String readPasswordFromConsoleString(String promptToBeDisplayed) {
        initializeMembers();
        displayOnConsole(promptToBeDisplayed);

        Console console = System.console();
        char [] arrayPassword = console.readPassword();

        return Arrays.toString(arrayPassword);

    }
}
