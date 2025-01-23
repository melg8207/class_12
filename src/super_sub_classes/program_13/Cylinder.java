package super_sub_classes.program_13;
public class Cylinder implements Shapes {
    double radius,height;
    public Cylinder(double r,double h) {
        radius=r;
        height=h;
    }
    @Override
    public double calcCSArea() {
        return Math.round((2*Math.PI*Math.pow(radius,2))*1000.0)/1000.0;
    }
    @Override
    public double calcVol() {
        return Math.round((Math.PI*Math.pow(radius,2)*height)*1000.0)/1000.0;
    }
    public double calcTSArea() {
        return Math.round(((2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2)))*1000.0)/1000.0;
    }
    public double calcDiagonal() {
        return Math.round((Math.sqrt(4*Math.pow(radius,2)+Math.pow(height,2)))*1000.0)/1000.0;
    }
    public double calcCSArea_half() {
        return Math.round((Math.PI*radius*height)*1000.0)/1000.0;
    }
    public double calcTSArea_half() {
        return Math.round(((Math.PI*radius*height)+(Math.PI*Math.pow(radius,2))+(2*radius*height))*1000.0)/1000.0;
    }
    public double calcVol_half() {
        return Math.round(((double)(1/2)*Math.PI*Math.pow(radius,2)*height)*1000.0)/1000.0;
    }
}
