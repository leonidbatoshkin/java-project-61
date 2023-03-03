package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Utils.generateNumber;

public class Progression {
    private static final int MISSING_ELEMENT_BOTTOM_POSITION = 0;
    private static final int PROGRESSION_BOTTOM_BORDER = 5;
    private static final int PROGRESSION_UPPER_BORDER = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";


    public static void playGameProgression() {
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var step = generateNumber();
            var progressionLength = new Random().
                    nextInt(PROGRESSION_UPPER_BORDER - PROGRESSION_BOTTOM_BORDER)
                    + PROGRESSION_BOTTOM_BORDER;
            var missingElementPosition = new Random().nextInt(progressionLength
                    - MISSING_ELEMENT_BOTTOM_POSITION) + MISSING_ELEMENT_BOTTOM_POSITION;
            var progression = getProgression(step, progressionLength);
            questions[i] = getProgressionDescription(progression, missingElementPosition);
            answers[i] = getMissingElement(progression, missingElementPosition);
        }
        doGameLogic(questions, answers, DESCRIPTION);
    }

    private static int[] getProgression(int progressionStep, int progressionLength) {
        int[] progression = new int[progressionLength];
        progression[0] = generateNumber();
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + progressionStep;
        }
        return progression;
    }

    private static String getMissingElement(int[] integerArray, int missingElementPosition) {
        return String.valueOf(integerArray[missingElementPosition]);
    }

    private static String getProgressionDescription(int[] integerArray, int missingElementPosition) {
        String[] stringArray = new String[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            stringArray[i] = String.valueOf(integerArray[i]);
        }
        stringArray[missingElementPosition] = "..";
        return String.join(" ", stringArray);
    }
}
