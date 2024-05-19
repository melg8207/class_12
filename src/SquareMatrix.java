import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input the size of the matrix
        int N=0;
        while(N<4||N>9) {
            System.out.print("Enter the size of the matrix (N) between 4 and 9: ");
            N=sc.nextInt();
        }
        // Input the three characters
        System.out.print("Enter the first character: ");
        char char1=sc.next().charAt(0);
        System.out.print("Enter the second character: ");
        char char2=sc.next().charAt(0);
        System.out.print("Enter the third character: ");
        char char3=sc.next().charAt(0);
        // Initialize the matrix
        char[][] M=new char[N][N];
        // Fill the matrix according to the given rules
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if((i==0&&j==0)||(i==0&&j==N-1)||(i==N-1&&j==0)||(i==N-1&&j==N-1)) {
                    M[i][j]=char1; // Fill corners with char
                }else if(i==0||i==N-1||j==0||j==N-1) {
                    M[i][j]=char2; // Fill boundaries with char2
                }else {
                    M[i][j]=char3; // Fill non-boundary elements with char3
                }
            }
        }
        // Print the output matrix
        System.out.println("OUTPUT MATRIX:");
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}