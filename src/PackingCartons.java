import java.util.*;
public class PackingCartons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of boxes to be packed (max 1000): ");
        int N= sc.nextInt();
        if(N<1||N>1000) {
            System.out.println("Invalid Input! Enter a number between 1 and 1000.");
        }
        int cap48=N/48;N%=48;           //allocating number of cartons of capacity 48 boxes to be used
        int cap24=N/24;N%=24;           //allocating number of cartons of capacity 24 boxes to be used
        int cap12=N/12;N%=12;           //allocating number of cartons of capacity 12 boxes to be used
        int cap6=(N>0)?1:0;              //allocating number of cartons of capacity 6 boxes to be used
        System.out.println();
        System.out.println("----- Cartons used -----");
        System.out.println("Capacity 48: "+cap48);
        System.out.println("Capacity 24: "+cap24);
        System.out.println("Capacity 12: "+cap12);
        System.out.println("Capacity 6: "+cap6);
    }
}
