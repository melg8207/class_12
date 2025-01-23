package super_sub_classes.program_02;
import java.util.Scanner;
public class Calculate {
    static int n1,n2;
    static Scanner sc=new Scanner(System.in);
    void accept() {
        System.out.println("Enter two integers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
    }
    void display() {
        System.out.println("Input Numbers: "+n1+", "+n2);
    }
}
