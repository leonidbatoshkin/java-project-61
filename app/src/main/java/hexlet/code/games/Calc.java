package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class Calc {
    public static void playGameCalc() {
        Engine.greeting();
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        var description = "What is the result of the expression?";
        var operation = generateOperation();
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var question = generateNumber();
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            if (operation == '+') {
                answers[i] = String.valueOf(firstElement + secondElement);
            } else {
                answers[i] = String.valueOf(firstElement * secondElement);
            }
            questions[i] = firstElement + " " + operation + " " + secondElement;
        }
        doGameLogic(questions, answers, description);
    }

    private static char generateOperation() {
        char[] operationList = {'+', '*'};
        var index = new Random().nextInt(operationList.length);
        return operationList[index];
    }
}
