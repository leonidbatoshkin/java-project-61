package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;

class Even {
    static final int BOTTOM_BORDER = 0; // Minimum value of range
    static final int UPPER_BORDER = 100; // Maximum value of range
    private static int successCounter = 0;
    private static final String USER_NAME = greeting();

    public static void playGameEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (successCounter < 3) {
            isEven(generateNumber());
        }
        System.out.println("Congratulations, " + USER_NAME + "!");
    }

    private static int generateNumber() {
        int questionNumber = (int) Math.floor(Math.random() * (UPPER_BORDER - BOTTOM_BORDER + 1) + BOTTOM_BORDER);
        System.out.print("Question: " + questionNumber + "\nYour answer: ");
        return questionNumber;
    }

    private static void isEven(int number) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if ((number) % 2 == 0 && answer.equals("yes") || (number) % 2 != 0 && answer.equals("no")) {
            successCounter++;
            System.out.println("Correct!");
        } else {
            var wrongAnswer = answer.equals("yes") ? "no" : "yes";
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + wrongAnswer + "'.\n"
                    + "Let's try again, " + USER_NAME + "!");
            System.exit(0);
        }
    }
}
