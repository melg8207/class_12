package strings.cryptography_007;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
public class AESCipher {
    // Method to encrypt the input text using the given AES key
    static byte[] encrypt(String text,SecretKey key)throws Exception {
        Cipher cipher=Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,key);                   // Initialize cipher in encryption mode
        return cipher.doFinal(text.getBytes());                 // Perform encryption
    }
    // Method to decrypt the input byte array using the given AES key
    static String decrypt(byte[] text,SecretKey key)throws Exception {
        Cipher cipher=Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE,key);                   // Initialize cipher in decryption mode
        return new String(cipher.doFinal(text));                // Perform decryption
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        // Prompt the user to choose encryption or decryption
        System.out.println("Choose an option: ");
        System.out.println("Encrypt or Decrypt?: ");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")) {
            // Encryption workflow
            System.out.print("Enter text to encrypt: ");
            String text=sc.nextLine();
            // Generating AES key
            KeyGenerator kg=KeyGenerator.getInstance("AES");
            kg.init(128);                               // Set key size to 128 bits
            SecretKey key=kg.generateKey();
            byte[] encrypted=encrypt(text,key);                 // Encrypt the input text
            // Display the encrypted text and the secret key
            System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(encrypted));
            System.out.println("Secret Key (Hex): "+Base64.getEncoder().encodeToString(key.getEncoded()));
        }else if(choice.equalsIgnoreCase("decrypt")) {
            // Decryption workflow
            System.out.print("Enter encrypted text (Base64): ");
            String encryptedText=sc.nextLine();
            System.out.print("Enter secret key (Base64): ");
            String keyInput=sc.nextLine();
            // Decode the provided Base64 encoded key and text
            byte[] decodedKey=Base64.getDecoder().decode(keyInput);
            // Reconstructing AES key
            SecretKey key=new SecretKeySpec(decodedKey,0,decodedKey.length,"AES");
            byte[] encryptedBytes=Base64.getDecoder().decode(encryptedText);
            String decrypted=decrypt(encryptedBytes,key);       // Decrypt the input text
            // Display the decrypted text
            System.out.println("Decrypted: "+decrypted);
        }else {
            // Handle invalid choice input
            System.out.println("Invalid choice!");
        }
    }
}
