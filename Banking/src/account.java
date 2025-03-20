import java.io.*;
import java.util.*;
public class account implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    String name,id,transactionHistory;
    String balance;
    public account() {
        name="";
        id="";
        transactionHistory=String.format("%-15s%-15s%-15s%-15s\n","Action","Debit","Credit","Balance");
        balance="0";
    }
    public void initialize(database db) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Details");
        System.out.print("Name: ");
        name=in.nextLine();
        boolean flag=true;
        while(flag) {
            System.out.print("ID: ");
            id=in.nextLine();
            flag=db.isIdInUse(id);
            if(flag) {
                System.out.println("ID already in use. Retry.");
            }
        }
    }
}