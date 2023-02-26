package hexlet.code.games;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Engine.generateNumber;
import static hexlet.code.Engine.doGameLogic;
import static hexlet.code.Engine.getRoundCounter;
import static hexlet.code.Engine.setRoundCounter;
import static hexlet.code.Engine.setQuestions;
import static hexlet.code.Engine.setAnswers;
import static hexlet.code.Engine.ROUNDS_NUMBER;

public class Even {

    public static void playGameEven() {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (getRoundCounter() < ROUNDS_NUMBER) {
            var question = generateNumber();
            setAnswers(question % 2 == 0 ? "yes" : "no");
            setQuestions(String.valueOf(question));
            setRoundCounter();
        }
        doGameLogic();
    }
}
