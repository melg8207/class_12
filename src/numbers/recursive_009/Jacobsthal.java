package numbers.recursive_009;
public class Jacobsthal {
    public int J(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return J(n-1)+2*J(n-2);
    }
    public static void main(String[] args) {
        int n=2000;
        Jacobsthal obj=new Jacobsthal();
        System.out.println("Jacobsthal Numbers (from 0 to 2000): ");
        for(int i=0;i<=n;i++) {
            int j=obj.J(i);
            if(j>2000)
                break;
            System.out.print(j+", ");
        }
    }

}
