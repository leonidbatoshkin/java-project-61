package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Utils.generateNumber;

public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGameGCD() {
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            answers[i] = String.valueOf(getGCDNumber(firstElement, secondElement));
            questions[i] = firstElement + " " + secondElement;
        }
        doGameLogic(questions, answers, DESCRIPTION);
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
