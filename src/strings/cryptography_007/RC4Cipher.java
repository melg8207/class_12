package strings.cryptography_007;
import java.util.Scanner;
public class RC4Cipher {
    static byte[] encryptDecrypt(byte[] text,byte[] key) {
        byte[] s=new byte[256];
        for(int i=0;i<256;i++)s[i]=(byte)i;
        int j=0;
        for(int i=0;i<256;i++) {
            j=(j+s[i]+key[i%key.length])&255;
            byte temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        int i=0;j=0;
        byte[] result=new byte[text.length];
        for(int k=0;k<text.length;k++) {
            i=(i+1)&255;
            j=(j+s[i])&255;
            byte temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            result[k]=(byte)(text[k]^s[(s[i]+s[j])&255]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("Encrypt or Decrypt?: ");
        System.out.print("Enter your choice: ");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")) {
            System.out.print("Enter key: ");
            String key=sc.nextLine();
            System.out.print("Enter text to encrypt: ");
            String text=sc.nextLine();
            byte[] encrypted=encryptDecrypt(text.getBytes(),key.getBytes());
            System.out.println("Encrypted: "+new String(encrypted));
        }else if(choice.equalsIgnoreCase("decrypt")) {
            System.out.print("Enter text to decrypt: ");
            String text=sc.nextLine();
            System.out.print("Enter key: ");
            String key=sc.nextLine();
            byte[] decrypted=encryptDecrypt(text.getBytes(),key.getBytes());
            System.out.println("Decrypted: "+new String(decrypted));
        }else {
            System.out.println("Invalid choice!");
        }
    }
}