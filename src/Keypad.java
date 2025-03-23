/**
 * To count total number of keystrokes required to type the word in a cell phone
 * Usual Cell Phone Keypad Arrangement:
 *   _____________________________
 *   |        |   ABC   |   DEF  |
 *   |   1    |    2    |    3   |
 *   |________|_________|________|
 *   |   GHI  |   JKL   |   MNO  |
 *   |   4    |    5    |    6   |
 *   |________|_________|________|
 *   |   PQRS |   TUV   |   WXYZ |
 *   |   7    |    8    |    9   |
 *   |________|_________|________|
 *   |        | [SPACE] |        |
 *   |        |    0    |        |
 *   |________|_________|________|
 */

import java.util.Scanner;
public class Keypad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("--------------- Cell Phone ---------------");
        System.out.println();
        System.out.println("      _____________________________");
        System.out.println("      |        |   ABC   |   DEF  |");
        System.out.println("      |   1    |    2    |    3   |");
        System.out.println("      |________|_________|________|");
        System.out.println("      |   GHI  |   JKL   |   MNO  |");
        System.out.println("      |   4    |    5    |    6   |");
        System.out.println("      |________|_________|________|");
        System.out.println("      |   PQRS |   TUV   |   WXYZ |");
        System.out.println("      |   7    |    8    |    9   |");
        System.out.println("      |________|_________|________|");
        System.out.println("      |        | [SPACE] |        |");
        System.out.println("      |        |    0    |        |");
        System.out.println("      |________|_________|________|");
        System.out.println();
        System.out.println("----------------------------------------- ");
        System.out.println();
        System.out.print("Enter the word: ");
        String word=in.next().toUpperCase();
        int count=0;
        for(int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
            if(!Character.isLetter(ch)) {
                System.out.println("INVALID ENTRY");
                return;
            }
            if("ADGJMPTW".indexOf(ch)>=0)
                count++;
            else if("BEHKNQUX".indexOf(ch)>=0)
                count+=2;
            else if("CFILORVY".indexOf(ch)>=0)
                count+=3;
            else
                count+=4;
        }
        System.out.println("Number of keystrokes = "+count);
    }
}