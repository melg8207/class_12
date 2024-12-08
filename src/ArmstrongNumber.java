import java.util.*;
public class ArmstrongNumber {
    long n,l;
    public ArmstrongNumber(long nn) {
        n=nn;
        l=(""+n).length();
    }
    public long sum_pow(long i) {
        if(i==0)
            return 0;
        return (long)Math.pow((i%10),l)+sum_pow(i/10);
    }
    public void isArmstrong() {
        if(n==sum_pow(n))
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is not an Armstrong Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long x=sc.nextLong();
        ArmstrongNumber obj=new ArmstrongNumber(x);
        obj.isArmstrong();
    }
}
