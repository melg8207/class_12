import java.util.*;
public class BinarySearch {
    static Scanner sc=new Scanner(System.in);
    boolean flag=false;
    int lower,upper,N,K;
    int[] M;
    public void input() {
        M=new int[N];
        for(int i=0;i<N;i++) {
            M[i]=sc.nextInt();
        }
        Arrays.sort(M);  // Sort the array before binary search
    }
    public void sort() {
        lower=0;  // Lower bound starts from 0
        upper=N-1;  // Upper bound is N-1
        while(lower<=upper) {
            int mid=(lower+upper)/2;
            if(M[mid]==K) {
                flag=true;
                break;
            }else if(M[mid]>K) {
                upper=mid-1;
            }else {
                lower=mid+1;
            }
        }
    }
    public static void main(String[] args) {
        BinarySearch obj=new BinarySearch();
        System.out.print("Enter size of the array: ");
        obj.N=sc.nextInt();
        System.out.print("Enter elements in the array: ");
        obj.input();
        System.out.println("------------------------------------------");
        System.out.print("Enter number to be searched: ");
        obj.K=sc.nextInt();
        obj.sort();
        if(obj.flag) {
            System.out.println("Number "+obj.K+" found in the array");
        }else {
            System.out.println("Number not found!");
        }
    }
}