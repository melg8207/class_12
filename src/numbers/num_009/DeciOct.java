package numbers.num_009;
import java.util.*;
public class DeciOct {
    int n,oct;
    static Scanner sc=new Scanner(System.in);
    DeciOct() {
        n=0;oct=0;
    }
    DeciOct(int nn) {
        n=nn;oct=0;
    }
    void deci_oct() {
        int t=n;int place=1;
        while(t>0) {
            int r=t%8;
            t=t/8;
            oct+=r*place;
            place*=10;
        }
    }
    void display() {
        deci_oct();
        System.out.println("Decimal: "+n+"\nOctal: "+oct);
    }
    public static void main(String[] args) {
        DeciOct obj=new DeciOct();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal number to convert it to Octal: ");
        obj.n=sc.nextInt();
        System.out.println();
        DeciOct ob1=new DeciOct(obj.n);
        ob1.display();
    }
}
