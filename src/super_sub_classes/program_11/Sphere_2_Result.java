package super_sub_classes.program_11;
import java.util.*;
public class Sphere_2_Result extends Area_Volume {
    public Sphere_2_Result(double r) {
        super(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=sc.nextDouble();
        Sphere_2_Result obj=new Sphere_2_Result(r);
        obj.ComputeArea();
        obj.ComputeVolume();
    }
}
