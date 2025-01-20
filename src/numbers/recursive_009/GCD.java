package numbers.recursive_009;
import java.io.*;
public class GCD {
    int r1,r2;
    // Recursive method to find GCD of two numbers
    int findGCD(int x,int y) {
        if(y==0) {
            return x;
        }
        return findGCD(y,x%y);
    }
    // Recursive method to calculate the sum of natural numbers up to n
    int sumNatural(int n) {
        if(n==0) {
            return 0;
        }
        return n+sumNatural(n-1);
    }
    // Method to print results
    void displayResults() {
        System.out.println("GCD of "+r1+" and "+r2+": "+findGCD(r1, r2));
        System.out.println("Sum of natural numbers up to "+r2+": "+sumNatural(r2));
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        GCD obj=new GCD();
        // Input values for r1 and r2
        System.out.print("Enter first number: ");
        obj.r1=Integer.parseInt(br.readLine());
        System.out.print("Enter second number: ");
        obj.r2=Integer.parseInt(br.readLine());
        // Display the results of recursive operations
        obj.displayResults();
    }
}