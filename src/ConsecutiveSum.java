import java.util.*;
public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++) {
            int sum=0,x=i;
            String s="";                //to store the combinations
            do {
                sum+=x;
                s=s+x+"+";
                x++;
            }while(sum<n);
            if(sum==n)
                System.out.println(s.substring(0,s.length()-1));
        }
    }
}
