package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    private static String userName;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int BOTTOM_BORDER = 1; // Minimum value of range
    private static final int UPPER_BORDER = 20; // Maximum value of range

    public static int generateNumber() {
        return new Random().nextInt(UPPER_BORDER - BOTTOM_BORDER) + BOTTOM_BORDER;
    }

    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void doGameLogic(String[] questions, String[] answers, String description) {
        System.out.println(description);
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.print("Question: " + questions[i] + "\nYour answer: ");
            String userAnswer = SCANNER.next();
            if (userAnswer.equals(answers[i])) {
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
