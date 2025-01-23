package super_sub_classes.program_11;
public class Area_Volume extends Sphere2 {
    double area,vol;
    public Area_Volume(double r) {
        super(r);
        area=0.0;
        vol=0.0;
    }
    public void ComputeArea() {
        area=4*Math.PI*Math.pow(radius,2);
        System.out.println("Area of the sphere   = "+area);
    }
    public void ComputeVolume() {
        vol=(double)(4/3)*Math.PI*Math.pow(radius,3);
        System.out.println("Volume of the sphere = "+vol);
    }
}
