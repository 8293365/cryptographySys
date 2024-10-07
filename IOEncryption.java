import java.util.Scanner;

public class IOEncryption {

    // Method to get the user's input from the prompt and return it as a String
    public String GetUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Method to print the encrypted message
    public void PrintEncryptedMessage(String encryptedMessage) {
        System.out.println("The encrypted message is the following: '" + encryptedMessage + "'");
    }

    // Method to request input from the user, call GetUserInput() and return the message
    public String RequestInput() {
        System.out.print("Insert the message to be encrypted: ");
        return GetUserInput();

    }
    // A main method to test the functionality
    public static void main(String[] args) {
        IOEncryption ioEncryption = new IOEncryption();
        String result;
        result = ioEncryption.RequestInput();
        ioEncryption.PrintEncryptedMessage(result);
    }
}

