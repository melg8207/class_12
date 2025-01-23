package super_sub_classes.program_13;
public class Cuboid {
    double length,breadth,height;
    public Cuboid(double l,double b,double h) {
        length=l;
        breadth=b;
        height=h;
    }
    public double calcLSArea() {
        return Math.round((2*height*(length+breadth))*1000.0)/1000.0;
    }
    public double calcTSArea() {
        return Math.round((2*(length*breadth+breadth*height+length*height))*1000.0)/1000.0;
    }
    public double calcVol() {
        return Math.round((length*breadth*height)*1000.0)/1000.0;
    }
    public double calcDiagonal() {
        return Math.round((Math.sqrt(Math.pow(length,2)+Math.pow(breadth,2)+Math.pow(height,2)))*1000.0)/1000.0;
    }
}
