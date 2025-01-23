package super_sub_classes.program_13;
public class Cube {
    double side;
    public Cube(double s) {
        side=s;
    }
    public double calcLSArea() {
        return Math.round((4*Math.pow(side,2))*1000.0)/1000.0;
    }
    public double calcTSArea() {
        return Math.round((6*Math.pow(side,2))*1000.0)/1000.0;
    }
    public double calcVol() {
        return Math.round((Math.pow(side,3))*1000.0)/1000.0;
    }
    public double calcDiagonal() {
        return Math.round((Math.sqrt(3)*side)*1000.0)/1000.0;
    }
}
