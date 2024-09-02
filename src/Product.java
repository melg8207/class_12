import java.util.*;
public class Product {
    String name;
    int code;
    double amount;
    static Scanner sc=new Scanner(System.in);
    Product(String n,int c,double p) {
        name=n;
        code=c;
        amount=p;
    }
    void accept() {
        System.out.println("Enter Product name: ");
        name=sc.nextLine();
        System.out.println("Enter Product code: ");
        code=sc.nextInt();
        System.out.println("Enter Sale Amount: ");
        amount=sc.nextDouble();
    }
    void show() {
        System.out.println("Product name: "+name);
        System.out.println("Product code: "+code);
        System.out.println("Total Sale Amount: "+amount);
    }
}
