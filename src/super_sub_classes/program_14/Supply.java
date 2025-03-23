package super_sub_classes.program_14;
import java.util.*;
public class Supply extends Demand {
    int pproduced;double prate;
    static Scanner sc=new Scanner(System.in);
    public Supply(String id,String name,int demand,int produce,double rate) {
        super(id,name,demand);
        pproduced=produce;prate=rate;
    }
    @Override
    public void accept() {
        super.accept();
        System.out.print("Enter Number of Products Produced: ");
        pproduced=sc.nextInt();
        System.out.print("Enter Cost per Unit: ");
        prate=sc.nextDouble();
    }
    public double calculation() {
        double d=prate*pdemand;
        double p=prate*pproduced;
        return (d-p);
    }
    @Override
    public void display() {
        super.display();
        double d=calculation();
        System.out.println("Products Produced: "+pproduced);
        System.out.println("Cost per unit: "+prate);
        System.out.println("Difference in Demand and Production: "+d);
    }
    public static void main(String[] args) {
        Supply obj=new Supply("","",0,0,0.0);
        obj.accept();
        obj.display();
    }
}
