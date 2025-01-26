package strings.cryptography_007;
import java.util.*;
public class CaesarCipher2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        if(s.length()<=3&&s.length()>=10) {
            System.out.println("Invalid String! Input a string of length between 3 to 10.");
        }else {
            System.out.println("\nPlain Text: "+s);
            System.out.println("Cipher Text: "+cipher(s));
        }
    }
    public static String cipher(String s) {
        char ch;int a;String f="";
        for(int i=0;i<=s.length()-1;i++) {
            ch=s.charAt(i);
            if(Character.isLetter(ch)) {
                a=ch+13;
                if((Character.isUpperCase(ch)&&a>90)||(Character.isLowerCase(ch)&&a>122)) {
                    a=a-26;
                }
                ch=(char)a;
            }
            f=f+ch;
        }
        return f;
    }
}
