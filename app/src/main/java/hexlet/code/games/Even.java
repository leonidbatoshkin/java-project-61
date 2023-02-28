package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class Even {

    public static void playGameEven() {
        Engine.greeting();
        String[] answers = new String[ROUNDS_NUMBER];
        String[] questions = new String[ROUNDS_NUMBER];
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            var question = generateNumber();
            answers[i] = question % 2 == 0 ? "yes" : "no";
            questions[i] = String.valueOf(question);
        }
        doGameLogic(questions, answers, description);
    }
}
