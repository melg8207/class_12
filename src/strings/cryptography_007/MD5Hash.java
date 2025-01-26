package strings.cryptography_007;
import java.util.Scanner;
import java.security.MessageDigest;
public class MD5Hash {
    static String hash(String text)throws Exception {
        MessageDigest md=MessageDigest.getInstance("MD5");
        byte[] digest=md.digest(text.getBytes());
        StringBuilder sb=new StringBuilder();
        for(byte b:digest)sb.append(String.format("%02x",b));
        return sb.toString();
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        System.out.println("MD5 Hash: "+hash(text));
    }
}

