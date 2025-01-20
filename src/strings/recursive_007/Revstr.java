package strings.recursive_007;
import java.util.Scanner;
class Revstr {
    // strings.str_007.Data members/instance variables
    private String str;
    private String revst;
    // Constructor to initialize the variables
    public Revstr() {
        str="";
        revst="";
    }
    // Method to accept a string
    public void getStr() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=sc.nextLine();
    }
    // Method to reverse the string using recursive technique
    public void recReverse(int index) {
        if(index>=0) {
            revst+=str.charAt(index);
            recReverse(index-1);
        }
    }
    // Method to display the original string, its reverse and check for palindrome
    public void check() {
        // Initialize revst to an empty string before starting recursion
        revst="";
        // Call the recursive method to reverse the string
        recReverse(str.length()-1);
        // Display the original and reversed string
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+revst);
        // Check if the string is a palindrome
        if(str.equals(revst)) {
            System.out.println("The string is a palindrome.");
        }else {
            System.out.println("The string is not a palindrome.");
        }
    }
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Revstr revstr=new Revstr();
        revstr.getStr();
        revstr.check();
    }
}