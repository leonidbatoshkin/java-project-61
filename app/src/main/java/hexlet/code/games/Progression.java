package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
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
        Engine.greeting();
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        var description = "What number is missing in the progression?";
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var step = generateNumber();
            questions[i] = String.valueOf(getProgression(step));
            answers[i] = String.valueOf(missingElement);
        }
        doGameLogic(questions, answers, description);
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
