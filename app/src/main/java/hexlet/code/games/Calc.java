package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.generateOperation;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.roundCounter;
import static hexlet.code.Engine.answers;
import static hexlet.code.Engine.questions;

public class Calc {
    public static void playGameCalc() {
        greeting();
        System.out.println("What is the result of the expression?");
        while (roundCounter < ROUNDS_NUMBER) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            var operation = generateOperation();
            if (operation == '+') {
                answers[roundCounter] = String.valueOf(firstElement + secondElement);
            } else {
                answers[roundCounter] = String.valueOf(firstElement * secondElement);
            }
            questions[roundCounter] = firstElement + " " + operation + " " + secondElement;
            roundCounter++;
        }
        doGameLogic();
    }
}
