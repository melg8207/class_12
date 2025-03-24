package super_sub_classes.program_15;
public class Compute extends Library {
    int d;double f;
    public Compute(String name,String author,double p,int d) {
        super(name,author,p);
        this.d=d;f=0.0;
    }
    public void fine() {
        int d1=d-7;
        if(d1>=1&&d1<=5)
            f=d1*2;
        else if(d1>-6&&d1<=10)
            f=d1*3;
        else
            f=d1*5;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Fine: "+f);
        System.out.println("Total amount: "+((0.02*p*d)+f));
    }
    public static void main(String[] args) {
        Compute obj=new Compute("The Godfather","Mario Puzo",2000.0,9);
        obj.fine();
        obj.show();
    }
}
