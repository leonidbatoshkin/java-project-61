package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.roundCounter;
import static hexlet.code.Engine.answers;
import static hexlet.code.Engine.questions;

public class Prime {
    public static void playGamePrime() {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (roundCounter < ROUNDS_NUMBER) {
            var number = generateNumber();
            answers[roundCounter] = isPrime(number) ? "yes" : "no";
            questions[roundCounter] = String.valueOf(number);
            roundCounter++;
        }
        doGameLogic();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; Math.pow(i, 2) <= number; i++) {
            if ((number != 2 && number != 3) && (number % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
