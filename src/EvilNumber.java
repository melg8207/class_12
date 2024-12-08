import java.util.*;
public class EvilNumber {
    public String toBinary(int n) {
        String b="";
        while(n>0) {
            int r=n%2;
            b=r+b;
            n/=2;
        }
        return b;
    }
    public static void main(String[] args) {
        EvilNumber obj=new EvilNumber();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (between 2 and 100): ");
        int n=sc.nextInt();
        if(n>2||n<100) {
            String bin=obj.toBinary(n);
            System.out.println();
            System.out.println("BINARY EQUIVALENT: "+bin);
            System.out.println();
            int c=0;
            for(int i=0;i<bin.length();i++) {
                if(bin.charAt(i)=='1') {
                    c++;
                }
            }
            if(c%2==0) {
                System.out.println(n+" is an Evil Number");
            }else {
                System.out.println(n+" is not an Evil Number");
            }
        }else {
            System.out.println("Number out of range.");
        }
    }
}