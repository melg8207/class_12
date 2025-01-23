package super_sub_classes.program_07;
public class Series extends Number2 {
    int sum;
    public Series(int n) {
        super(n);
        sum=0;
    }
    public void calsum() {
        for(int i=1;i<=n;i++) {
            sum+=super.factorial(i);
        }
    }
    @Override
    public void display() {
        super.display();
        System.out.println();
        System.out.println("Series of factorials: ");
        for(int i=1;i<=n;i++) {
            System.out.print(factorial(i)+", ");
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }
}
