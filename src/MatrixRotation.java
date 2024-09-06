import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of the square matrix (between 3 and 9): ");
        int M=sc.nextInt();
        if(M<3||M>9) {
            System.out.println("Invalid input. Please enter an order between 3 and 9.");
            return;
        }
        int[][] A=new int[M][M];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<M;i++) {
            for(int j=0;j<M;j++) {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX:");
        displayMatrix(A);
        System.out.println("MATRIX AFTER ROTATION:");
        rotateMatrix(A);
        System.out.println("Sum of the corner elements="+sumOfCorners(A));
    }
    public static void displayMatrix(int[][] matrix) {
        for(int[] row:matrix) {
            for(int element:row) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
    public static void rotateMatrix(int[][] matrix) {
        int N=matrix.length;
        for(int layer=0;layer<N/2;layer++) {
            int first=layer;
            int last=N-1-layer;
            for(int i=first;i<last;i++) {
                int offset=i-first;
                int top=matrix[first][i];
                // left -> top
                matrix[first][i]=matrix[last-offset][first];
                // bottom -> left
                matrix[last-offset][first]=matrix[last][last-offset];
                // right -> bottom
                matrix[last][last-offset]=matrix[i][last];
                // top -> right
                matrix[i][last]=top;
            }
        }
        displayMatrix(matrix);
    }
    public static int sumOfCorners(int[][] matrix) {
        int sum=matrix[0][0]+matrix[0][matrix.length-1]+matrix[matrix.length-1][0]+matrix[matrix.length-1][matrix.length-1];
        return sum;
    }
}