package super_sub_classes.program_03;
public class Employee2 {
    static int empn;
    static double bsal;
    Employee2() {
        empn=0;
        bsal=0.0;
    }
    Employee2(int e,double b) {
        empn=e;
        bsal=b;
    }
    void salinfo() {
        System.out.println("Employee Number: "+empn);
        System.out.println("Basic Salary: "+bsal);
    }
}
