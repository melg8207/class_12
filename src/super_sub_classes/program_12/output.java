package super_sub_classes.program_12;
import java.util.*;
public class output extends Final {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        output obj=new output();
        System.out.println("Enter marks for Mid-term Examination (3 subjects): ");
        for(int i=0;i<3;i++) Hm[i]=sc.nextDouble();
        System.out.println("Enter marks for Final Examination (3 subjects): ");
        for(int i=0;i<3;i++) Fm[i]=sc.nextDouble();
        obj.GetTotal();
    }
}
