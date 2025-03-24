/**
 * Dequeues are doubly-ended queues that contain four operations in total:
 * 1. Insert from Front
 * 2. Delete from Front
 * 3. Insert from Rear
 * 4. Delete from Rear
 * This facilitates insertion and deletion of elements from both the front and rear ends.
 */
package datastructures.queue_013;
import java.util.*;
public class Dequeues {
    int[] q;int size,front,rear;
    public Dequeues(int size) {
        this.size=size;
        q=new int[size];
        front=rear=-1;
    }
    public void Pushfront(int n) {
        if(front==-1) {
            front=rear=0;
            q[front]=n;
        }else if(front>0) {
            q[--front]=n;
        }else {
            System.out.println("Queue Overflow");
        }
    }
    public int Popfront() {
        if(front==-1) {
            System.out.println("Queue Underflow");
            return -9999;
        }
        int n=q[front++];
        if(front>rear) {
            front=rear=-1;
        }
        return n;
    }
    public void pushRear(int n) {
        if(rear==size-1) {
            System.out.println("Queue Overflow");
        }else {
            if(front==-1)
                front=rear=0;
            else
                rear++;
            q[rear]=n;
        }
    }
    public int popRear() {
        if(front==-1) {
            System.out.println("Queue Underflow");
            return -9999;
        }
        int n=q[rear--];
        if(front>rear) {
            front=rear=-1;
        }
        return n;
    }
    public void display() {
        if(front==-1) {
            System.out.println("Empty Queue");
        }else {
            System.out.print("CURRENT QUEUE: ");
            for(int i=front;i<=rear;i++) {
                System.out.print(q[i]+" | ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dequeue capacity: ");
        int x=sc.nextInt();
        int n;
        Dequeues obj=new Dequeues(x);
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
                    n=sc.nextInt();
                    obj.Pushfront(n);
                    break;
                case 2:
                    n=obj.Popfront();
                    if(n!= -9999)
                        System.out.println(n+" popped from the front");
                    break;
                case 3:
                    System.out.print("Element to be pushed: ");
                    n=sc.nextInt();
                    obj.pushRear(n);
                    break;
                case 4:
                    n=obj.popRear();
                    if(n!= -9999)
                        System.out.println(n+" popped from the rear");
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    System.out.println("------- END -------");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE! TRY AGAIN!");
            }
        }
    }
}
