import java.util.*;
public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence terminated by '.', '?' or '!':");
        String sentence=sc.nextLine();
        if(!(sentence.endsWith(".")||sentence.endsWith("?")||sentence.endsWith("!"))) {
            System.out.println("INVALID INPUT");
            return;
        }
        // Task 1: Reduce extra blank spaces between words to a single blank space
        sentence=sentence.trim().replaceAll("\\s+"," ");
        // Task 2: Remove punctuation at the end
        sentence=sentence.replaceAll("[.!?]$","");
        // Task 3: Convert the sentence to UPPERCASE
        String uppercaseSentence=sentence.toUpperCase();
        // Task 4: Print the UPPERCASE sentence
        System.out.println("UPPERCASE SENTENCE: "+uppercaseSentence);
        // Find and print the longest palindrome words
        StringTokenizer st=new StringTokenizer(uppercaseSentence);
        String longestPalindromeWords=findLongestPalindrome(st);
        System.out.println("LONGEST PALINDROME WORDS: "+longestPalindromeWords);
    }
    private static String findLongestPalindrome(StringTokenizer st) {
        String longest="";
        int maxLength=0;
        while(st.hasMoreTokens()) {
            String word=st.nextToken();
            if(isPalindrome(word)) {
                if(word.length()>maxLength) {
                    maxLength=word.length();
                    longest=word;
                }else if(word.length()==maxLength) {
                    longest+=", "+word;
                }
            }
        }
        return longest;
    }
    private static boolean isPalindrome(String word) {
        int i=0;
        int j=word.length()-1;
        while(i<j) {
            if(word.charAt(i)!=word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
