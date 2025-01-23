package super_sub_classes.program_06;
import java.util.*;
public class rec extends Record {
    public rec(int cap) {               // getting value from super class
        super(cap);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int in=sc.nextInt();
        rec r=new rec(in);              // instance of rec to call methods from super class
        r.readarray();
        r.display();
        Highest h=new Highest(in);      // instance of sibling class to call methods from sibling class
        h.n=r.n;
        h.m=r.m;
        h.size=r.size;
        h.find();
        h.displayHighest();
    }
}
