package super_sub_classes.program_13;
public class Pyramid {
    double baseLength, baseWidth, height;
    public Pyramid(double bl,double bw,double h) {
        baseLength=bl;
        baseWidth=bw;
        height=h;
    }
    public double calcTSArea() {
        double slantHeight=Math.sqrt(Math.pow(height,2)+Math.pow(baseLength/ 2.0,2));
        return Math.round((baseLength*baseWidth+2*(0.5*baseLength*slantHeight)+2*(0.5*baseWidth*slantHeight))*1000.0)/1000.0;
    }
    public double calcVol() {
        return Math.round((1.0/3*baseLength*baseWidth*height)*1000.0)/1000.0;
    }
    // Frustum when pyramid is cut horizontally in the middle
    public double calcVol_frustrum() {
        double bLength=baseLength/2.0;
        double bWidth=baseWidth/2.0;
        double h=height/2.0;
        return Math.round((1.0/3*h*(baseLength*baseWidth+bLength*bWidth+Math.sqrt(baseLength*baseWidth*bLength*bWidth)))*1000.0)/1000.0;
    }
    public double calcTSArea_frustrum() {
        double bLength=baseLength/2.0;
        double bWidth=baseWidth/2.0;
        double h=height/2.0;
        double slantHeightTop=Math.sqrt(Math.pow(h,2)+Math.pow(bLength/2.0,2));
        double slantHeightBottom=Math.sqrt(Math.pow(height,2)+Math.pow(baseLength/2.0,2));
        return Math.round((baseLength*baseWidth+bLength*bWidth+2*(0.5*baseLength*slantHeightBottom+0.5*bLength*slantHeightTop))*1000.0)/1000.0;
    }
}
