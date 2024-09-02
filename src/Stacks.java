import java.util.*;
public class Stacks {
    int top=-1;
    int size;
    int[] s;
    Stacks(int size) {
        this.size=size;
        s=new int[size];
    }
    public void Push(int x) {
        if(top==size-1) {               // If stack is full
            System.out.println("Stack Overflow");
        }else {
            top+=1;                     // Shifting top index
            s[top]=x;
        }
    }
    public int Pop() {
        if(top==-1) {                   // If stack is empty
            System.out.println("Stack Underflow");
            return -999;
        }else {
            int val=s[top];
            top-=1;                     // Shifting top index
            return val;
        }
    }
    public int Peep() {
        if(top==-1) {
            System.out.println("Stack Underflow");
            return -999;
        }else {
            int val=s[top];
            System.out.println("Top value: "+val);
            return val;
        }
    }
    public void display() {
        if(top==-1) {
            System.out.println("Empty stack");
        }else {
            System.out.println("Current Stack: ");
            for(int i=top;i>=0;i--) {
                System.out.print(s[i]+" | ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int size,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the stack: ");
        size=sc.nextInt();
        Stacks obj=new Stacks(size);
        while(true) {
            System.out.println("------ Menu ------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Exit");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter element to be inserted: ");
                    x=sc.nextInt();
                    obj.Push(x);
                    obj.display();
                    break;
                case 2:
                    obj.Pop();
                    obj.display();
                    break;
                case 3:
                    obj.Peep();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!");
            }
        }
    }
}
