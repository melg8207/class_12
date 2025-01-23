package super_sub_classes.program_01;
import java.util.*;
public class Bank {
    String Name;
    long Accno;
    double P;
    Bank(String name,long accno,double p) {
        Name=name;
        Accno=accno;
        P=p;
    }
    void read() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        Name=sc.nextLine();
        System.out.println("Account Number: ");
        Accno=sc.nextLong();
        System.out.println("Enter Principal Amount: ");
        P=sc.nextDouble();
    }
    void display() {
        System.out.println("Customer Name: "+Name);
        System.out.println("Customer Account Number: "+Accno);
        System.out.println("Principal Value: "+P);
    }
}
