package numbers.recursive_009;
import java.util.Scanner;
public class NumDude {
    static int num;
    static Scanner sc=new Scanner(System.in);
    NumDude(int n) {
        num=n;
    }
    void input() {
        System.out.println("Enter a number: ");
        num=sc.nextInt();
    }
    int sumDigits(int x) {
        if(x==0)
            return 0;
        else
            return (x%10)+sumDigits(x/10);
    }
    void isDude() {
        System.out.println();
        int num2=(int)Math.pow(sumDigits(num),3);
        if(num==num2) {
            System.out.println("It is a Dudeney Number.");
        }else {
            System.out.println("It is not a Dudeney Number.");
        }
    }
    public static void main(String[] args) {
        NumDude obj=new NumDude(num);
        obj.input();
        obj.isDude();
    }
}
