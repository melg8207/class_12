package super_sub_classes.program_07;
public class Number2 {
    int n;
    public Number2(int nn) {
        n=nn;
    }
    public int factorial(int a) {
        if(a==0)
            return 1;
        else
            return a*factorial(a-1);
    }
    public void display() {
        System.out.println("Factorial of "+n+" = "+factorial(n));
    }
}
