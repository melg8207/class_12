package numbers.num_009;
import java.util.*;
public class Number {
    long num;
    int[] freq;
    int sum;
    Number() {
        num=0L;
        freq=new int[10];
        sum=0;
    }
    Number(long n) {
        n=num;
    }
    void digitFrequency() {
        while(num>0) {
            int dig=(int)(num%10);
            freq[dig]++;
            num/=10;
        }
        System.out.println("Digit Frequencies: ");
        for(int i=0;i<10;i++) {
            if(freq[i]>0)
                System.out.println(i+": "+freq[i]);
        }
    }
    int sumDigits(long n) {
        while(n>0) {
            int dig=(int)(n%10);
            sum+=dig;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Number obj=new Number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        obj.num=sc.nextInt();
        System.out.println();
        obj.digitFrequency();
        System.out.println("Sum of digits: "+obj.sumDigits(obj.num));
    }
}
