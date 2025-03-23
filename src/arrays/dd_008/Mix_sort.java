package arrays.dd_008;
import java.util.*;
public class Mix_sort {
    private int[][] a;
    private int m,n;
    public Mix_sort(int row,int col) {
        m=row;
        n=col;
        a=new int[m][n];
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                a[i][j]=sc.nextInt();
            }
        }
    }
    private void ascEven(int[] x) {         // Sort row in ascending order (Insertion Sort)
        for(int i=1;i<x.length;i++) {
            int key=x[i],j=i-1;
            while(j>=0&&x[j]>key) {
                x[j+1]=x[j];
                j--;
            }
            x[j+1]=key;
        }
    }
    private void dscOdd(int[] x) {          // Sort row in descending order (Insertion Sort)
        for(int i=1;i<x.length;i++) {
            int key=x[i],j=i-1;
            while(j>=0&&x[j]<key) {
                x[j+1]=x[j];
                j--;
            }
            x[j+1]=key;
        }
    }
    public void arrange() {
        for(int i=0;i<m;i++) {
            if(i%2==0)ascEven(a[i]);        // Even row -> Ascending
            else dscOdd(a[i]);              // Odd row -> Descending
        }
    }
    public void display() {
        System.out.println("Before sort:");
        printArray(); // Print original array
        arrange(); // Apply sorting
        System.out.println("After sort:");
        printArray();
    }
    private void printArray() {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col=sc.nextInt();
        Mix_sort obj=new Mix_sort(row, col);
        obj.input();
        obj.display();
    }
}
