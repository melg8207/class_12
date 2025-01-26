package strings.cryptography_007;
import java.util.*;
public class CaesarCipher {
    //shifting each letter by specified no of positions
    public static String encrypt(String str, int shift) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);                              // using ASCII characters
            if(Character.isLetter(ch)) {
                char base=Character.isLowerCase(ch)?'a':'A';    // base value for lowercase is 'a' and for uppercase is 'A'
                ch=(char)((ch-base+shift)%26+base);
                /* To determine cipher characters
                 * 1. Base value subtracted from ASCII range to normalize it to 0-25 range
                 * 2. Normalized value shifted by specified amount
                 * 3. Modulus 26 to ensure it wraps around within the alphabet range
                 * 4. Base value added back to convert normalized value back to ASCII range of letters
                 */
            }
            result.append(ch);
        }
        return result.toString();                               // converting it from StringBuilder to String
    }
    // reverse the shift to get decrypted text
    public static String decrypt(String str,int shift) {
        return encrypt(str,26-shift);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter shifting value for each character: ");
        int shift=sc.nextInt();
        sc.nextLine();                                          // consuming leftover new line
        System.out.println("Encrypt or Decrypt?: ");
        String choice=sc.nextLine();
        // Handling InputMismatchException
        try {
            if(choice.equalsIgnoreCase("encrypt")) {
                System.out.println("Enter a sentence: ");
                String str=sc.nextLine();
                System.out.println("Input Sentence: "+str);
                System.out.println("Encrypted : "+encrypt(str,shift));
            }else if(choice.equalsIgnoreCase("decrypt")) {
                System.out.println("Enter encrypted message: ");
                String str=sc.nextLine();
                System.out.println("Input Sentence: "+str);
                System.out.println("Decrypted: "+decrypt(str,shift));
            }else {
                System.out.println("Invalid choice!");
            }
        }catch(InputMismatchException e) {
            System.err.println(e);
        }
    }
}
