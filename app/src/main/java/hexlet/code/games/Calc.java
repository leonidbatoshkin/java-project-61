package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.getRoundCounter;
import static hexlet.code.Engine.setRoundCounter;
import static hexlet.code.Engine.setQuestions;
import static hexlet.code.Engine.setAnswers;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class Calc {
    public static void playGameCalc() {
        greeting();
        System.out.println("What is the result of the expression?");
        while (getRoundCounter() < ROUNDS_NUMBER) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            var operation = generateOperation();
            if (operation == '+') {
                setAnswers(String.valueOf(firstElement + secondElement));
            } else {
                setAnswers(String.valueOf(firstElement * secondElement));
            }
            setQuestions(firstElement + " " + operation + " " + secondElement);
            setRoundCounter();
        }
        doGameLogic();
    }

    private static char generateOperation() {
        char[] operationList = {'+', '*'};
        var index = new Random().nextInt(operationList.length);
        return operationList[index];
    }
}
