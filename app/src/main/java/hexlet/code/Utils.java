package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int BOTTOM_BORDER = 1; // Minimum value of range
    private static final int UPPER_BORDER = 20; // Maximum value of range

    public static int generateNumber() {
        return new Random().nextInt(UPPER_BORDER - BOTTOM_BORDER) + BOTTOM_BORDER;
    }

    public static int generateNumber(int bottomBorder, int upperBorder) {
        return new Random().nextInt(upperBorder - bottomBorder) + bottomBorder;
    }
}
