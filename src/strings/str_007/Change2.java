package strings.str_007;
import java.util.Scanner;
public class Change2 {
    String wrd,newwrd;
    public Change2() {
        wrd="";newwrd="";
    }
    public void readwrd() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        wrd=sc.nextLine().toUpperCase();
    }
    public void freq_vow_con() {
        int c=0,v=0;
        for(int i=0;i<wrd.length();i++) {
            char ch=wrd.charAt(i);
            if("AEIOU".indexOf(ch)>=0)
                v++;
            else
                c++;
        }
    }
    public void arrange() {
        String v="",c="";
        for(int i=0;i<wrd.length();i++) {
            char ch=wrd.charAt(i);
            if("AEIOU".indexOf(ch)>=0)
                v+=ch;
            else
                c+=ch;
            newwrd=v+c;
        }
    }
    public void display() {
        System.out.println("Original Word: "+wrd);
        System.out.println("Rearranged Word: "+newwrd);
    }
    public static void main(String[] args) {
        Change2 obj=new Change2();
        obj.readwrd();
        obj.arrange();
        obj.display();
    }
}
