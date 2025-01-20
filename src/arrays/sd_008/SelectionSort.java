package arrays.sd_008;
import java.util.Scanner;
public class SelectionSort {
    public static void sort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++) {
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
        System.out.println();
        sort(arr);
    }
}
