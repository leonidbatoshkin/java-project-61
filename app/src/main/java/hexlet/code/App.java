package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;
import static hexlet.code.games.Calc.playGameCalc;
import static hexlet.code.games.Even.playGameEven;
import static hexlet.code.games.GCD.playGameGCD;
import static hexlet.code.games.Progression.playGameProgression;
import static hexlet.code.games.Prime.playGamePrime;

public class App {
    public static Scanner scanner;

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        scanner = new Scanner(System.in);
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
            case "3":
                playGameCalc();
                break;
            case "4":
                playGameGCD();
                break;
            case "5":
                playGameProgression();
                break;
            case "6":
                playGamePrime();
                break;
            default:
                System.out.println("\nThere are no game with that number.");
        }
        scanner.close();
    }
}
