package arrays.sd_008;
import java.util.*;
public class Sports {
    double[] height;int n;
    String name;
    static Scanner sc=new Scanner(System.in);
    public Sports() {
        n=0;name="";
    }
    public Sports(int n,String name) {
        this.n=n;this.name=name;
        height=new double[n];
    }
    public void fillHeight() {
        System.out.println("Enter height of "+n+" players: ");
        for(int i=0;i<n;i++) {
            System.out.print("Player "+(i+1)+": ");
            height[i]=sc.nextDouble();
        }
    }
    public double averageHeight() {
        if(n==0)return 0.0;
        double sum=0.0;
        for(int i=0;i<n;i++) {
            sum+=height[i];
        }
        return sum/n;
    }
    public String compare(Sports s1,Sports s2) {
        double avg1=s1.averageHeight();
        double avg2=s2.averageHeight();
        if(avg1>avg2) {
            return s1.name;
        }else if(avg2>avg1) {
            return s2.name;
        }else {
            return "Both teams have the same average height.";
        }
    }
    public void display(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Sports s1=new Sports(5,"Team A");
        Sports s2=new Sports(5,"Team B");
        s1.fillHeight();
        s2.fillHeight();
        System.out.println();
        String higherTeam=s1.compare(s1,s2);
        if(higherTeam.equals(s1.name))
            s1.display("Team A's average height is higher.");
        else if(higherTeam.equals(s2.name))
            s2.display("Team B's average height is higher.");
        else
            System.out.println(higherTeam);
    }
}