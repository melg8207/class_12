package arrays.dd_008;
import java.util.*;
public class DiffMatrix {
    int[][] arr;int m,n;
    static Scanner sc=new Scanner(System.in);
    public DiffMatrix(int mm,int nn) {
        m=mm;n=nn;
        arr=new int[m][n];
    }
    public void fillarray() {
        System.out.println();
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public DiffMatrix SubMat(DiffMatrix A) {
        if(this.m!=A.m||this.n!=A.n) {
            System.out.println("Matrix dimensions do not match. Cannot subtract.");
            return null;
        }
        DiffMatrix C=new DiffMatrix(m,n);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                C.arr[i][j]=A.arr[i][j]-this.arr[i][j];
            }
        }
        return C;
    }
    public void display() {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        System.out.println();
        DiffMatrix A=new DiffMatrix(r,c);
        DiffMatrix B=new DiffMatrix(r,c);
        System.out.println("First matrix: ");
        A.fillarray();
        System.out.println("Second Matrix: ");
        B.fillarray();
        System.out.println();
        DiffMatrix C=B.SubMat(A);
        System.out.println();
        System.out.println("First Matrix: ");
        A.display();
        System.out.println("Second Matrix: ");
        B.display();
        System.out.println("Subtracted Matrix: ");
        C.display();
    }
}
