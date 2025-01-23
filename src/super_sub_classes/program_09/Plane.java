package super_sub_classes.program_09;
public class Plane {
    double x1,y1;
    public Plane(double nx,double ny) {
        x1=nx;y1=ny;
    }
    public void Show() {
        System.out.println("First x-coordinate = "+x1);
        System.out.println("First y-coordinate = "+y1);
    }
}
