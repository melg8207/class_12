package strings.str_007;
import java.util.*;
public class FiboString {
    private final String x; // to store the first string
    private String y; // to store the second string
    private String z; // to store the concatenation of the previous two strings
    private int n;    // integer to store the number of terms
    // Constructor to initialize x, y, and z
    public FiboString() {
        x="a";
        y="b";
        z="ba";
    }
    // Method to input the number of terms 'n'
    public void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n=sc.nextInt();
        sc.close();
    }
    // Method to generate and print the Fibonacci strings
    public void generate() {
        if(n==1) {
            System.out.println(x);
        }else if(n==2) {
            System.out.println(y);
        }else {
            System.out.print(x+" "+y+" ");
            for(int i=3;i<=n;i++) {
                z=y+x;
                System.out.print(z+" ");
                y=z;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FiboString fibo=new FiboString();
        fibo.accept();
        fibo.generate();
    }
}