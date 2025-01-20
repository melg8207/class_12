package arrays.dd_008;
import java.util.*;
public class ShiftMatrix {
    static int N;
    static int[] a;
    static int[][] b;
    static Scanner sc=new Scanner(System.in);
    //input in single dimensional array
    public void input(int n,int[] arr) {
        System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    //bubble sort to sort the array in ascending order
    public void sort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {               //sort in ascending order
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("SORTED ARRAY: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }
    //fill matrix with sorted array
    public void FillMatrix(int[][] matrix,int[] arr,int N) {
        // Fill the first row with the sorted array
        for(int j=0;j<N;j++) {
            matrix[0][j]=arr[j];
        }
        //filling the other rows by shifting elements other than the first element
        for(int i=1;i<N;i++) {
            matrix[i][0]=arr[0];                    //keeping the first element constant
            for(int j=1;j<N;j++) {
                if(j<N-i)
                    matrix[i][j]=arr[j];
                else
                    matrix[i][j]=arr[j-(N-i)];      //cyclically shifting elements left
            }
        }
    }
    //printing the matrix
    public void print(int[][] matrix,int N) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter size of the matrix and single dimensional array (within 2 to 10): ");
        System.out.print("N = ");
        int N=sc.nextInt();
        if(N>=2&&N<=10) {
            a=new int[N];                           //initializing the single-dimensional array
            b=new int[N][N];                        //initializing the two-dimensional matrix
            ShiftMatrix obj=new ShiftMatrix();
            obj.input(N,a);
            obj.sort(a);
            obj.FillMatrix(b,a,N);
            System.out.println();
            System.out.println("FILLED MATRIX: ");
            obj.print(b,N);
        }else {
            System.out.println("MATRIX SIZE OUT OF RANGE");
        }
    }
}
