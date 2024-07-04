import java.util.Scanner;
public class WondrousSquare {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        if(n<2||n>10) {
            System.out.println("Invalid value of n!");
            return;
        }
        int[][] a=new int[n][n];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<n;i++) {
            System.out.println("Enter Row "+(i+1)+" : ");
            for(int j=0;j<n;j++) {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        //Check Wondrous
        boolean wondrous=isWondrous(a);
        if(wondrous) {
            System.out.println("Yes, it represents a wondrous square");
        }else {
            System.out.println("Not a wondrous square");
        }
    }
    public static boolean isWondrous(int[][] arr) {
        int n=arr.length;
        int nSq=n*n;
        double validSum=0.5*n*(nSq+1);
        /*
         * seenArr is used to check that
         * numbers are not repeated
         */
        boolean[] seenArr=new boolean[nSq];
        for(int i=0;i<n;i++) {
            int rSum=0,cSum=0;
            for(int j=0;j<n;j++) {
                if(arr[i][j]<1||arr[i][j]>nSq) {
                    return false;
                }
                //Number is not distinct
                if(seenArr[arr[i][j]-1]) {
                    return false;
                }
                seenArr[arr[i][j]-1]=true;
                rSum+=arr[i][j];
                cSum+=arr[j][i];
            }
            if(rSum!=validSum||cSum!=validSum) {
                return false;
            }
        }
        return true;
    }
}