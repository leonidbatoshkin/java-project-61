package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void greeting() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
