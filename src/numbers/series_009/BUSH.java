package numbers.series_009;
import java.util.*;
public class BUSH {
    static int n;
    long s;
    int temp;
    BUSH() {
        n=0;
    }
    void fnInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        n=sc.nextInt();
    }
    void fnCalculate() {
        int num1=12;
        int num2=23;
        for(int i=0;i<=n;i++) {
            temp=num1*num2;
            System.out.print(temp+", ");
            s+=temp;
            num1+=20;
            num2+=20;
        }
        System.out.println();
    }
    void fnShow() {
        System.out.println("Sum of the series: "+s);
    }
    public static void main(String[] args) {
        BUSH obj=new BUSH();
        obj.fnInput();
        obj.fnCalculate();
        obj.fnShow();
    }
}
