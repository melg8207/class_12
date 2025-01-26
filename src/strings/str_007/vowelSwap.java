package strings.str_007;
import java.io.*;
import java.util.*;
public class vowelSwap {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args)throws IOException {
        System.out.print("Enter a Sentence to be Vowel Swapped: ");
        String input=in.nextLine();
        char[] inp=new char[input.length()];
        int[] vowelPos=new int[input.length()];
        for(int i=0;i<input.length();i++) {
            inp[i]=input.charAt(i);
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')
                vowelPos[i]=1;
            else
                vowelPos[i]=0;
        }
        for(int i=0;i<input.length();i++){
            if(vowelPos[i]==1){
                for(int j=input.length()-1;j>0;j--){
                    if (vowelPos[j]==1){
                        char temp=inp[j];
                        inp[j]=inp[i];
                        inp[i]=temp;
                        vowelPos[j]=0;
                        vowelPos[i]=0;
                        break;
                    }
                }
            }
        }
        System.out.println("Vowel swapped: ");
        for (int i=0;i<input.length();i++){
            System.out.print(inp[i]);
        }
    }
}
