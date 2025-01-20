package numbers.series_009;
public class TwistedPrime {
    //checking number is prime or not
    public boolean prime(int n) {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++) {
            if(n%i==0)              //if divisible by any other number than 1 and itself, then it's not prime
                return false;
        }
        return true;
    }
    //finding reverse of number
    public int reverse(int n) {
        int rev=0;
        while(n>0) {
            rev=rev*10+n%10;        //storing reverse number in rev
            n/=10;
        }
        return rev;
    }
    //checking whether the reverse number is prime
    public boolean reverseprime(int n) {
        int rev=reverse(n);
        return prime(rev);
    }
    public static void main(String[] args) {
        TwistedPrime obj=new TwistedPrime();
        int m=100,n=1500;
        System.out.println("Twisted Prime Numbers: ");
        for(int i=m;i<=n;i++) {
            if(obj.prime(i)&&obj.reverseprime(i))
                System.out.print(i+", ");
        }
    }
}
