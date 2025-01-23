package super_sub_classes.program_12;
public class Final extends MidTerm implements Marks {
    double total_final,percentage_final;
    @Override
    public void GetTotal() {                        // abstract class - implementing method from imterface
        total_final=Fm[0]+Fm[1]+Fm[2];
        percentage_final=Math.round((total_final/3.0)*100.0)/100.0;
        super.GetTotal();
        System.out.println("------------- FINAL EXAMINATION --------------");
        System.out.println("Final Examination Total:      "+total_final);
        System.out.println("Final Examination Percentage: "+percentage_final);
    }
}
