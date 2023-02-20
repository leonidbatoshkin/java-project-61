package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateQuestion;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.ROUNDS_NUMBER;
import static hexlet.code.Engine.roundCounter;

public class Even {

    public static void playGameEven() {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] questions = new String[3];
        String[] answers = new String[3];
        while (roundCounter < ROUNDS_NUMBER) {
            var question = generateQuestion();
            answers[roundCounter] = question % 2 == 0 ? "yes" : "no";
            questions[roundCounter] = String.valueOf(question);
            roundCounter++;
        }
        doGameLogic(questions, answers);
    }
}
