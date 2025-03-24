/**
 * Circular Queues are that which have its front and rear ends next to each other as if connected
 * It can be represented as a circle in terms of its working, but in reality it is still a normal queue like structure only with its front and rear connected.
 */
package datastructures.queue_013;
import java.util.Scanner;
public class CircularQueues {
    int[] q;
    int front,rear,size;
    public CircularQueues(int size) {
        this.size=size;
        q=new int[size];
        front=rear=-1; // Correctly initializing
    }
    public void Enqueue(int n) {
        if((rear+1)%size==front) { // Queue full condition
            System.out.println("Queue Overflow");
        }else {
            if(front==-1)front=0; // First element case
            rear=(rear+1)%size;
            q[rear]=n;
        }
    }
    public int Dequeue() {
        if(front==-1) { // Queue empty condition
            System.out.println("Queue Underflow");
            return -9999;
        }
        int temp=q[front];
        if(front==rear) { // Queue becomes empty after dequeuing the last element
            front=rear=-1;
        }else {
            front=(front+1)%size;
        }
        return temp;
    }
    public void display() {
        if(front==-1) {
            System.out.println("Empty Queue");
        }else {
            System.out.println("Current Queue:");
            int i=front;
            while(true) {
                System.out.print(q[i]+" | ");
                if(i==rear)break;
                i=(i+1)%size;
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int size,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the queue: ");
        size=sc.nextInt();
        CircularQueues obj=new CircularQueues(size);
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