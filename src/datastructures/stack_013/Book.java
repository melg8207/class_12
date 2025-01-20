package datastructures.stack_013;
import java.util.*;
public class Book {
    String[] Name;
    int Point;
    static int Max;
    Book(int cap) {
        Max=cap;
        Point=-1;
        Name=new String[Max];
    }
    void tell() {
        if(Point==-1) {
            System.out.println("SHELF EMPTY");
        }else {
            System.out.println("Current book on top: "+Name[Point]);
        }
    }
    void add(String v) {
        if(Point==Max-1) {
            System.out.println("SHELF FULL");
        }else {
            Point++;
            Name[Point]=v;
            System.out.println("Added \""+v+"\" to the shelf");
        }
    }
    void display() {
        if(Point==-1) {
            System.out.println("SHELF EMPTY");
        }else {
            System.out.println("Books on shelf: ");
            for(int i=0;i<=Point;i++) {
                System.out.println(Name[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter capacity of bookshelf (number of books): ");
        Max=sc.nextInt();
        Book shelf=new Book(Max);
        while(true) {
            System.out.println("1. Add - Adds a book to the shelf");
            System.out.println("2. Tell - Tells the topmost book");
            System.out.println("3. Display - Displays all the books in the shelf");
            System.out.println("4. Exit");
            System.out.println("Enter action (add, tell, display, exit): ");
            String action=sc.nextLine();
            if(action.equalsIgnoreCase("add")) {
                System.out.println("Enter book name to add: ");
                String bookname=sc.nextLine();
                shelf.add(bookname);
            }else if(action.equalsIgnoreCase("tell")) {
                shelf.tell();
            }else if(action.equalsIgnoreCase("display")) {
                shelf.display();
            }else if(action.equalsIgnoreCase("exit")) {
                break;
            }else {
                System.out.println("Invalid action!");
            }
        }
    }
}
