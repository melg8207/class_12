package super_sub_classes.program_13;
public class Cone implements Shapes {
    double radius,height,length;
    public Cone(double r,double h,double l) {
        radius=r;
        height=h;
        length=l;
    }
    @Override
    public double calcCSArea() {
        length=Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        return Math.round((Math.PI*radius*length)*1000.0)/1000.0;
    }
    @Override
    public double calcVol() {
        return Math.round(((double)(1/3)*Math.PI*Math.pow(radius,2)*height)*1000.0)/1000.0;
    }
    public double calcTSArea() {
        length=Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        return Math.round(((Math.PI*Math.pow(radius,2))+(Math.PI*radius*length))*1000.0)/1000.0;
    }
    // frustrum of cone when cut horizontally at exactly half of the cone
    public double calcCSArea_frustrum() {
        double r=radius/2.0;
        double h=height/2.0;
        double l=Math.sqrt((Math.pow(radius-r,2)+Math.pow(h,2)));
        return Math.round((Math.PI*(radius-r)*l)*1000.0)/1000.0;
    }
    public double calcTSArea_frustrum() {
        double r=radius/2.0;
        double h=height/2.0;
        double l=Math.sqrt((Math.pow(radius-r,2)+Math.pow(h,2)));
        return Math.round(((Math.PI*(radius-r)*l)+(Math.PI*(Math.pow(radius,2)+Math.pow(r,2))))*1000.0)/1000.0;
    }
    public double calcVol_frustrum() {
        double r=radius/2.0;
        double h=height/2.0;
        return Math.round(((double)(1/3)*Math.PI*(Math.pow(radius,2)+radius*r+Math.pow(r,2))*h)*1000.0)/1000.0;
    }
}
