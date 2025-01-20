package numbers.num_009;
import java.util.*;
public class DisariumNumber {
    static int num,size;
    public DisariumNumber(int nn) {
        num=nn;
        size=0;
    }
    //function to count digits and set size
    public void countDigit() {
        int len=(""+num).length();
        size=len;
    }
    //function to give the sum of digits raised to the power
    public int sumofDigits(int n,int p) {
        if(n==0)
            return 0;
        else
            return (int)Math.pow((n%10),p)+sumofDigits((n/10),p-1);
    }
    //function to check if the number is a Disarium number or not
    public void check() {
        //calculating sum of digits raised to the power
        if(num==sumofDigits(num,size))
            System.out.println("\n"+num+" is a Disarium Number");
        else
            System.out.println("\n"+num+" is not a Disarium Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        DisariumNumber obj=new DisariumNumber(n);
        obj.countDigit();
        obj.check();
    }
}
