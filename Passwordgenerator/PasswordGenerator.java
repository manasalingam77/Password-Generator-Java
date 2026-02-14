package Passwordgenerator;

import java.util.Random;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    public static String generatePassword(int length, boolean useUpper,
                                          boolean useLower, boolean useNumbers,
                                          boolean useSymbols) {

        StringBuilder characterPool = new StringBuilder();

        if (useLower) characterPool.append(LOWER);
        if (useUpper) characterPool.append(UPPER);
        if (useNumbers) characterPool.append(NUMBERS);
        if (useSymbols) characterPool.append(SYMBOLS);

        if (characterPool.length() == 0) {
            return "Select at least one character type!";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
