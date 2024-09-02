import java.util.*;
public class Sales extends Product {
    int day;
    double tax,totamt;
    static Scanner sc=new Scanner(System.in);
    Sales(String n,int a,double b,int d) {
        super(n,a,b);
        day=d;
    }
    @Override
    void accept() {
        super.accept();
        System.out.println("Enter number of days: ");
        day=sc.nextInt();
    }
    void compute() {
        double f=0.0;
        tax=(12.4/100)*amount;
        if(day>30)
            f=(2.5/100)*amount;
        totamt=amount+tax+f;
    }
    @Override
    void show() {
        super.show();
        System.out.println("Number of days: "+day);
        System.out.println("Sales Tax: "+tax);
        System.out.println("Total amount: "+totamt);
    }
    public static void main(String[] args) {
        Sales obj=new Sales("",0,0.0,0);
        obj.accept();
        obj.compute();
        obj.show();
    }
}
