package numbers.series_009;
import java.util.*;
public class CompositeMagic {
    // Function to check if a number is composite
    public static boolean isComposite(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return true;
        }
        return false;
    }
    // Function to check if a number is a magic number
    public static boolean isMagic(int n) {
        while(n>9) {
            int sum=0;
            while(n!=0) {
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m=sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        List<Integer> compositeMagicNumbers=new ArrayList<>();
        for(int i=m;i<=n;i++) {
            if(isComposite(i)&&isMagic(i)) {
                compositeMagicNumbers.add(i);
            }
        }
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE: ");
        for(int number:compositeMagicNumbers) {
            System.out.print(number+", ");
        }
        System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS: "+compositeMagicNumbers.size());
    }
}
