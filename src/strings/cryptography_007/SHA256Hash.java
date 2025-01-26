package strings.cryptography_007;
import java.security.MessageDigest;
import java.util.Scanner;
public class SHA256Hash {
    static String hash(String text)throws Exception {
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        byte[] digest=md.digest(text.getBytes());
        StringBuilder sb=new StringBuilder();
        for(byte b:digest)sb.append(String.format("%02x",b));
        return sb.toString();
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text to hash: ");
        String text=sc.nextLine();
        System.out.println("SHA-256 Hash: "+hash(text));
    }
}
