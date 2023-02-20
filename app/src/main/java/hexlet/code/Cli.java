package hexlet.code;

import static hexlet.code.App.scanner;

public class Cli {
    public static String userName;

    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
