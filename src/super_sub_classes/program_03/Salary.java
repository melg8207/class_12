package super_sub_classes.program_03;
import java.util.*;
public class Salary extends Employee2 {
    static float da,hra,spl;
    static double tsal;
    Salary() {
        da=0.0f;hra=0.0f;spl=0.0f;
        tsal=0.0;
    }
    Salary(float d,float h,float s,int e,double b) {
        super(e,b);
        da=d;hra=h;spl=s;
    }
    double calculate_sal() {
        tsal=bsal+da+hra+spl;
        return tsal;
    }
    void show_salary(){
        super.salinfo();
        System.out.println("Dearness Allowance: "+da);
        System.out.println("House and Rental Allowance: "+hra);
        System.out.println("Special Allowance: "+spl);
        System.out.println("Net Payable Salary: "+tsal);
    }
    public static void main(String[] args) {
        Salary obj=new Salary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        bsal=sc.nextDouble();
        System.out.println("Enter Dearness Allowance: ");
        da=sc.nextFloat();
        System.out.println("Enter House and Rental Allowance: ");
        hra=sc.nextFloat();
        System.out.println("Enter Special Allowance: ");
        spl=sc.nextFloat();
        obj.calculate_sal();
        obj.show_salary();
    }
}
