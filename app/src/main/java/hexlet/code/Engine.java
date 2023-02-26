package hexlet.code;

import java.util.Random;

import static hexlet.code.App.getScanner;
import static hexlet.code.Cli.getUserName;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    private static int roundCounter = 0;

    private static String[] questions = new String[ROUNDS_NUMBER];
    private static String[] answers = new String[ROUNDS_NUMBER];
    private static final int BOTTOM_BORDER = 1; // Minimum value of range
    private static final int UPPER_BORDER = 20; // Maximum value of range

    private static int successCounter = 0;

    public static String[] getQuestions() {
        return questions;
    }

    public static void setQuestions(String question) {
        questions[roundCounter] = question;
    }

    public static String[] getAnswers() {
        return answers;
    }

    public static void setAnswers(String answer) {
        answers[roundCounter] = answer;
    }

    public static int getRoundCounter() {
        return roundCounter;
    }

    public static void setRoundCounter() {
        roundCounter += 1;
    }

    public static int generateNumber() {
        return new Random().nextInt(UPPER_BORDER - BOTTOM_BORDER) + BOTTOM_BORDER;
    }

    public static void doGameLogic() {
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.print("Question: " + questions[successCounter] + "\nYour answer: ");
            String userAnswer = getScanner().next();
            if (userAnswer.equals(answers[i])) {
                successCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + getUserName() + "' is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'.\nLet's try again, " + getUserName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + getUserName() + "!");
    }
}
