package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.roundCounter;
import static hexlet.code.Engine.answers;
import static hexlet.code.Engine.questions;

public class GCD {
    public static void playGameGCD() {
        greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (roundCounter < ROUNDS_NUMBER) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            answers[roundCounter] = String.valueOf(getGCDNumber(firstElement, secondElement));
            questions[roundCounter] = firstElement + " " + secondElement;
            roundCounter++;
        }
        doGameLogic();
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
