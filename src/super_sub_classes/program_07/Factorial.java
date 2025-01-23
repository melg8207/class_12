package super_sub_classes.program_07;
import java.util.*;
public class Factorial extends Series {
    public Factorial(int n) {
        super(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        Factorial obj=new Factorial(num);
        System.out.println();
        obj.calsum();
        obj.display();
    }
}
