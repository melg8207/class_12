package datastructures.queue_013;
import java.util.*;
public class Recycle {
    int[] ele;
    int cap;
    int front;
    int rear;
    public Recycle(int max) {
        if(max>100)
            max=100;
        cap=max;
        ele=new int[cap];
        front=0;
        rear=0;
    }
    public void pushFront(int v) {
        if(front==0) {
            System.out.println("QUEUE IS FULL FROM THE FRONT");
        } else {
            ele[--front]=v;
        }
    }
    public int popFront() {
        if(front==rear)
            return -999;
        else {
            int v=ele[front++];
            if(front==rear) { // Reset when queue becomes empty
                front=0;
                rear=0;
            }
            return v;
        }
    }
    public void pushRear(int v) {
        if(rear==cap) {
            System.out.println("QUEUE IS FULL FROM THE REAR");
        } else {
            ele[rear++]=v;
        }
    }
    public int popRear() {
        if(front==rear)
            return -999;
        else {
            int v=ele[--rear];
            if(front==rear) { // Reset when queue becomes empty
                front=0;
                rear=0;
            }
            return v;
        }
    }
    public void display() {
        if(front==rear) {                           // condition to check empty queue before printing
            System.out.println("EMPTY QUEUE");
        }else {
            System.out.println("CURRENT QUEUE: ");
            for(int i=front;i<rear;i++) {
                System.out.print(ele[i]+" | ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dequeue capacity: ");
        int c=sc.nextInt();
        int v;
        Recycle obj=new Recycle(c);
        while(true) {
            System.out.println("-------- Options --------");
            System.out.println("1. Push front");
            System.out.println("2. Pop front");
            System.out.println("3. Push rear");
            System.out.println("4. Pop rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Element to be pushed: ");
                    v=sc.nextInt();
                    obj.pushFront(v);
                    break;
                case 2:
                    v=obj.popFront();
                    if(v==-999)
                        System.out.println("QUEUE IS EMPTY FROM THE FRONT");
                    else
                        System.out.println(v+" POPPED FROM THE FRONT");
                    break;
                case 3:
                    System.out.print("Element to be pushed: ");
                    v=sc.nextInt();
                    obj.pushRear(v);
                    break;
                case 4:
                    v=obj.popRear();
                    if(v==-999)
                        System.out.println("QUEUE IS EMPTY FROM THE REAR");
                    else
                        System.out.println(v+" POPPED FROM THE REAR");
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    System.out.println("------- END -------");
                    sc.close(); // Closing scanner to prevent resource leak
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE! TRY AGAIN!");
            }
        }
    }
}