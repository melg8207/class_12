import java.util.*;
public class Potential {
    public static int calP(String w) {
        int sum=0;
        for(int i=0;i<w.length();i++) {
            char ch=w.charAt(i);
            sum=sum+(int)ch;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence (ending with ., ? or !): ");
        String s=sc.nextLine();
        char z=s.charAt(s.length()-1);
        if(z=='.'||z=='?'||z=='!') {
            StringTokenizer st=new StringTokenizer(s," .!?");
            int count=st.countTokens();
            String[] words=new String[count];
            int[] potential=new int[count];
            System.out.println();
            System.out.println("Potential of \""+s+"\": ");
            for(int i=0;i<count;i++) {
                String w=st.nextToken();
                words[i]=w;
                potential[i]=calP(w);
                System.out.println(words[i]+" = "+potential[i]);
            }
            System.out.println();
            System.out.println("Sorted sentence according to potential: ");
            //sorting the words
            int n=count;
            for(int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++) {
                    if(potential[j]>potential[j+1]) {
                        String t=words[j];
                        words[j]=words[j+1];
                        words[j+1]=t;
                    }
                }
            }
            for(int i=0;i<n;i++) {
                System.out.print(words[i]+" ");
            }
        }else {
            System.out.println("Invalid Sentence!");
        }
    }
}
