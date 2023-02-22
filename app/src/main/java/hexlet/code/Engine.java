package hexlet.code;

import java.util.Random;

import static hexlet.code.App.scanner;
import static hexlet.code.Cli.userName;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    public static int roundCounter = 0;

    public static String[] questions = new String[3];
    public static String[] answers = new String[3];
    private static final int BOTTOM_BORDER = 1; // Minimum value of range
    private static final int UPPER_BORDER = 20; // Maximum value of range

    private static int successCounter = 0;


    public static int generateNumber() {
        return new Random().nextInt(UPPER_BORDER - BOTTOM_BORDER) + BOTTOM_BORDER;
    }

    public static char generateOperation() {
        char[] operationList = {'+', '*'};
        var index = new Random().nextInt(operationList.length);
        return operationList[index];
    }

    public static void doGameLogic() {
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.print("Question: " + questions[successCounter] + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(answers[i])) {
                successCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'.\nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
