import java.util.Scanner;
class DDArray {
    private final int[][] mat;
    private final int m,n;
    static Scanner sc=new Scanner(System.in);
    // Parameterized constructor
    public DDArray(int nr,int nc) {
        m=nr;
        n=nc;
        mat=new int[m][n];
    }
    // Method to input elements into the matrix
    public void readMatrix() {
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    // Method to compute and print sums
    public void Sums() {
        int leftDiagonalSum=0;
        int rightDiagonalSum=0;
        int boundarySum=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==j) { // Left diagonal
                    leftDiagonalSum+=mat[i][j];
                }
                if(i+j==n-1) { // Right diagonal
                    rightDiagonalSum+=mat[i][j];
                }
                if(i==0||i==m-1||j==0||j==n-1) { // Boundary elements
                    boundarySum+=mat[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements: "+leftDiagonalSum);
        System.out.println("Sum of right diagonal elements: "+rightDiagonalSum);
        System.out.println("Sum of boundary elements: "+boundarySum);
    }
    // Method to print matrix
    public void Show_Mats() {
        System.out.println("Matrix of "+m+" x "+n+" order:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0||i==m-1||j==0||j==n-1) {
                    System.out.print(mat[i][j]+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=sc.nextInt();
        DDArray obj=new DDArray(rows,cols);
        obj.readMatrix();
        obj.Sums();
        obj.Show_Mats();
    }
}

