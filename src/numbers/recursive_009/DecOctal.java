package numbers.recursive_009;
import java.util.*;
public class DecOctal {
    long n,oct;
    static Scanner sc=new Scanner(System.in);
    public DecOctal() {
        n=0;oct=0;
    }
    public DecOctal(int nn) {
        n=nn;
    }
    public void readDec() {
        System.out.print("Enter a decimal number: ");
        n=sc.nextLong();
    }
    public void readOct() {
        System.out.print("Enter an octal number: ");
        oct=sc.nextLong();
    }
    public long deci_oct(long num) {
        if(num==0)
            return 0;
        else
            return (num%8)+10*deci_oct(num/8);
    }
    public long oct_deci(long num) {
        if(num==0)
            return 0;
        else
            return (num%10)+8*oct_deci(num/10);
    }
    public void displayoct() {
        oct=deci_oct(n);
        System.out.println("Decimal: "+n+"\nOctal: "+oct);
    }
    public void displaydec() {
        n=oct_deci(oct);
        System.out.println("Octal: "+oct+"\nDecimal: "+n);
    }
    public static void main(String[] args) {
        DecOctal obj=new DecOctal();
        while(true) {
            System.out.println("---- Octal <--> Decimal Calculator ----");
            System.out.println("1. Decimal to Octal");
            System.out.println("2. Octal to Decimal");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    obj.readDec();
                    obj.displayoct();
                    break;
                case 2:
                    obj.readOct();
                    obj.displaydec();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input! Try Again!");
            }
        }
    }
}
