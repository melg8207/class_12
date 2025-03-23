package arrays.sd_008;
import java.util.*;
public class TimeAdder {
    int[] a;
    static Scanner sc=new Scanner(System.in);
    public TimeAdder() {
        a=new int[2];
    }
    public void readtime() {
        System.out.print("Enter hour: ");
        a[0]=sc.nextInt();
        System.out.print("Enter minute: ");
        a[1]=sc.nextInt();
    }
    public void addtime(TimeAdder X,TimeAdder Y) {
        this.a[0]=X.a[0]+Y.a[0];        //hours
        this.a[1]=X.a[1]+Y.a[1];        //minutes
        // if minutes exceed 60
        if(this.a[1]>=60) {
            this.a[0]++;
            this.a[1]-=60;
        }
    }
    public void disptime() {
        System.out.println("Sum: "+this.a[0]+" hours and "+this.a[1]+" minutes");
    }
    public static void main(String[] args) {
        TimeAdder X=new TimeAdder();
        TimeAdder Y=new TimeAdder();
        TimeAdder Z=new TimeAdder();
        System.out.println("---------- Time Adder ----------");
        System.out.println("Enter first time: ");
        X.readtime();
        System.out.println("Enter second time: ");
        Y.readtime();
        System.out.println();
        Z.addtime(X,Y);
        System.out.print("First time: ");
        X.disptime();
        System.out.print("Second time: ");
        Y.disptime();
        System.out.print("Sum of times: ");
        Z.disptime();
    }
}
