import java.util.*;
class Point {
    double x,y;
    // Constructor to initialize x=0, y=0
    Point() {
        x=0;
        y=0;
    }
    // Method to input the coordinates x and y of a point
    void readpoint() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x=sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        y=sc.nextDouble();
    }
    // Method to print x, y coordinates with suitable headings
    void displaypoint() {
        System.out.println("Coordinates: ("+x+", "+y+")");
    }
    // Method to calculate the coordinates of the midpoint between two given points A and B
    Point midpoint(Point A,Point B) {
        Point midpoint=new Point();
        midpoint.x=(A.x+B.x)/2;
        midpoint.y=(A.y+B.y)/2;
        return midpoint;
    }
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=new Point();
        Point midPoint;
        System.out.println("Enter coordinates for point P1: ");
        p1.readpoint();
        System.out.println("Enter coordinates for point P2: ");
        p2.readpoint();
        midPoint=p1.midpoint(p1,p2);
        System.out.println("Midpoint between P1 and P2:");
        midPoint.displaypoint();
    }
}