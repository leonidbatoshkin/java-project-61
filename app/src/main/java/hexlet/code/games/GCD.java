package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.getRoundCounter;
import static hexlet.code.Engine.setRoundCounter;
import static hexlet.code.Engine.setQuestions;
import static hexlet.code.Engine.setAnswers;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class GCD {
    public static void playGameGCD() {
        greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (getRoundCounter() < ROUNDS_NUMBER) {
            var firstElement = generateNumber();
            var secondElement = generateNumber();
            setAnswers(String.valueOf(getGCDNumber(firstElement, secondElement)));
            setQuestions(firstElement + " " + secondElement);
            setRoundCounter();
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
