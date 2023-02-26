package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.getRoundCounter;
import static hexlet.code.Engine.setRoundCounter;
import static hexlet.code.Engine.setQuestions;
import static hexlet.code.Engine.setAnswers;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class Prime {

    private static final int DIVIDER_TWO = 2;
    private static final int DIVIDER_THREE = 3;

    public static void playGamePrime() {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (getRoundCounter() < ROUNDS_NUMBER) {
            var number = generateNumber();
            setAnswers(isPrime(number) ? "yes" : "no");
            setQuestions(String.valueOf(number));
            setRoundCounter();
        }
        doGameLogic();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; Math.pow(i, 2) <= number; i++) {
            if ((number != DIVIDER_TWO && number != DIVIDER_THREE) && (number % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
