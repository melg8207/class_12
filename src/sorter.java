import java.util.Scanner;
class sorter {
    private int[] arr=new int[100];
    public sorter() {
        // Default constructor
    }
    public void readList() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 100 integers:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void dispList() {
        System.out.println("Array elements:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void SelectionSort() {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public void InsSort() {
        for(int i=1;i<50;i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]<key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        sorter obj=new sorter();
        // Input 100 integers
        obj.readList();
        // Display original array
        System.out.println("Original Array:");
        obj.dispList();
        // Sort array in ascending order using Selection Sort
        obj.SelectionSort();
        System.out.println("Array after Selection Sort:");
        obj.dispList();
        // Sort first 50 integers in descending order using Insertion Sort
        obj.InsSort();
        System.out.println("First 50 integers after Insertion Sort:");
        obj.dispList();
    }
}