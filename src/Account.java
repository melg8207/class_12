import java.util.*;
public class Account extends Bank {
    double amt;double p;
    static Scanner sc=new Scanner(System.in);
    Account(String name,long accno,double p) {
        super(name,accno,p);
        amt=0.0;
    }
    void deposit() {
        System.out.println("Enter amount to be deposited: ");
        amt=sc.nextDouble();
        P+=amt;                                // principal value updated
    }
    void withdraw() {
        System.out.println("Enter amount to be withdrawn: ");
        amt=sc.nextDouble();
        if(amt>P) {
            System.out.println("Insufficient balance!");
        }else {
            P-=amt;
            // penalty if balance after withdrawal is less than 500
            if(P<500) {
                double penalty=(500-P)/10;      // calculate 10% penalty of the shortfall
                P-=penalty;
                System.out.println("Penalty applied: "+penalty);
            }
        }
    }
    @Override
    void display() {
        super.display();
        System.out.println("Bank Account Balance: "+P);
    }
    public static void main(String[] args) {
        Account acc=new Account("",0,0.0);
        acc.read();
        while(true) {
            System.out.println("----- Options -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            int option=sc.nextInt();
            switch(option) {
                case 1:
                    acc.deposit();
                    break;
                case 2:
                    acc.withdraw();
                    break;
                case 3:
                    acc.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
