package strings.str_007;
import java.util.*;
public class StringOp{
    String str;
    String msk;
    String nstr;
    public StringOp() {
        str="";
        msk="";
        nstr="";
    }
    public void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.print("ORIGINAL STRING: ");
        str=sc.nextLine().toLowerCase();
        System.out.print("MASK STRING: ");
        msk=sc.nextLine().toLowerCase();
    }
    public void form() {
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(msk.indexOf(ch)==-1)
                nstr+=ch;
        }
    }
    public void display() {
        System.out.println();
        System.out.println("ORIGINAL STRING: "+str);
        System.out.println("NEWLY FORMED STRING: "+nstr);
    }
    public static void main(String[] args) {
        StringOp obj=new StringOp();
        obj.accept();
        obj.form();
        obj.display();
    }
}
