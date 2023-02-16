package hexlet.code;

import java.util.Scanner;

class Cli {
    public static String greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
