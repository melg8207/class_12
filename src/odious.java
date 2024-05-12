import java.util.Scanner;
class odious {
    private final int[] num;
    private final int n;
    static Scanner sc=new Scanner(System.in);
    // Default constructor
    odious() {
        num=new int[150];
        n=0;
        for(int i=0;i<num.length;i++) {
            num[i]=0;
        }
    }
    // Parameterized constructor
    odious(int nx) {
        num=new int[nx];
        n=nx;
    }
    // Method to input array elements
    void inputArray() {
        System.out.println("Enter "+n+" integer elements:");
        for(int i=0;i<n;i++) {
            num[i]=sc.nextInt();
        }
    }
    // Method to check if a number is odious
    boolean isOdious(int x) {
        int countOnes=0;
        while(x!=0) {
            if(x%2==1) {
                countOnes++;
            }
            x/=2;
        }
        return countOnes%2==1;
    }
    // Method to print odious numbers from the array
    void printOdious() {
        System.out.println("Odious numbers in the array:");
        for(int i=0;i<n;i++) {
            if(isOdious(num[i])) {
                System.out.println(num[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        int size=sc.nextInt();
        odious obj=new odious(size);
        obj.inputArray();
        obj.printOdious();
    }
}

