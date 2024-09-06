import java.util.*;
public class NonPalindromeWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence in UPPERCASE terminated by '.', '?' or '!': ");
        String sentence=sc.nextLine();
        // Check if the sentence is terminated properly
        if(!(sentence.endsWith(".")||sentence.endsWith("?")||sentence.endsWith("!"))) {
            System.out.println("INVALID INPUT");
            return;
        }
        // Task 1: Display the count of non-palindromic words
        sentence=sentence.replaceAll("[.!?]$","");
        StringTokenizer st=new StringTokenizer(sentence," ");

        sentence=sentence.toLowerCase();
        int countNonPalindromic=countNonPalindromicWords(st);
        System.out.println("NUMBER OF NON-PALINDROMIC WORDS: "+countNonPalindromic);
        // Task 2: Display all non-palindromic words
        st=new StringTokenizer(sentence," "); // Reset the StringTokenizer
        String nonPalindromicWords=findNonPalindromicWords(st);
        System.out.println(nonPalindromicWords);
    }
    private static int countNonPalindromicWords(StringTokenizer st) {
        int count=0;
        while(st.hasMoreTokens()) {
            String word=st.nextToken();
            if(!isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }
    private static String findNonPalindromicWords(StringTokenizer st) {
        StringBuilder nonPalindromicWords=new StringBuilder("NON-PALINDROMIC WORDS: ");
        while(st.hasMoreTokens()) {
            String word=st.nextToken();
            if(!isPalindrome(word)) {
                nonPalindromicWords.append(word).append(" ");
            }
        }
        return nonPalindromicWords.toString().trim();
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