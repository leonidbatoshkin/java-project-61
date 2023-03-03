package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Utils.generateNumber;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void playGameCalc() {
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            var operation = generateOperation();
            answers[i] = String.valueOf(calculate(firstElement, secondElement, operation));
            questions[i] = firstElement + " " + operation + " " + secondElement;
        }
        doGameLogic(questions, answers, DESCRIPTION);
    }

    private static char generateOperation() {
        char[] operationList = {'+', '*'};
        var index = new Random().nextInt(operationList.length);
        return operationList[index];
    }

    private static int calculate(int firstElement, int secondElement, char operation) {
        switch (operation) {
            case '+' -> {
                return firstElement + secondElement;
            }
            case '*' -> {
                return firstElement * secondElement;
            }
            default -> {
                return 0;
            }
        }
    }
}
