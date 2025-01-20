package numbers.num_009;
import java.util.*;
public class COMPLEX {
    int A,B;
    double i=Math.sqrt(-1);
    static Scanner sc=new Scanner(System.in);
    COMPLEX() {
        A=0;B=0;
    }
    public void fnInput() {
        System.out.println("Input values for complex number format (A + Bi)");
        System.out.println("Enter real part (A): ");
        A=sc.nextInt();
        System.out.println("Enter imaginary part (B): ");
        B=sc.nextInt();
    }
    public void fnshow() {
        System.out.println("Complex number: ("+A+" + "+B+"i)");
    }
    public void fnAdd(COMPLEX c1, COMPLEX c2) {
        A=c1.A+c2.A;
        B=c1.B+c2.B;
        System.out.println("Sum of Complex Numbers: ("+A+" + "+B+"i)");
    }
    public static void main(String[] args) {
        COMPLEX c1=new COMPLEX();
        COMPLEX c2=new COMPLEX();
        COMPLEX c3=new COMPLEX();
        System.out.println("Enter first complex number: ");
        c1.fnInput();
        System.out.println("------------------------------------");
        System.out.println("\nEnter second complex number: ");
        c2.fnInput();
        System.out.println("\n------------------------------------");
        System.out.println("\nFirst Complex Number: ");
        c1.fnshow();
        System.out.println("Second Complex Number: ");
        c2.fnshow();
        System.out.println("\nSum of Two Complex Numbers: ");
        c3.fnAdd(c1,c2);
    }
}
