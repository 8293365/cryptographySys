public class ROT13Encryption {

    // Method to apply ROT13 encryption to the input string
    public static String encrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (char character : input.toCharArray()) {
            // Check if character is an uppercase letter
            if (character >= 'A' && character <= 'Z') {
                result.append((char) ('A' + (character - 'A' + 13) % 26));
            }
            // Check if character is a lowercase letter
            else if (character >= 'a' && character <= 'z') {
                result.append((char) ('a' + (character - 'a' + 13) % 26));
            }
            // If it's not a letter, keep the character as it is
            else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String decrypt(String encrypted) {
        StringBuilder result = new StringBuilder();

        for (char character : encrypted.toCharArray()) {
            // Check if character is an uppercase letter
            if (character >= 'A' && character <= 'Z') {
                result.append((char) ('A' + (character - 'A' - 13) % 26));
            }
            // Check if character is a lowercase letter
            else if (character >= 'a' && character <= 'z') {
                result.append((char) ('a' + (character - 'a' - 13) % 26));
            }
        }
        return result.toString();
    }
}
