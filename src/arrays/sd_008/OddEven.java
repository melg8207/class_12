/*
 * Program to take two sets of arrays of size specified by user input.
 * A separate array is created using Call by Reference method to merge both the arrays
 * in the arrangement of odd numbers first and  the even numbers after, in ascending order.
 * For example:
 * A={1,2,3,4}
 * B={6,10,8,7}
 * then C={1,3,7,2,4,6,8,10}
 */
package arrays.sd_008;
import java.util.*;
public class OddEven {
    int[] arr;int cap;
    static Scanner sc=new Scanner(System.in);
    public OddEven(int mm) {
        cap=mm;
        arr=new int[cap];
    }
    public void input() {
        System.out.println("Enter elements: ");
        for(int i=0;i<cap;i++) {
            arr[i]=sc.nextInt();
        }
    }
    public OddEven oddeven(OddEven A,OddEven B) {
        OddEven C=new OddEven(A.arr.length+B.arr.length);
        int k=0;
        int[] temp=new int[A.arr.length+B.arr.length];
        for(int i=0;i<A.arr.length;i++)
            temp[k++]=A.arr[i];
        for(int i=0;i<B.arr.length;i++)
            temp[k++]=B.arr[i];
        k=0;
        for(int i=0;i<temp.length;i++) {
            if(temp[i]%2!=0)
                C.arr[k++]=temp[i];
        }
        for(int i=0;i<temp.length;i++) {
            if(temp[i]%2==0)
                C.arr[k++]=temp[i];
        }
        return C;
    }
    public void display() {
        for(int i=0;i<cap;i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        OddEven A=new OddEven(size);
        OddEven B=new OddEven(size);
        System.out.println();
        System.out.println("First Array: ");
        A.input();
        System.out.println("Second Array: ");
        B.input();
        OddEven C=A.oddeven(A,B);
        System.out.println();
        System.out.print("First Array: ");
        A.display();
        System.out.print("\nSecond Array: ");
        B.display();
        System.out.print("\nSorted Array (according to specified arrangement): ");
        C.display();
    }
}

