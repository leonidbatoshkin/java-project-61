package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void doGameLogic(String[][] gameData, String description) {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.print("Question: " + gameData[i][QUESTION_INDEX] + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(gameData[i][ANSWER_INDEX])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + gameData[i][ANSWER_INDEX] + "'.\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
