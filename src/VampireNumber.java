import java.util.*;
public class VampireNumber {
    //to find vampire numbers within a range
    public void vampire(int start,int end) {
        boolean flag=false;
        System.out.println("Vampire Numbers: ");
        for(int num=start;num<=end;num++) {
            int temp=num,c=0;
            while(temp>0) {                         //counting the number of digits
                c++;
                temp/=10;
            }
            if(c%2!=0)continue;                     //skip numbers with odd number of digits
            int[] arr=new int[c];
            temp=num;
            for(int i=0;i<c;i++) {                  //extracting digits and storing in an array
                arr[i]=temp%10;
                temp/=10;
            }
            if(permute(arr,0,c-1,num)) {
                System.out.print(num+", ");
                flag=true;                          //set flag=true if vampire numbers are found
            }
        }
        if(!flag)System.out.println("NIL");         //if vampire numbers are not found, print "NIL"
    }
    //to generate permutations of digits
    public boolean permute(int[] arr,int l,int r,int original) {
        if(l==r) {                                  //base case: one permutation is formed
            int n1=0,n2=0;
            //first half of permutation
            for(int i=0;i<=r/2;i++)n1=n1*10+arr[i];
            //second half of permutation
            for(int i=r/2+1;i<=r;i++)n2=n2*10+arr[i];
            //checking if two numbers multiply to the original number
            return (n1*n2==original)&&!(n1%10==0&&n2%10==0);
        }else {
            for(int i=l;i<=r;i++) {
                swap(arr,l,i);                      //swap current element with left most element
                if(permute(arr,l+1,r,original))return true; //Recurse with remaining elements
                swap(arr,l,i);                      //backtrack by restoring the original arrangement
            }
        }
        return false;
    }
    //swapping two elements in an array
    public void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        VampireNumber obj=new VampireNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Enter Range (1000 < x < 10000) ---");
        System.out.print("First limit: ");
        int m=sc.nextInt();
        System.out.print("Last limit: ");
        int n=sc.nextInt();
        if(m<1000||n>=10000)                       //checking range within 1000 < x < 10000
            System.out.println("INVALID INPUT! Enter range between 1000 and 10000.");
        else if(m>n)                                //checking the first number is not greater than last
            System.out.println("INVALID INPUT!");
        else
            obj.vampire(m,n);
    }
}
