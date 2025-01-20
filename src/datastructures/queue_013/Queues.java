package datastructures.queue_013;
import java.util.*;
public class Queues {
    int front=-1;
    int rear=-1;
    int size;
    int[] q;
    Queues(int size) {
        this.size=size;
        q=new int[size];
    }
    public void Enqueue(int x) {
        if(rear==size-1) {                  // If the queue is full
            System.out.println("Queue Overflow");
        }else if(front==-1&&rear==-1) {     // If the queue is empty
            front++;                        // shifting front index
            rear++;                         // shifting rear index
            q[rear]=x;
        }else {
            rear++;                         // shifting rear index
            q[rear]=x;
        }
    }
    public int Dequeue() {
        if(front==-1&&rear==-1) {           // If the queue is empty
            System.out.println("Queue Underflow");
            return -9999;
        }else if(front==rear) {             // If queue has only one element
            int val=q[front];
            front=rear=-1;                  // reducing the index of front and rear
            return val;
        }else {
            int temp=q[front];
            front++;                        // shifting front index (leaving behind the old value for deletion)
            return temp;
        }
    }
    public void display() {
        if(front==-1&&rear==-1) {
            System.out.println("Empty Queue");
        }else {
            System.out.println("Current Queue: ");
            for(int i=front;i<=rear;i++) {
                System.out.print(q[i]+" | ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int size,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the queue: ");
        size=sc.nextInt();
        Queues obj=new Queues(size);
        while(true) {
            System.out.println("------ Menu ------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter element to be inserted: ");
                    num=sc.nextInt();
                    obj.Enqueue(num);
                    obj.display();
                    break;
                case 2:
                    obj.Dequeue();
                    obj.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!");
            }
        }
    }
}
