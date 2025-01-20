package numbers.num_009;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer of minimum two digits: ");
        int num=sc.nextInt();
        if(num<10) {
            System.out.println("Error: Number must have at least two digits.");
            return;
        }
        int steps=0;
        int palindrome=num;
        while (steps<15) {
            int reverse=reverseNumber(palindrome);
            int sum=palindrome+reverse;
            if(sum==reverseNumber(sum)) {
                System.out.println("Original Number: "+num);
                System.out.println("Palindrome Number: "+sum);
                System.out.println("Found in Step: "+(steps+1));
                return;
            }else {
                palindrome=sum;
                steps++;
            }
        }
        System.out.println("Palindrome not found within 15 steps.");
    }
    public static int reverseNumber(int num) {
        int reverse=0;
        while(num!=0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return reverse;
    }
}