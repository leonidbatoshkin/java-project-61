package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static void doGameLogic(String[] questions, String[] answers, String description) {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.print("Question: " + questions[i] + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'.\nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
