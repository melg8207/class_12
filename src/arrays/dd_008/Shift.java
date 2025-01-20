package arrays.dd_008;
import java.util.*;
public class Shift {
    int m,n;
    int[][] mat;
    static Scanner sc=new Scanner(System.in);
    Shift(int mm,int nn) {
        m=mm;
        n=nn;
        mat=new int[mm][nn];
    }
    public void input() {
        System.out.println("Enter size of the matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        mat=new int[m][n];
        System.out.println();
        System.out.println("Enter elements into the matrix: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    public void cyclic(Shift A) {
        int m=A.m;
        int n=A.n;
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++) {
            int newRow=m-i-1;
            temp[newRow]=A.mat[i];
        }
        for(int i=0;i<m;i++) {
            A.mat[i]=temp[i];
        }
    }
    public void display() {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println();
        Shift A=new Shift(0,0);
        A.input();
        System.out.println();
        System.out.println("Original Matrix: ");
        A.display();
        A.cyclic(A);
        System.out.println("Shifted Matrix: ");
        A.display();
    }
}
