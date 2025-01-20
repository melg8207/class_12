package datastructures.linkl_013;
import java.util.*;
public class Node {
    int num;                        // declaring data
    Node next;                      // declaring address of the node
    // inserting node in the linked list
    public void insertbeg(Node Start,int n) {
        Node temp=new Node();
        temp.num=n;
        temp.next=Start.next;
        Start.next=temp;            // refreshing the list in object Start by the new list
        System.out.println("Node inserted at the beginning: "+n);
        display(Start);             // displaying the list after insertion
    }
    public void insertend(Node Start,int n) {
        Node newNode=new Node();
        newNode.num=n;              // setting value of new node
        newNode.next=null;          // setting next to null since it is the last
        // if list is empty new node becomes the last node
        if(Start.next==null) {
            Start.next=newNode;
        }else {
            Node temp=Start;
            // traverse to the end of the list
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        System.out.println("Node inserted at the end: "+n);
        display(Start);             // displaying list after insertion
    }
    // deleting a node from the linked list
    public void deletebeg(Node Start) {
        if(Start.next==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=Start.next;
        Start.next=temp.next;
        temp.next=null;             // refreshing the list in object Start by the new list
        display(Start);
    }
    public void deleteend(Node Start) {
        // if list is empty, new node becomes the last node
        if(Start.next==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=Start;
        Node prev=null;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        if(prev==null) {
            Start.next=null;
        }else {
            prev.next=null;
        }
        System.out.println("Last node deleted");
        display(Start);             // displaying list after deletion
    }
    // traversal of the list
    public void traverse(Node Start) {
        Node temp=Start.next;       // starting with the first actual node
        System.out.println("Traversal of the list: ");
        while(temp!=null) {
            System.out.print(temp.num+" | ");
            temp=temp.next;         // redirecting address to the next node (traversal)
        }
        System.out.println();
    }
    // sum of all elements in the list
    public int sumOfElements(Node Start) {
        int sum=0;
        Node temp=Start.next;       // starting with the first actual node
        while(temp!=null) {
            sum+=temp.num;          // adding current node's value to sum
            temp=temp.next;         // redirecting address to the next node (traversal)
        }
        System.out.println("Sum of all elements in this list: "+sum);
        return sum;
    }
    // counting the number of nodes containing only even integers
    public int countEven(Node Start) {
        int c=0;
        Node temp=Start.next;
        while(temp!=null) {
            if(temp.num%2==0) {
                c++;
            }
            temp=temp.next;
        }
        System.out.println("Number of nodes that contain only even integers: "+c);
        return c;
    }
    // counting the number of nodes containing only even integers
    public int countOdd(Node Start) {
        int c=0;
        Node temp=Start.next;    // starting with the first actual node
        while(temp!=null) {
            if(temp.num%2!=0)
                c++;
            temp=temp.next;         // redirecting address to the next node (traversal)
        }
        System.out.println("Number of nodes that contain only odd integers: "+c);
        return c;
    }
    // searching for a number in the list
    public void FindNode(Node Start,int b) {
        Node temp=Start.next;         // starting with the first actual node
        while(temp!=null) {
            if(temp.num==b) {
                System.out.println(b+" is found in this list");
                return;
            }
            temp=temp.next;         // redirecting address to the next node (traversal)
        }
    }
    // method to display the current linked list
    public void display(Node d) {
        Node temp=d.next;
        System.out.println("Current linked list: ");
        while(temp!=null) {
            System.out.print(temp.num+" | ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        Node head=new Node();
        head.next=null;
        while(true) {
            System.out.println("--------------------- Menu ----------------------");
            System.out.println("1. Insert a node at the beginning");
            System.out.println("2. Insert a node at the end");
            System.out.println("3. Delete a node from the beginning");
            System.out.println("4. Delete a node from the end");
            System.out.println("5. Traverse the list");
            System.out.println("6. Find the sum of all the elements in the list");
            System.out.println("7. Count the number of nodes having even integers");
            System.out.println("8. Count the number of nodes having odd integers");
            System.out.println("9. Search for a number in the list");
            System.out.println("10. Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the number to be inserted at the beginning: ");
                    n=sc.nextInt();
                    head.insertbeg(head,n);
                    break;
                case 2:
                    System.out.println("Enter the number to be inserted at the end");
                    n=sc.nextInt();
                    head.insertend(head,n);
                    break;
                case 3:
                    head.deletebeg(head);
                    break;
                case 4:
                    head.deleteend(head);
                    break;
                case 5:
                    head.traverse(head);
                    break;
                case 6:
                    head.sumOfElements(head);
                    break;
                case 7:
                    head.countEven(head);
                    break;
                case 8:
                    head.countOdd(head);
                    break;
                case 9:
                    System.out.println("Enter the number to be searched: ");
                    int b=sc.nextInt();
                    head.FindNode(head,b);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }
}
