package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.QUESTION_INDEX;
import static hexlet.code.Engine.ANSWER_INDEX;
import static hexlet.code.Utils.generateNumber;

public class Even {

    private static final int GAME_DATA_COUNT = 2;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGameEven() {
        String[][] gameData = new String[ROUNDS_NUMBER][GAME_DATA_COUNT];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var number = generateNumber();
            gameData[i][QUESTION_INDEX] = String.valueOf(number);
            gameData[i][ANSWER_INDEX] = isEven(number) ? "yes" : "no";
        }
        doGameLogic(gameData, DESCRIPTION);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
