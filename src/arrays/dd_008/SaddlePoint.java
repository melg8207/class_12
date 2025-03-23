package arrays.dd_008;
import java.util.*;
public class SaddlePoint {
    int[][] arr;int N;
    static Scanner sc=new Scanner(System.in);
    public void accept() {
        while(true) {
            System.out.print("Enter size of the matrix (not more than 20): ");
            N=sc.nextInt();
            System.out.println();
            if(N<=20) {
                arr=new int[N][N];
                System.out.println("Enter values of the matrix: ");
                for(int i=0;i<N;i++) {
                    for(int j=0;j<N;j++) {
                        arr[i][j]=sc.nextInt();
                    }
                }
                break;
            }else {
                System.out.println("Matrix size cannot be more than 20. Try Again!");
            }
        }
    }
    public boolean unique(int r,int c) {
        int num=arr[r][c];
        for(int k=0;k<N;k++) {
            if(arr[k][c]>num)
                return false;
        }
        return true;
    }
    public int find_saddle() {
        for(int i=0;i<N;i++) {
            int num=arr[i][0];
            int col=0;
            for(int j=1;j<N;j++) {
                if(arr[i][j]<num) {
                    num=arr[i][j];
                    col=j;
                }
            }
            if(unique(i,col)) {
                return num;
            }
        }
        return -1;
    }
    public void show() {
        int saddle=find_saddle();
        if(saddle!=-1) {
            System.out.println("Saddle Point: "+saddle);
        }else {
            System.out.println("No Saddle Point");
        }
    }
    public static void main(String[] args) {
        SaddlePoint obj=new SaddlePoint();
        obj.accept();
        obj.show();
    }
}
