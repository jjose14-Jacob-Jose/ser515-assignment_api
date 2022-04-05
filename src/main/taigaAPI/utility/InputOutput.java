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
            bufferedReader.readLine();
            return  bufferedReader.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
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
