package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Utils.generateNumber;

public class Prime {

    private static final int DIVIDER_TWO = 2;
    private static final int DIVIDER_THREE = 3;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGamePrime() {
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var number = generateNumber();
            answers[i] = isPrime(number) ? "yes" : "no";
            questions[i] = String.valueOf(number);
        }
        doGameLogic(questions, answers, DESCRIPTION);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; Math.pow(i, 2) <= number; i++) {
            if (number != DIVIDER_TWO && number != DIVIDER_THREE && number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }
}
