package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.QUESTION_INDEX;
import static hexlet.code.Engine.ANSWER_INDEX;
import static hexlet.code.Utils.generateNumber;

public class Calc {
    private static final char[] OPERATION_LIST = {'+', '*', '-'};
    private static final int GAME_DATA_COUNT = 2;
    private static final int BOTTOM_BORDER = 0; // Minimum value of range
    private static final int UPPER_BORDER = OPERATION_LIST.length; // Maximum value of range
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void playGameCalc() {
        String[][] gameData = new String[ROUNDS_NUMBER][GAME_DATA_COUNT];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            var operation = generateOperation();
            gameData[i][QUESTION_INDEX] = firstElement + " " + operation + " " + secondElement;
            gameData[i][ANSWER_INDEX] = String.valueOf(calculate(firstElement, secondElement, operation));
        }
        doGameLogic(gameData, DESCRIPTION);
    }

    private static char generateOperation() {
        var index = generateNumber(BOTTOM_BORDER, UPPER_BORDER);
        return OPERATION_LIST[index];
    }

    private static int calculate(int firstElement, int secondElement, char operation) {
        switch (operation) {
            case '+' -> {
                return firstElement + secondElement;
            }
            case '-' -> {
                return firstElement - secondElement;
            }
            case '*' -> {
                return firstElement * secondElement;
            }
            default -> {
                System.out.println("No logic defined for \"" + operation + "\" operator");
                return 0;
            }
        }
    }
}
