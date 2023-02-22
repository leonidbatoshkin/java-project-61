package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateQuestion;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.roundCounter;
import static hexlet.code.Engine.answers;
import static hexlet.code.Engine.questions;

public class Even {

    public static void playGameEven() {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (roundCounter < ROUNDS_NUMBER) {
            var question = generateQuestion();
            answers[roundCounter] = question % 2 == 0 ? "yes" : "no";
            questions[roundCounter] = String.valueOf(question);
            roundCounter++;
        }
        doGameLogic();
    }
}
