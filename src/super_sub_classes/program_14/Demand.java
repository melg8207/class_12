package super_sub_classes.program_14;
import java.util.*;
public class Demand {
    String pid="";String pname="";
    int pdemand;
    public Demand(String id,String name,int demand) {
        pid=id;pname=name;pdemand=demand;
    }
    public void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        pid=sc.nextLine();
        System.out.print("Enter Product Name: ");
        pname=sc.nextLine();
        System.out.print("Enter Quantity of Demand: ");
        pdemand=sc.nextInt();
    }
    public void display() {
        System.out.println("Product ID: "+pid);
        System.out.println("Product Name: "+pname);
        System.out.println("Quantity of Demand: "+pdemand);
    }
}
