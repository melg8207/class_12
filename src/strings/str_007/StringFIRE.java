package strings.str_007;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringFIRE {
    public static void breaker(String[][] word, int[] wordHelper) {
        for(int i=0;i<26;i++) {
            word[i][wordHelper[i]]="!END";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to be analysed: ");
        String input=sc.nextLine();
        System.out.println("Enter Characters to be searched and classified: ");
        String search=sc.nextLine();
        // removing non-alphabetical characters
        search=search.replaceAll("[^a-zA-Z]","").toUpperCase();
        // removing duplicate characters
        search=search.replaceAll("(.)\\1+","");
        int l=search.length();
        if(l==0) {
            System.out.println("No valid characters to search!");
            return;
        }
        char[] Database=search.toCharArray();
        String[][] word=new String[26][25];
        int[] wordHelper=new int[26];
        int[] wordHelperX=new int[26];
        StringTokenizer st=new StringTokenizer(input);
        int n=st.countTokens();
        while(st.hasMoreTokens()) {
            String tmp=st.nextToken();
            char temp=Character.toUpperCase(tmp.charAt(0));
            int index=temp-'A';
            word[index][wordHelper[index]]=tmp;
            wordHelper[index]++;
        }
        breaker(word,wordHelper);
        String output="";
        int t=0;
        boolean f1=true;
        while(f1) {
            f1=false;                           // assuming we exit until the match is found
            for(char c:Database) {
                int index = c-'A';
                if (wordHelper[index]==0) {
                    output+=(t%3==0?"*":" *");
                }else {
                    output+=(t%3==0?word[index][wordHelperX[index]]:" "+word[index][wordHelperX[index]]);
                    word[index][wordHelperX[index]]="!END";
                    wordHelperX[index]++;
                    wordHelper[index]--;
                }
                t++;
                if(t%3==0)output+="\n";
                // checking if there's any remaining word
                if(wordHelper[index]>0)f1=true;
            }
        }
        System.out.println("Result\n"+output.trim());
    }
}
