package numbers.recursive_009;
import java.util.Scanner;
public class LCM {
    int r1,r2;
    // Parameterized Constructor
    LCM(int v1, int v2) {
        r1=v1;
        r2=v2;
    }
    // Prints the digits of the argument recursively
    void RC1(int one) {
        if(one==0) {
            return;
        }
        RC1(one/10);
        System.out.print(one%10+", ");
    }
    // Recursive function to find GCD
    int gcd(int x,int y) {
        if(y==0) {
            return x;
        }
        return gcd(y,x%y);
    }
    // Returns the LCM of the two arguments
    int RC2(int t1,int t2) {
        return (t1*t2)/gcd(t1,t2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int r1=sc.nextInt();
        System.out.print("Enter second number: ");
        int r2=sc.nextInt();
        LCM obj=new LCM(r1,r2);
        System.out.print("Digits of first number: ");
        obj.RC1(obj.r1);
        System.out.println();
        System.out.print("Digits of second number: ");
        obj.RC1(obj.r2);
        System.out.println();
        // Calling RC2 to find the LCM of r1 and r2
        int lcm=obj.RC2(obj.r1,obj.r2);
        System.out.println("LCM of r1 and r2: "+lcm);
    }
}
