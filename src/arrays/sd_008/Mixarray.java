package arrays.sd_008;
import java.util.*;
public class Mixarray {
    int[] arr;int cap;
    static Scanner sc=new Scanner(System.in);
    public Mixarray(int mm) {
        cap=mm;
        arr=new int[cap];
    }
    public void input() {
        System.out.println("Enter elements: ");
        for(int i=0;i<cap;i++) {
            arr[i]=sc.nextInt();
        }
    }
    // mixes first 3 elements of 1st and 2nd array
    public Mixarray mix(Mixarray P,Mixarray Q) {
        Mixarray R=new Mixarray(6);
        int k=0;
        for(int i=0;i<3;i++)
            R.arr[k++]=P.arr[i];
        for(int i=0;i<3;i++)
            R.arr[k++]=Q.arr[i];
        return R;
    }
    public void display() {
        for(int i=0;i<cap;i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        Mixarray P=new Mixarray(size);
        Mixarray Q=new Mixarray(size);
        System.out.println();
        System.out.println("First Array: ");
        P.input();
        System.out.println("Second Array: ");
        Q.input();
        Mixarray R=P.mix(P,Q);
        System.out.println();
        System.out.print("First Array: ");
        P.display();
        System.out.print("\nSecond Array: ");
        Q.display();
        System.out.print("\nMixed Array: ");
        R.display();
    }
}
