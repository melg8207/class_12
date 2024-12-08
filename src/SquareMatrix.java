import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N) between 4 and 9: ");
        int N=sc.nextInt();
        if(N>4||N<9) {
            char char1=readCharacter(sc, "Enter the first character: ");
            char char2=readCharacter(sc, "Enter the second character: ");
            char char3=readCharacter(sc, "Enter the third character: ");
            char[][] M=initializeMatrix(N,char1,char2,char3);
            printMatrix(M);
        }else {
            System.out.println("Invalid Input! Enter according to range. ");
        }
        sc.close();
    }
    static char readCharacter(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.next().charAt(0);
    }
    static char[][] initializeMatrix(int N,char char1,char char2,char char3) {
        char[][] M=new char[N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if((i==0&&j==0)||(i==0&&j==N-1)||(i==N-1&&j==0)||(i==N-1&&j==N-1)) {
                    M[i][j]=char1;
                }else if(i==0||i==N-1||j==0||j==N-1) {
                    M[i][j]=char2;
                }else {
                    M[i][j]=char3;
                }
            }
        }
        return M;
    }
    static void printMatrix(char[][] M) {
        System.out.println("OUTPUT MATRIX:");
        for(int i=0;i<M.length;i++) {
            for(int j=0;j<M[i].length;j++) {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
    }
}