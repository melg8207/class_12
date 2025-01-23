package super_sub_classes.program_13;
public class Sphere implements Shapes {
    double radius;
    public Sphere(double r) {
        radius=r;
    }
    @Override
    public double calcCSArea() {
        return Math.round((4*Math.PI*Math.pow(radius,2))*1000.0)/1000.0;                // returns surface area of sphere
    }
    @Override
    public double calcVol() {
        return Math.round(((double)(4/3)*Math.PI*Math.pow(radius,2))*1000.0)/1000.0;    // returns volume of the sphere
    }
    public double calcCSArea_hemisphere() {
        return Math.round((2*Math.PI*Math.pow(radius,2))*1000.0)/1000.0;
    }
    public double calcTSArea_hemisphere() {
        return Math.round((3*Math.PI*Math.pow(radius,2))*1000.0)/1000.0;
    }
    public double calcVol_hemisphere() {
        return Math.round(((double)(2/3)*Math.PI*Math.pow(radius,2)));
    }
}
