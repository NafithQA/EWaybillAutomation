package eWaybill.helpers;

import java.security.SecureRandom;

public class PasswordGenerator {
        // Define the character sets for lowercase letters, uppercase letters, digits, and special symbols.
        private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
        private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String DIGITS = "0123456789";
        private static final String SPECIAL_SYMBOLS = "!@#$%^&*()_-+=[]{}|;:,.<>?";

        // Define the method to generate a random password.
        public static String generateRandomPassword(int length) {
            // Create a StringBuilder to store the password.
            StringBuilder password = new StringBuilder();

            // Initialize a SecureRandom instance for generating random characters.
            SecureRandom random = new SecureRandom();

            // Ensure that the password contains at least one character from each character set.
            password.append(LOWERCASE_LETTERS.charAt(random.nextInt(LOWERCASE_LETTERS.length())));
            password.append(UPPERCASE_LETTERS.charAt(random.nextInt(UPPERCASE_LETTERS.length())));
            password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
            password.append(SPECIAL_SYMBOLS.charAt(random.nextInt(SPECIAL_SYMBOLS.length())));

            // Generate the remaining characters in the password.
            for (int i = 4; i < length; i++) {
                // Combine all character sets into one string for random selection.
                String allCharacters = LOWERCASE_LETTERS + UPPERCASE_LETTERS + DIGITS + SPECIAL_SYMBOLS;
                password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
            }

            // Shuffle the characters in the password to randomize their order.
            String shuffledPassword = shuffleString(password.toString());

            return shuffledPassword;
        }

        // Helper method to shuffle a string.
        private static String shuffleString(String input) {
            char[] characters = input.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                int randomIndex = (int) (Math.random() * characters.length);
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
            return new String(characters);
        }

        public static void main(String[] args) {
            int passwordLength = 12; // Change this value to the desired password length.
            String randomPassword = generateRandomPassword(passwordLength);
            System.out.println("Random Password: " + randomPassword);
        }
    }