package hexlet.code;

import static hexlet.code.App.getScanner;

public class Cli {
    private static String userName;

    public static String getUserName() {
        return userName;
    }
    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        userName = getScanner().next();
        System.out.println("Hello, " + userName + "!");
    }
}
