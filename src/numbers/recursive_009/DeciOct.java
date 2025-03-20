package numbers.recursive_009;
public class DeciOct {
    int n,oct;
    DeciOct() {
        n=0;oct=0;
    }
    DeciOct(int nn) {
        n=nn;oct=0;
    }
    void deci_oct() {
        int t=n;int place=1;
        while(t>0) {
            int r=t%8;
            t=t/8;
            oct+=r*place;
            place*=10;
        }
    }
    void display() {
        deci_oct();
        System.out.println("Decimal: "+n+"\tOctal: "+oct);
    }
    public static void main(String[] args) {
        DeciOct ob1=new DeciOct();
        DeciOct ob2=new DeciOct(25);
        ob1.display();
        ob2.display();
    }
}
