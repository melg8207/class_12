package strings.str_007;
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sentence (ending with ., ? or !): ");
        String s=in.nextLine();
        if(s.isEmpty()) {
            System.out.println("INVALID INPUT");
            return;
        }
        char last=s.charAt(s.length()-1);
        if(".?!".indexOf(last)==-1) {
            System.out.println("INVALID INPUT");
            return;
        }
        String shortest=s;
        String longest="";
        boolean isPangram=true;
        for(char ch='a';ch<='z';ch++) {
            boolean match=false;
            for(int i=0; i<s.length();i++) {
                if(ch==Character.toLowerCase(s.charAt(i))) {
                    match=true;
                    break;
                }
            }
            if(!match) {
                isPangram=false;
                break;
            }
        }
        if(isPangram)
            System.out.println("IT IS A PANGRAM");
        else
            System.out.println("IT IS NOT A PANGRAM");
        String word="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                word+=ch;
            else {
                if(word.length()>longest.length())
                    longest=word;
                if(word.length()<shortest.length())
                    shortest=word;
                word="";
            }
        }
        System.out.println("LONGEST WORD: "+longest);
        System.out.println("SHORTEST WORD: "+shortest);
    }
}