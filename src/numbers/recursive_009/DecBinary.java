package numbers.recursive_009;
import java.util.Scanner;
public class DecBinary {
    long bin;long dec;
    static Scanner sc=new Scanner(System.in);
    public DecBinary() {
        bin=0;dec=0;
    }
    public void readDec() {
        System.out.print("Enter a decimal number: ");
        dec=sc.nextLong();
    }
    public void readBin() {
        System.out.print("Enter a binary number: ");
        bin=sc.nextLong();
    }
    public long convertBin(long n) {
        if(n==0) {
            return 0;
        }else {
            return (n%2)+10*convertBin(n/2);
        }
    }
    public long convertDec(long n) {
        if(n==0) {
            return 0;
        }else {
            return (n%10)+2*convertDec(n/10);
        }
    }
    public void ShowBin() {
        bin=convertBin(dec);
        System.out.println("Decimal number: "+dec);
        System.out.println("Equivalent binary number: "+bin);
    }
    public void ShowDec() {
        dec=convertDec(bin);
        System.out.println("Binary number: "+bin);
        System.out.println("Equivalent decimal number: "+dec);
    }
    public static void main(String[] args) {
        DecBinary ob=new DecBinary();
        while(true) {
            System.out.println("---- Binary <--> Decimal Calculator ----");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    ob.readDec();
                    ob.ShowBin();
                    break;
                case 2:
                    ob.readBin();
                    ob.ShowDec();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input! Try Again!");
            }
        }
    }
}