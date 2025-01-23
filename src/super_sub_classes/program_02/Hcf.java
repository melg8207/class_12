package super_sub_classes.program_02;
public class Hcf extends Calculate {
    int h;
    void findhcf(int num1,int num2) {
        while(num2!=0) {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        h=num1;
    }
    void show() {
        System.out.println("HCF = "+h);
    }
    public static void main(String[] args) {
        Hcf obj=new Hcf();
        obj.accept();
        obj.display();
        obj.findhcf(n1,n2);
        obj.show();
    }
}
