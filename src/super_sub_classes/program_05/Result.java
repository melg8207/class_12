package super_sub_classes.program_05;
import java.util.*;
public class Result extends Student {
    static float sub1,sub2,sub3,tot,avg;
    String stream;
    Result() {
        sub1=0;sub2=0;sub3=0;tot=0;avg=0;
        stream="";
    }
    Result(float s1,float s2,float s3,int r1,int id) {
        super(r1,id);
        sub1=s1;sub2=s2;sub3=s3;
    }
    void calculate() {
        tot=gettotal(sub1,sub2,sub3);
        avg=getaverage(sub1,sub2,sub3);
    }
    float gettotal(float s1,float s2,float s3) {
        return s1+s2+s3;
    }
    float getaverage(float s1,float s2,float s3) {
        return (s1+s2+s3)/3;
    }
    void getstream() {
        if(avg>=80)
            stream="Science";
        else if(avg>=60)
            stream="Commerce";
        else
            stream="Arts";
    }
    void display() {
        getstream();
        System.out.println("Total marks: "+tot);
        System.out.println("Average marks: "+avg);
        System.out.println("Stream: "+stream);
    }
    public static void main(String[] args) {
        Result obj=new Result();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in 3 subjects: ");
        sub1=sc.nextFloat();
        sub2=sc.nextFloat();
        sub3=sc.nextFloat();
        obj.calculate();
        obj.getstream();
        obj.display();
    }
}
