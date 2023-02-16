package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Even.playGameEven;

class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        Scanner scanner = new Scanner(System.in);
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "0":
                break;
            case "1":
                greeting();
                break;
            case "2":
                playGameEven();
                break;
            default:
                System.out.println("\nThere are no game with that number.");
        }
        scanner.close();
    }
}
