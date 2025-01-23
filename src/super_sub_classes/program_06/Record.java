package super_sub_classes.program_06;
import java.util.*;
public class Record {
    String[] n;
    int[] m;
    int size;
    static Scanner sc=new Scanner(System.in);
    public Record(int cap) {
        size=cap;
        n=new String[size];
        m=new int[size];
    }
    public void readarray() {
        System.out.println("Enter name along with marks: ");
        for(int i=0;i<size;i++) {
            n[i]=sc.next();
            m[i]=sc.nextInt();
        }
    }
    public void display() {
        System.out.println();
        System.out.println("Names                           Marks");
        System.out.println("---------------------------------------");
        for(int i=0;i<size;i++) {
            System.out.print(n[i]+"\t\t\t\t\t\t\t"+m[i]);
            System.out.println();
        }
        System.out.println();
    }
}
