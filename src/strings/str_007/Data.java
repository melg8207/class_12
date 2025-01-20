package strings.str_007;
import java.util.*;
public class Data {
    String Str;             //data member or instance variable
    Data() {                //default constructor
        Str="";
    }
    void accept() {         //function definition to input sentence in Str
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a sentence: ");
        Str=sc.nextLine();
    }
    void computePrint() {   //function definition to compute and print the sentence
        StringTokenizer ss=new StringTokenizer(Str," ?!.");
        int C=ss.countTokens();    //finding number of words in the tokenizer object 'ss'
        System.out.println("Output sentence = "+Str);
        System.out.println("Number of tokens or words in the sentence = "+C);
        System.out.printf("%-20s %s%n","Word","Number of characters");
        while(ss.hasMoreTokens()) {
            String wrd=ss.nextToken();  //extracts word from 'ss' and stores in string variable 'wrd'
            int len=wrd.length();       //finding length of word stored in 'wrd' to compute no of letters
            System.out.printf("%-20s %d%n",wrd,len); //print the word (wrd) and its length(len)
        }
    }
    public static void main(String[] args) {
        Data ob=new Data();
        ob.accept();
        ob.computePrint();
    }
}
