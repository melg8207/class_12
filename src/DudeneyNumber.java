import java.util.Scanner;
public class DudeneyNumber {
    // Function to check if a number is a Dudeney number
    static boolean isDudeney(int num) {
        // Calculate the cube root of the number
        int cubeRt=(int) Math.cbrt(num);
        // Check if the cube of the cube root equals the number
        return (cubeRt*cubeRt*cubeRt==num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Dudeney number: ");
        int number=sc.nextInt();
        if(isDudeney(number)) {
            System.out.println(number+" is a Dudeney number.");
        }else {
            System.out.println(number+" is not a Dudeney number.");
        }
    }
}
