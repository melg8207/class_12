import java.util.Scanner;
public class WordSort {
    // Function to sort characters of a word alphabetically
    public static String sortCharacters(String word) {
        char[] charArray=word.toCharArray();
        for(int i=0;i<charArray.length;i++) {
            for(int j=i+1;j<charArray.length;j++) {
                if(charArray[i]>charArray[j]) {
                    char temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence (terminate with '.'): ");
        String sentence=sc.nextLine().trim().toLowerCase();
        // Split the sentence into words
        String[] words=sentence.split("\\s+");
        // Calculate the length of the sentence
        int length=words.length;
        // Sort each word alphabetically
        StringBuilder arrangedSentence=new StringBuilder();
        for(String word:words) {
            arrangedSentence.append(sortCharacters(word)).append(" ");
        }
        // Remove trailing space
        arrangedSentence.deleteCharAt(arrangedSentence.length()-1);
        // Print results
        System.out.println("LENGTH: "+length);
        System.out.println("ARRANGED SENTENCE: "+arrangedSentence);
        sc.close();
    }
}