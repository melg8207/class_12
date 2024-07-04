import java.util.*;
public class Power {
    int power(int a,int b) {
        if(b==0)
            return 1;
        else
            return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Power obj=new Power();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base integer: ");
        int a=sc.nextInt();
        System.out.println("Enter exponent: ");
        int b=sc.nextInt();
        System.out.println("Power of "+a+"^"+b+" is: "+obj.power(a,b));
    }
}
