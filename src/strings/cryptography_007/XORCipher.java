package strings.cryptography_007;
import java.util.*;
public class XORCipher {
    // XOR encryption/decryption function
    static String encryptDecrypt(String text,char key) {
        String result="";
        for(int i=0;i<text.length();i++) {
            // XOR each character and ensure it's printable (ASCII 32 to 126)
            result=result+(char)(text.charAt(i)^key);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Prompt user for encryption or decryption
        System.out.print("Encrypt or Decrypt?: ");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")) {
            System.out.print("Enter text: ");
            String plainText=sc.nextLine();
            System.out.print("Enter key (single char): ");
            char key=sc.next().charAt(0);
            sc.nextLine();                      // Consume the newline character
            // Encrypt the input text
            String encryptedText=encryptDecrypt(plainText,key);
            System.out.println("Encrypted String: "+encryptedText);
        }else if (choice.equalsIgnoreCase("decrypt")) {
            System.out.print("Enter encrypted text: ");
            String encryptedText=sc.nextLine();
            System.out.print("Enter key (single char): ");
            char key=sc.next().charAt(0);
            sc.nextLine();                      // Consume the newline character
            // Decrypt the input text
            String decryptedText=encryptDecrypt(encryptedText,key);
            System.out.println("Decrypted String: "+decryptedText);
        }else {
            System.out.println("Invalid choice!");
        }
    }
}