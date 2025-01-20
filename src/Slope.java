public class Slope extends Point2 {
    double m1,m2;
    void findSlope() {
        m1=(x2!=x1)?(y2-y1)/(x2-x1):Double.POSITIVE_INFINITY;
        m2=(x4!=x3)?(y4-y3)/(x4-x3):Double.POSITIVE_INFINITY;
    }
    void Display() {
        System.out.println();
        System.out.println("Slope of the first line =  "+m1);
        System.out.println("Slope of the second line = "+m2);
    }
    void Check() {
        System.out.println();
        if(m1==m2) {
            System.out.println("The two lines are parallel to each other");
        }else {
            System.out.println("The two lines are not parallel to each other");
        }
        if(m1*m2==-1) {
            System.out.println("The two lines are perpendicular");
        }else {
            System.out.println("The two lines are not perpendicular");
        }
    }
    public static void main(String[] args) {
        Slope obj=new Slope();
        obj.acceptPoint();
        obj.Show();
        obj.findSlope();
        obj.Display();
        obj.Check();
    }
}
