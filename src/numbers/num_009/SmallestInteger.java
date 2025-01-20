package numbers.num_009;
import java.util.Scanner;
public class SmallestInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number m (between 100 and 10000):");
        int m=sc.nextInt();
        if(m<100||m>10000) {
            System.out.println("Invalid input for m. Please enter a number between 100 and 10000.");
            return;
        }
        System.out.println("Enter a number n (less than 100):");
        int n=sc.nextInt();
        if(n>=100) {
            System.out.println("Invalid input for n. Please enter a number less than 100.");
            return;
        }
        int result=findSmallestInteger(m,n);
        System.out.println("The smallest required number whose sum of all its digits is equal to n is: "+result);
        System.out.println("Total number of digits present in the required number: "+countDigits(result));
    }
    public static int findSmallestInteger(int m,int n) {
        int num=m+1;
        while (sumOfDigits(num)!=n) {
            num++;
        }
        return num;
    }
    public static int sumOfDigits(int num) {
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static int countDigits(int num) {
        int count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
