package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.QUESTION_INDEX;
import static hexlet.code.Engine.ANSWER_INDEX;
import static hexlet.code.Utils.generateNumber;

public class GCD {
    private static final int GAME_DATA_COUNT = 2;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGameGCD() {
        String[][] gameData = new String[ROUNDS_NUMBER][GAME_DATA_COUNT];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            gameData[i][QUESTION_INDEX] = firstElement + " " + secondElement;
            gameData[i][ANSWER_INDEX] = String.valueOf(getGCDNumber(firstElement, secondElement));
        }
        doGameLogic(gameData, DESCRIPTION);
    }

    private static int getGCDNumber(int firstNumber, int secondNumber) {
        var minNumber = Math.min(firstNumber, secondNumber);
        var modulo = minNumber == firstNumber ? secondNumber % firstNumber : firstNumber % secondNumber;
        var dividend = 0;
        while (modulo > 0) {
            dividend = modulo;
            modulo = minNumber % modulo;
            minNumber = dividend;
        }
        return minNumber;
    }
}
