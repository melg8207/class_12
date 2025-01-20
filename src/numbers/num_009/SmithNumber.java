package numbers.num_009;
import java.util.*;
public class SmithNumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        SmithNumber obj=new SmithNumber();
        obj.checkSmithNumber();
    }
    public void checkSmithNumber() {
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isSmithNumber(n)) {
            System.out.println(n+" is a Smith Number");
        }else {
            System.out.println(n+" is not a Smith Number");
        }
    }
    private boolean isSmithNumber(int n) {
        if(isPrime(n))return false;
        int sumDigits=sumOfDigits(n);
        int sumFactorDigits=0;
        int temp=n;
        for(int i=2;i<=temp/i;i++) {
            while(temp%i==0) {
                sumFactorDigits+=sumOfDigits(i);
                temp/=i;
            }
        }
        if(temp>1)sumFactorDigits+=sumOfDigits(temp);
        return sumDigits==sumFactorDigits;
    }
    private int sumOfDigits(int n) {
        int sum=0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    private boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)return false;
        }
        return true;
    }
}