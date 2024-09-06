import java.util.Scanner;
public class InsertionSort {
    public static void sort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("Sorted Array: ");
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
        System.out.println();
        sort(arr);
    }
}
