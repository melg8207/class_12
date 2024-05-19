import java.util.Scanner;
public class Binary {
    long bin;
    long dec;
    public Binary() {
        bin=0;
        dec=0;
    }
    void readBin() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        bin=sc.nextLong();
    }
    long convertDec(long n) {
        if(n==0) {
            return 0;
        }else {
            return (n % 10)+2*convertDec(n/10);
        }
    }
    void Show() {
        dec=convertDec(bin);
        System.out.println("Binary number: "+bin);
        System.out.println("Equivalent decimal number: "+dec);
    }
    public static void main(String[] args) {
        Binary ob=new Binary();
        ob.readBin();
        ob.Show();
    }
}