package super_sub_classes.program_09;
import java.util.*;
public class slope extends Plane {
    public slope(double nx,double ny) {
        super(nx,ny);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,y1,x2,y2;
        System.out.println("Enter x and y coordinates of first point: ");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Enter x and y coordinates of second point: ");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        slope s=new slope(x1,y1);
        Circle circ=new Circle(x1,y1,x2,y2);
        s.Show();
        circ.findRadius();
        circ.findArea();
        circ.Show();
    }
}
