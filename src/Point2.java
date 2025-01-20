import java.util.*;
public class Point2 {
    double x1,x2,x3,x4,y1,y2,y3,y4;
    static Scanner sc=new Scanner(System.in);
    public Point2() {
        x1=0;x2=0;x3=0;x4=0;
        y1=0;y2=0;y3=0;y4=0;
    }
    public void acceptPoint() {
        System.out.println("Enter values of the first line: ");
        System.out.println("Starting point: ");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Ending Point: ");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        System.out.println();
        System.out.println("Enter values of the second line: ");
        System.out.println("Starting point: ");
        x3=sc.nextDouble();
        y3=sc.nextDouble();
        System.out.println("Ending Point: ");
        x4=sc.nextDouble();
        y4=sc.nextDouble();
        System.out.println();
    }
    public void Show() {
        System.out.println("Coordinates of the first line: ");
        System.out.println("("+x1+", "+y1+")   ("+x2+", "+y2+")");
        System.out.println("Coordinates of the second line: ");
        System.out.println("("+x3+", "+y1+")   ("+x2+", "+y2+")");
    }
}
