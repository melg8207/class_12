package arrays.sd_008;
import java.util.*;
public class Collection {
    int size;
    int[] arr;
    static Scanner sc=new Scanner(System.in);
    public Collection() {
        size=0;
        arr=new int[100];
    }
    public Collection(int size) {
        this.size=size;
        arr=new int[size];
    }
    public void input() {
        System.out.print("Enter number of elements: ");
        size=sc.nextInt();
        System.out.println("\nEnter "+size+" elements: ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
    }
    public Collection common(Collection c) {
        Collection temp=new Collection();
        for(int i=0;i<size;i++) {
            for(int j=0;j<c.size;j++) {
                if(arr[i]==c.arr[j]) {
                    boolean flag=false;
                    for(int k=0;k<temp.size;k++) {
                        if(temp.arr[k]==arr[i]) {
                            flag=true;
                            break;
                        }
                    }
                    if(!flag) {
                        temp.arr[temp.size]=arr[i];
                        temp.size++;
                    }
                }
            }
        }
        return temp;
    }
    public void arrange() {
        for(int i=0;i<size-1;i++) {
            for(int j=0;j<size-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void display() {
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        Collection obj=new Collection();
        Collection c1=new Collection();
        Collection c2=new Collection();
        System.out.println("---- First Collection ---");
        c1.input();
        System.out.println();
        System.out.println("--- Second Collection ---");
        c2.input();
        System.out.println();
        Collection c3=c1.common(c2);
        System.out.println("Common elements: ");
        c3.display();
        System.out.println("\nSorted common elements: ");
        c3.arrange();
        c3.display();
    }
}
