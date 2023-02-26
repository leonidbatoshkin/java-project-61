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

public class Progression {
    private static final int MISSING_ELEMENT_BOTTOM_POSITION = 0;
    private static final int PROGRESSION_BOTTOM_BORDER = 5;
    private static final int PROGRESSION_UPPER_BORDER = 10;
    private static final int PROGRESSION_LENGTH = new Random().
            nextInt(PROGRESSION_UPPER_BORDER - PROGRESSION_BOTTOM_BORDER)
            + PROGRESSION_BOTTOM_BORDER;
    private static int missingElement;

    public static void playGameProgression() {
        greeting();
        System.out.println("What number is missing in the progression?");
        while (getRoundCounter() < ROUNDS_NUMBER) {
            var step = generateNumber();
            setQuestions(String.valueOf(getProgression(step)));
            setAnswers(String.valueOf(missingElement));
            setRoundCounter();
        }
        doGameLogic();
    }

    private static String getProgression(int progressionStep) {
        var firstElement = generateNumber();
        var missingElementPosition = new Random().nextInt(PROGRESSION_LENGTH - MISSING_ELEMENT_BOTTOM_POSITION)
                + MISSING_ELEMENT_BOTTOM_POSITION;
        String progression = "";
        var secondElement = 0;
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            secondElement = firstElement + progressionStep;
            if (i == missingElementPosition) {
                progression += ".. ";
                missingElement = secondElement;
            } else {
                progression += i != PROGRESSION_LENGTH - 1 ? secondElement + " " : secondElement;
            }
            firstElement = secondElement;
        }
        return progression;
    }
}
