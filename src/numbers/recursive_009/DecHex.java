package numbers.recursive_009;
import java.util.*;
public class DecHex {
    long n;
    String hex;
    static Scanner sc=new Scanner(System.in);
    public DecHex() {
        n=0;hex="";
    }
    public DecHex(int nn) {
        n=nn;
    }
    public void readDec() {
        System.out.print("Enter a decimal number: ");
        n=sc.nextLong();
    }
    public void readHex() {
        System.out.print("Enter a hexadecimal number: ");
        hex=sc.next();
    }
    public String deci_hex(long num) {
        if(num==0)return "";
        int rem=(int)(num%16);
        char hexChar=(rem<10)?(char)(rem+'0'):(char)(rem-10+'A');
        return deci_hex(num/16)+hexChar;
    }
    public long hex_deci(String num,int length) {
        if(length==0)return 0;
        char lastChar=num.charAt(length-1);
        int value=(Character.isDigit(lastChar))?lastChar-'0':Character.toUpperCase(lastChar)-'A'+10;
        return value+16*hex_deci(num,length-1);
    }
    public void displayhex() {
        hex=deci_hex(n);
        if(hex.isEmpty())hex="0";
        System.out.println("Decimal: "+n+"\nHexadecimal: "+hex);
    }
    public void displaydec() {
        n=hex_deci(hex,hex.length());
        System.out.println("Hexadecimal: "+hex+"\nDecimal: " + n);
    }
    public static void main(String[] args) {
        DecHex obj=new DecHex();
        while(true) {
            System.out.println("---- Hexadecimal <--> Decimal Calculator ----");
            System.out.println("1. Decimal to Hexadecimal");
            System.out.println("2. Hexadecimal to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    obj.readDec();
                    obj.displayhex();
                    break;
                case 2:
                    obj.readHex();
                    obj.displaydec();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input! Try Again!");
            }
            System.out.println();
        }
    }
}