package datastructures.stack_013;
import java.io.*;
public class CardGame {
    int[] cards;
    int cap,top;
    public CardGame(int cc) {
        cap=cc;
        top=-1;
        cards=new int[cap];
    }
    public void addCard(int v) {
        if(top==cap-1)
            System.out.println("CARD PILE IS FULL!");
        else
            cards[++top]=v;     // FIXED
    }
    public int drawCard() {
        if(top==-1) {
            System.out.println("CARD PILE IS EMPTY!");
            return -9999;
        }else {
            return cards[top--];
        }
    }
    public void display() {
        if(top==-1) {
            System.out.println("CARD PILE IS EMPTY!");
            return;
        }
        for(int i=top;i>=0;i--) {
            if(i==top)
                System.out.println(cards[i]+"<--top");
            else
                System.out.println(cards[i]);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("CARD PILE CAPACITY: ");
        int c=0;
        try {
            c=Integer.parseInt(br.readLine());
            if(c<=0)throw new NumberFormatException();
        }catch(NumberFormatException e) {
            System.out.println("INVALID INPUT! ENTER A VALID POSITIVE INTEGER.");
            System.exit(0);
        }
        CardGame obj=new CardGame(c);
        while(true) {
            System.out.println("------- Menu -------");
            System.out.println("1. ADD CARD");
            System.out.println("2. REMOVE CARD");
            System.out.println("3. DISPLAY CARDS");
            System.out.println("4. EXIT");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            int choice,v;
            try {
                choice=Integer.parseInt(br.readLine());
            }catch(NumberFormatException e) {
                System.out.println("INVALID CHOICE! TRY AGAIN.");
                continue;
            }
            switch(choice) {
                case 1:
                    System.out.print("CARD VALUE: ");
                    try {
                        v=Integer.parseInt(br.readLine());
                        obj.addCard(v);
                    }catch (NumberFormatException e) {
                        System.out.println("INVALID CARD VALUE! ENTER AN INTEGER.");
                    }
                    break;
                case 2:
                    v=obj.drawCard();
                    if(v!=-9999)
                        System.out.println("DRAWN CARD: "+v);
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.println("-------- END -------");
                    return;
                default:
                    System.out.println("INVALID CHOICE! TRY AGAIN.");
            }
        }
    }
}
