package hexlet.code.games;

import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Utils.generateNumber;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGameEven() {
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var number = generateNumber();
            answers[i] = isEven(number) ? "yes" : "no";
            questions[i] = String.valueOf(number);
        }
        doGameLogic(questions, answers, DESCRIPTION);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
