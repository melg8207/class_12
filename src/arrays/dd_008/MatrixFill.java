package arrays.dd_008;
import java.util.*;
public class MatrixFill {
    static int N;
    static char[][] matrix;
    public static void main(String[] args) {
        MatrixFill obj=new MatrixFill();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size (between 4 and 9): ");
        N=sc.nextInt();
        if(N<4||N>9) {
            System.out.println("SIZE OUT OF RANGE");
            return;
        }
        matrix=new char[N][N];
        System.out.print("Enter first character: ");
        char ch1=sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2=sc.next().charAt(0);
        System.out.print("Enter third character: ");
        char ch3=sc.next().charAt(0);
        obj.fill(matrix,ch1,ch2,ch3);
        System.out.println();
        System.out.println("Character Matrix: ");
        obj.display(matrix);
    }
    public void fill(char[][] matrix,char ch1,char ch2,char ch3) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if((i==0||i==N-1)&&(j==0||j==N-1)) {
                    matrix[i][j]=ch1; // fill corners
                }else if(i==0||i==N-1||j==0||j==N-1) {
                    matrix[i][j]=ch2; // fill boundary except corners
                }else {
                    matrix[i][j]=ch3; // fill non-boundary
                }
            }
        }
    }
    public void display(char[][] matrix) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
