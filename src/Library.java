import java.util.*;
public class Library {
    static Scanner sc=new Scanner(System.in);
    String name,author;
    int price,d;
    double r,total_amt;
    Library(String name,String author,int price,int d,int r){
        this.name=name;
        this.author=author;
        this.price=price;
        this.d=d;
        this.r=r;
    }
    public void accept() {
        System.out.println("Enter the name of the book: ");
        name=sc.nextLine();
        System.out.println("Enter the author of the book: ");
        author=sc.nextLine();
        System.out.println("Enter the cost price of the book: ");
        price=sc.nextInt();
        System.out.println("Enter the number of days taken in returning the book: ");
        d=sc.nextInt();
    }
    public void compute() {
        if(d>0&&d<=5)
            r=2.00;
        else if (d>5&&d<=10)
            r=3.00;
        else
            r=5.00;
        total_amt=(((2.0/100)*price)*d)+r;
    }
    public void show() {
        System.out.println("Name of the book: "+name);
        System.out.println("Author of the book: "+author);
        System.out.println("Cost price of the book: "+price);
        System.out.println("Number of days taken in returning the book: "+d);
        System.out.println("Total fine amount to be paid: "+total_amt);
    }
    public static void main(String[]args) {
        Library obj=new Library("","",0,0,0);
        obj.accept();
        obj.compute();
        obj.show();
    }
}