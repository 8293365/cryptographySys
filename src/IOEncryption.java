import java.util.Scanner;

public class IOEncryption {

    // Method to get the user's input from the prompt and return it as a String
    public String GetUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    // Method to print the encrypted message
    public void PrintEncryptedMessage(String encryptedMessage) {
        System.out.println("Encrypted message'" + encryptedMessage + "'");
    }

    // Method to request input from the user, call GetUserInput() and return the message
    public String RequestInput(String msg) {
        System.out.print(msg);
        return GetUserInput();
    }

    // A main method to test the functionality
    public static void main(String[] args) {
        String message = "Insert the string to be encrypted: ";
        IOEncryption ioEncryption = new IOEncryption();
        String result;
        result = ioEncryption.RequestInput(message);
        ioEncryption.PrintEncryptedMessage(result);
    }
}

