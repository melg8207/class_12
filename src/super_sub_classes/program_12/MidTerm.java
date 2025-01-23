package super_sub_classes.program_12;
public class MidTerm implements Marks {
    double total_mid_term,percentage_mid_term;
    @Override
    public void GetTotal() {                       // abstract method - implementing method from interface
        total_mid_term=Hm[0]+Hm[1]+Hm[2];
        percentage_mid_term=Math.round((total_mid_term/3.0)*100.0)/100.0;
        System.out.println("------------ MID-TERM EXAMINATION ------------");
        System.out.println("Mid-term Examination Total:      "+total_mid_term);
        System.out.println("Mid-term Examination Percentage: "+percentage_mid_term);
    }
}
