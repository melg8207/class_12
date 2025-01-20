package strings.str_007;
import java.util.*;
public class Change {
    String str;
    String newstr;
    int len;
    Change() {
        str="";
        newstr="";
        len=0;
    }
    void inputword() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        str=sc.next();
        len=str.length();
    }
    char caseconvert(char ch) {
        if(Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch);
        }else {
            return Character.toLowerCase(ch);
        }
    }
    void recchange(int i) {
        if(i<len) {
            newstr+=caseconvert(str.charAt(i));
            recchange(i+1);
        }
    }
    void display() {
        System.out.println("Original word: "+str);
        System.out.println("Changed word: "+newstr);
    }
    public static void main(String[] args) {
        Change obj=new Change();
        obj.inputword();
        obj.recchange(0);
        obj.display();
    }
}