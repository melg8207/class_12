package super_sub_classes.program_09;
public class Circle extends Plane{
    double x2,y2;
    double radius,area;
    public Circle(double nx,double ny,double a,double  b) {
        super(nx,ny);
        x2=a;y2=b;
        radius=0.0;area=0.0;
    }
    public void findRadius() {
        radius=Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));
    }
    public void findArea() {
        area=Math.PI*Math.pow(radius,2);
    }
    @Override
    public void Show() {
        System.out.println("Second x-coordinate = "+x2);
        System.out.println("Second y-coordinate = "+y2);
        System.out.println("Length of Radius = "+radius+" units");
        System.out.println("Area of Circle = "+area+" sqcm");
    }
}
