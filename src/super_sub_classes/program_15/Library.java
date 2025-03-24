package super_sub_classes.program_15;
public class Library {
    String name,author;
    double p;
    public Library(String name,String author,double p) {
        this.name=name;this.author=author;
        this.p=p;
    }
    public void show() {
        System.out.println("Name of the Book: "+name);
        System.out.println("Name of Author: "+author);
        System.out.println("Price of the Book: "+p);
    }
}