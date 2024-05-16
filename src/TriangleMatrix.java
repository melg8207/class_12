import java.util.Scanner;
public class TriangleMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the matrix (M): ");
        int M=sc.nextInt();
        if(M<=2||M>=10) {
            System.out.println("Matrix size out of range.");
            return;
        }
        int[][] A=new int[M][M];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<M;i++) {
            for(int j=0;j<M;j++) {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        displayMatrix(A);
        System.out.println("UPPER TRIANGLE OF THE MATRIX");
        displayUpperTriangle(A);
        System.out.println("LOWER TRIANGLE OF THE MATRIX");
        displayLowerTriangle(A);
    }
    public static void displayMatrix(int[][] matrix) {
        int M=matrix.length;
        for(int i=0;i<M;i++) {
            for(int j=0;j<M;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void displayUpperTriangle(int[][] matrix) {
        int M=matrix.length;
        for(int i=0;i<M;i++) {
            for(int j=0;j<M;j++) {
                if(j>=i) {
                    System.out.print(matrix[i][j]+"\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void displayLowerTriangle(int[][] matrix) {
        int M=matrix.length;
        for(int i=0;i<M;i++) {
            for(int j=0;j<M;j++) {
                if(j<i) {
                    System.out.print(matrix[i][j]+"\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}