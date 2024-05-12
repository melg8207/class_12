import java.util.Scanner;
class Transarray {
    private int[][] arr;
    private int m,n;
    static Scanner sc=new Scanner(System.in);
    // Default constructor
    Transarray() {
        m=0;
        n=0;
    }
    // Parameterized constructor
    Transarray(int mm,int nn) {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    // Method to fill the array with user input
    void fillarray() {
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    // Method to compute the transpose of a matrix and store it in another object A
    void transpose(Transarray A) {
        A.m=n;
        A.n=m;
        A.arr=new int[A.m][A.n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                A.arr[j][i]=arr[i][j];
            }
        }
    }
    // Method to display the array in matrix form
    void disparray() {
        System.out.println("The matrix is:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        // Create a Transarray object
        Transarray matrix=new Transarray(rows,cols);
        // Fill the array
        matrix.fillarray();
        // Display the original array
        System.out.println("Original matrix:");
        matrix.disparray();
        // Create Transarray object for transpose
        Transarray transposeMatrix = new Transarray();
        // Compute and display the transpose
        matrix.transpose(transposeMatrix);
        System.out.println("Transpose of the matrix:");
        transposeMatrix.disparray();
    }
}