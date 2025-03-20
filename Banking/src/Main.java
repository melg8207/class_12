import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        String id="";
        int failsafe=0;
        // Check if idthreshold.txt exists; if not, create it with default value "0"
        File idFile=new File("idthreshold.txt");
        if(!idFile.exists()) {
            PrintWriter pwCreate=new PrintWriter(new FileWriter(idFile));
            pwCreate.println("0");
            pwCreate.close();
        }
        // Read the failsafe index from the file
        Scanner reader=new Scanner(idFile);
        while(reader.hasNext()) {
            failsafe=reader.nextInt();
        }
        reader.close();
        account ac=new account();
        framework f=new framework();
        // Initialize the database; if issues occur, fix by creating a new database
        try {
            f.init();
        }catch(EOFException|StreamCorruptedException e) {
            f.database.data[1]=new account();
            f.uploadChanges();
            f.init();
        }
        boolean flag=true;
        Scanner in=new Scanner(System.in);
        while(flag) {
            System.out.print("Are you a new user? (yes/no): ");
            String temp=in.next();
            if(temp.equalsIgnoreCase("yes")) {
                ac=new account();
                ac.initialize(f.database);
                flag=false;
            }else if(temp.equalsIgnoreCase("no")) {
                boolean fl=true;
                Scanner in0=new Scanner(System.in);
                System.out.print("Enter your ID: ");
                id=in0.nextLine();
                for(int i=0;i<250;i++) {
                    if(f.database.data[i]!=null&&f.database.data[i].id.equalsIgnoreCase(id)) {
                        ac=f.database.data[i];
                        failsafe=i;
                        fl=false;
                        flag=false;
                        break;
                    }
                }
                if(fl)
                    System.out.println("NoSuchUser Exception");
            }else {
                System.out.println("Invalid Input! Try again.....");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Welcome "+ac.name+", ");
        System.out.println("____________________________________________");
        System.out.println("What do you want to do?");
        System.out.println("1: Withdraw\t\t2: Deposit\n3: Display Details");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.print("Enter your selection: ");
        int choice=in.nextInt();
        switch(choice) {
            case 1:
                System.out.println();
                Scanner c1=new Scanner(System.in);
                System.out.print("Enter the amount you want to withdraw: ");
                String withdraw=c1.nextLine();
                if(Integer.parseInt(ac.balance)<Integer.parseInt(withdraw)) {
                    System.out.println("----- Insufficient Funds -----");
                    System.out.println("----- Transaction Failed -----");
                }else {
                    ac.balance=String.valueOf(Integer.parseInt(ac.balance)-Integer.parseInt(withdraw));
                    // Appending transaction using formatted string for alignment
                    ac.transactionHistory+=String.format("%-15s%-15s%-15s%-15s\n","Withdraw",withdraw,"-----",ac.balance);
                    f.database.data[failsafe]=ac;
                    f.uploadChanges();
                    f.init();
                    System.out.println("Remaining Balance\t:"+ac.balance);
                }
                break;
            case 2:
                Scanner c2=new Scanner(System.in);
                System.out.println();
                System.out.print("Enter the amount you want to deposit: ");
                String deposit=c2.nextLine();
                ac.balance=String.valueOf(Integer.parseInt(ac.balance)+Integer.parseInt(deposit));
                // Appending transaction using formatted string for alignment
                ac.transactionHistory+=String.format("%-15s%-15s%-15s%-15s\n","Deposit","-----",deposit,ac.balance);
                f.database.data[failsafe]=ac;
                f.uploadChanges();
                f.init();
                System.out.println("--- Transaction Successful ---");
                System.out.println("Remaining Balance: "+ac.balance);
                break;
            case 3:
                System.out.println("-------------- Account Details -------------");
                System.out.println("Name    : "+ac.name);
                System.out.println("ID      : "+ac.id);
                System.out.println("Balance : "+ac.balance);
                System.out.println("--------------------------------------------");
                System.out.println("           Transaction History\n"+ac.transactionHistory);
                System.out.println("--------------------------------------------");
                break;
        }
        // Save the updated failsafe index to file (overwrite mode)
        FileWriter fw=new FileWriter("idthreshold.txt",false);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(failsafe+1);
        pw.close();
        bw.close();
        fw.close();
    }
}