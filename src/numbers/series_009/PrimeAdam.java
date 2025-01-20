package numbers.series_009;
import java.util.*;
public class PrimeAdam {
    boolean isPrime(int n) {
        int c=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                c++;
            }
        }
        return c==2;
    }
    boolean isAdam(int n) {
        int rev=reverse(n);
        int sq_of_no=n*n;
        int sq_of_rev=rev*rev;
        return sq_of_no==reverse(sq_of_rev);
    }
    int reverse(int n) {
        int rev=0;
        while(n!=0) {
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        PrimeAdam obj=new PrimeAdam();
        Scanner sc=new Scanner(System.in);
        System.out.println("------- Enter range ------- ");
        System.out.print("Enter lower limit: ");
        int m=sc.nextInt();
        System.out.print("Enter upper limit: ");
        int n=sc.nextInt();
        if(m>=0&&n>0&&m<n) {
            int freq=0;
            System.out.print("PRIME ADAM INTEGERS: ");
            for(int i=m;i<=n;i++) {
                if(obj.isPrime(i)&& obj.isAdam(i)) {
                    freq++;
                    System.out.print(i+", ");
                }
            }
            if(freq==0)
                System.out.print("NIL");
            System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+freq);
        }else {
            System.out.println("Invalid Input!");
        }
    }
}
