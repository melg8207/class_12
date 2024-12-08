import java.util.*;
public class DisariumNumber {
    static int num,size;
    DisariumNumber(int nn) {
        num=nn;
        size=0;
    }
    void countDigits(int n,int size) {
        int len=(""+n).length();
        size=len;
    }
    //function to give the sum of digits raised to the power
    int sumofDigits(int n,int p) {
        if(n==0)
            return 0;
        else
            return (int)Math.pow(n%10,p)+sumofDigits(n/10,p-1);
    }
    void check(int n,int size) {
        if(n==sumofDigits(n,size))
            System.out.println(n+" is a Disarium Number");
        else
            System.out.println(n+" is not a Disarium Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        DisariumNumber obj=new DisariumNumber(n);
        obj.countDigits(num,size);
        obj.check(num,size);
    }
}
