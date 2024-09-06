import java.util.*;
public class BubbleSort {
    public static void sort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements to be stored in the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements into the array: ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
        sort(arr);
    }
}
