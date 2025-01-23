package super_sub_classes.program_10;
import java.util.*;
public class FindGreat extends FindMax {
    int z;
    public FindGreat(int nx,int ny,int nz) {
        super(nx,ny);
        z=nz;
    }
    // GetMax function overloaded
    public int GetMax(int q,int r,int s) {
        if(q>r&&q>s)
            return q;
        else if(r>q&&r>s)
            return r;
        else
            return s;
    }
    public void updateValues(int nx,int ny,int nz) {
        m=nx;n=ny;z=nz;
    }
    public void Show1() {
        int p=GetMax(m,n);
        System.out.println("Greatest from "+m+" and "+n+" is '"+p+"'");
    }
    public void Show2() {
        int d=GetMax(m,n,z);
        System.out.println("Greatest from "+m+", "+n+" and "+z+" is '"+d+"'");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,y=0,z=0;
        FindGreat obj=new FindGreat(x,y,z);
        while(true) {
            System.out.println("---- Options ----");
            System.out.println("1. Greatest of 2 numbers");
            System.out.println("2. Greatest of 3 numbers");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            int choice=sc.nextInt();
            System.out.println();
            switch(choice) {
                case 1:
                    System.out.println("Enter 2 numbers: ");
                    x=sc.nextInt();
                    y=sc.nextInt();
                    obj.updateValues(x,y,0);
                    obj.Show1();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter 3 numbers: ");
                    x=sc.nextInt();
                    y=sc.nextInt();
                    z=sc.nextInt();
                    obj.updateValues(x,y,z);
                    obj.Show2();
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Wrong option!");
                    System.out.println();
            }
        }
    }
}
