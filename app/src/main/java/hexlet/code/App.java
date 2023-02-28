package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

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
        Scanner scanner = new Scanner(System.in);
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "0":
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.playGameEven();
                break;
            case "3":
                Calc.playGameCalc();
                break;
            case "4":
                GCD.playGameGCD();
                break;
            case "5":
                Progression.playGameProgression();
                break;
            case "6":
                Prime.playGamePrime();
                break;
            default:
                System.out.println("\nThere are no game with that number.");
        }
        scanner.close();
    }
}
