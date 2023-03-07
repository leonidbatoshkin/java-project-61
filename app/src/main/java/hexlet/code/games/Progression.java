package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.QUESTION_INDEX;
import static hexlet.code.Engine.ANSWER_INDEX;
import static hexlet.code.Utils.generateNumber;

public class Progression {
    private static final int MISSING_ELEMENT_BOTTOM_POSITION = 0;
    private static final int PROGRESSION_BOTTOM_BORDER = 5;
    private static final int PROGRESSION_UPPER_BORDER = 10;
    private static final int GAME_DATA_COUNT = 2;
    private static final String DESCRIPTION = "What number is missing in the progression?";


    public static void playGameProgression() {
        String[][] gameData = new String[ROUNDS_NUMBER][GAME_DATA_COUNT];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var firstElement = generateNumber();
            var step = generateNumber();
            var progressionLength = generateNumber(PROGRESSION_BOTTOM_BORDER, PROGRESSION_UPPER_BORDER);
            var missingElementPosition = generateNumber(MISSING_ELEMENT_BOTTOM_POSITION, progressionLength);
            var progression = getProgression(firstElement, step, progressionLength);
            gameData[i][QUESTION_INDEX] = getProgressionDescription(progression, missingElementPosition);
            gameData[i][ANSWER_INDEX] = getMissingElement(progression, missingElementPosition);
        }
        doGameLogic(gameData, DESCRIPTION);
    }

    private static int[] getProgression(int firstElement, int progressionStep, int progressionLength) {
        int[] progression = new int[progressionLength];
        progression[0] = firstElement;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = firstElement + i * progressionStep;
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
