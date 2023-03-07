package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.QUESTION_INDEX;
import static hexlet.code.Engine.ANSWER_INDEX;
import static hexlet.code.Utils.generateNumber;

public class Prime {

    private static final int DIVIDER_TWO = 2;
    private static final int DIVIDER_THREE = 3;
    private static final int GAME_DATA_COUNT = 2;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGamePrime() {
        String[][] gameData = new String[ROUNDS_NUMBER][GAME_DATA_COUNT];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var number = generateNumber();
            gameData[i][QUESTION_INDEX] = String.valueOf(number);
            gameData[i][ANSWER_INDEX] = isPrime(number) ? "yes" : "no";
        }
        doGameLogic(gameData, DESCRIPTION);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; Math.pow(i, 2) <= number; i++) {
            if (number != DIVIDER_TWO && number != DIVIDER_THREE && number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
