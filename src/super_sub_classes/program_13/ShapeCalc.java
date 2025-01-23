package super_sub_classes.program_13;
import java.util.*;
public class ShapeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("---- Shape Calculator Menu ----");
            System.out.println("1. Sphere");
            System.out.println("2. Cylinder");
            System.out.println("3. Cone");
            System.out.println("4. Cube");
            System.out.println("5. Cuboid");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice) {
                case 1: // Sphere
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius=sc.nextDouble();
                    Sphere sphere=new Sphere(sphereRadius);
                    System.out.println("1. Curved Surface Area");
                    System.out.println("2. Volume");
                    System.out.print("Choose operation: ");
                    int sphereOp=sc.nextInt();
                    if(sphereOp==1)System.out.println("Curved Surface Area: "+sphere.calcCSArea());
                    else if(sphereOp==2)System.out.println("Volume: "+sphere.calcVol());
                    break;
                case 2: // Cylinder
                    System.out.print("Enter radius of the cylinder: ");
                    double cylRadius=sc.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double cylHeight=sc.nextDouble();
                    Cylinder cylinder=new Cylinder(cylRadius,cylHeight);
                    System.out.println("1. Curved Surface Area");
                    System.out.println("2. Volume");
                    System.out.println("3. Total Surface Area");
                    System.out.print("Choose operation: ");
                    int cylOp=sc.nextInt();
                    if(cylOp==1)System.out.println("Curved Surface Area: "+cylinder.calcCSArea());
                    else if(cylOp==2)System.out.println("Volume: "+cylinder.calcVol());
                    else if(cylOp==3)System.out.println("Total Surface Area: "+cylinder.calcTSArea());
                    break;
                case 3: // Cone
                    System.out.print("Enter radius of the cone: ");
                    double coneRadius=sc.nextDouble();
                    System.out.print("Enter height of the cone: ");
                    double coneHeight=sc.nextDouble();
                    Cone cone=new Cone(coneRadius,coneHeight,0);
                    System.out.println("1. Curved Surface Area");
                    System.out.println("2. Volume");
                    System.out.println("3. Total Surface Area");
                    System.out.println("4. Frustrum Operations");
                    System.out.print("Choose operation: ");
                    int coneOp=sc.nextInt();
                    if(coneOp==1)System.out.println("Curved Surface Area: "+cone.calcCSArea());
                    else if(coneOp==2)System.out.println("Volume: "+cone.calcVol());
                    else if(coneOp==3)System.out.println("Total Surface Area: "+cone.calcTSArea());
                    else if(coneOp==4) {
                        System.out.println("Frustrum Operations:");
                        System.out.println("1. Curved Surface Area of Frustrum");
                        System.out.println("2. Total Surface Area of Frustrum");
                        System.out.println("3. Volume of Frustrum");
                        System.out.print("Choose operation: ");
                        int frustrumOp=sc.nextInt();
                        if(frustrumOp==1)System.out.println("Curved Surface Area of Frustrum: "+cone.calcCSArea_frustrum());
                        else if(frustrumOp==2)System.out.println("Total Surface Area of Frustrum: "+cone.calcTSArea_frustrum());
                        else if(frustrumOp==3)System.out.println("Volume of Frustrum: "+cone.calcVol_frustrum());
                    }
                    break;
                case 4: // Cube
                    System.out.print("Enter side of the cube: ");
                    double cubeSide=sc.nextDouble();
                    Cube cube=new Cube(cubeSide);
                    System.out.println("1. Lateral Surface Area");
                    System.out.println("2. Volume");
                    System.out.println("3. Total Surface Area");
                    System.out.print("Choose operation: ");
                    int cubeOp=sc.nextInt();
                    if(cubeOp==1)System.out.println("Lateral Surface Area: "+cube.calcLSArea());
                    else if(cubeOp==2)System.out.println("Volume: "+cube.calcVol());
                    else if(cubeOp==3)System.out.println("Total Surface Area: "+cube.calcTSArea());
                    break;
                case 5: // Cuboid
                    System.out.print("Enter length of the cuboid: ");
                    double cuboidLength=sc.nextDouble();
                    System.out.print("Enter breadth of the cuboid: ");
                    double cuboidBreadth=sc.nextDouble();
                    System.out.print("Enter height of the cuboid: ");
                    double cuboidHeight=sc.nextDouble();
                    Cuboid cuboid=new Cuboid(cuboidLength,cuboidBreadth,cuboidHeight);
                    System.out.println("1. Lateral Surface Area");
                    System.out.println("2. Volume");
                    System.out.println("3. Total Surface Area");
                    System.out.print("Choose operation: ");
                    int cuboidOp=sc.nextInt();
                    if(cuboidOp==1)System.out.println("Lateral Surface Area: "+cuboid.calcLSArea());
                    else if(cuboidOp==2)System.out.println("Volume: "+cuboid.calcVol());
                    else if(cuboidOp==3)System.out.println("Total Surface Area: "+cuboid.calcTSArea());
                    break;
                case 6: // Pyramid
                    System.out.print("Enter base length of the pyramid: ");
                    double pyrBaseLength=sc.nextDouble();
                    System.out.print("Enter base width of the pyramid: ");
                    double pyrBaseWidth=sc.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double pyrHeight=sc.nextDouble();
                    Pyramid pyramid=new Pyramid(pyrBaseLength,pyrBaseWidth,pyrHeight);
                    System.out.println("1. Total Surface Area");
                    System.out.println("2. Volume");
                    System.out.println("3. Total Surface Area of Frustrum");
                    System.out.println("4. Volume of Frustrum");
                    System.out.print("Choose operation: ");
                    int pyrOp=sc.nextInt();
                    if(pyrOp==1)System.out.println("Total Surface Area: "+pyramid.calcTSArea());
                    else if(pyrOp==2)System.out.println("Volume: "+pyramid.calcVol());
                    else if(pyrOp==3)System.out.println("Total Surface Area of Frustrum: "+pyramid.calcTSArea_frustrum());
                    else if(pyrOp==4)System.out.println("Volume of Frustrum: "+pyramid.calcVol_frustrum());
                    break;
                case 7: // Exit
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!=7);
    }
}
