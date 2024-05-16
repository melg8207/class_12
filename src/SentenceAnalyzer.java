import java.util.Scanner;
public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence terminated by '.' or '?' only:");
        String sentence=sc.nextLine().trim();
        // Check if the input ends with '.' or '?'
        if(!sentence.endsWith(".")&&!sentence.endsWith("?")) {
            System.out.println("Error: Input sentence must end with '.' or '?'");
            return;
        }
        System.out.println("\nOutput sentence: ");
        System.out.println(capitalize(sentence));
        // Convert the first letter of each word to uppercase
        StringBuilder word=new StringBuilder();
        boolean newWord=true;
        // Print the header
        System.out.printf("%-20s%-20s%-20s\n","Word","Vowels","Consonants");
        // Iterate through each character of the sentence
        for(int i=0;i<sentence.length();i++) {
            char ch=sentence.charAt(i);
            if(Character.isLetter(ch)) {
                // Append character to the current word
                word.append(ch);
                newWord=false;
            }else if(ch==' ') {
                // If space encountered, process the word
                if(!newWord) {
                    processWord(word.toString());
                    word.setLength(0); // Clear word
                    newWord=true;
                }
            }
        }
        // Process the last word if not processed already
        if(!newWord) {
            processWord(word.toString());
        }
    }
    // Method to process a word
    private static void processWord(String word) {
        // Convert the first letter to uppercase
        word=word.substring(0,1).toUpperCase()+word.substring(1);
        int vowels=countVowels(word);
        int consonants=word.length() - vowels;
        System.out.printf("%-20s%-20d%-20d\n",word,vowels,consonants);
    }
    // Method to count vowels in a word
    private static int countVowels(String word) {
        int count=0;
        for(int i=0;i<word.length();i++) {
            char ch=Character.toLowerCase(word.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        return count;
    }
    // Method to capitalize the first letter of each word in a sentence
    private static String capitalize(String sentence) {
        StringBuilder result=new StringBuilder();
        boolean capitalizeNext=true;
        for(char ch:sentence.toCharArray()) {
            if(Character.isLetter(ch)) {
                result.append(capitalizeNext?Character.toUpperCase(ch):Character.toLowerCase(ch));
                capitalizeNext=false;
            }else {
                result.append(ch);
                capitalizeNext=true;
            }
        }
        return result.toString();
    }
}