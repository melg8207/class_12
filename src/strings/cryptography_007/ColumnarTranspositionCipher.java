package strings.cryptography_007;
import java.util.*;
public class ColumnarTranspositionCipher {
    static Map<Character,Integer> keyMap=new HashMap<>();
    static void setPermutationOrder(String key) {
        keyMap.clear();                             // Clearing any existing key mapping
        // Add the permutation order into the map
        for(int i=0;i<key.length();i++) {
            keyMap.put(key.charAt(i),i);
        }
    }
    // Encryption
    static String encryptMessage(String msg,String key) {
        int row,col;
        StringBuilder cipher=new StringBuilder();
        // Calculate the number of columns in the matrix
        col=key.length();
        // Calculate the maximum number of rows in the matrix
        row=(int)Math.ceil((double)msg.length()/col);
        char[][] matrix=new char[row][col];
        for(int i=0,k=0;i<row;i++) {
            for(int j=0;j<col;) {
                if(k<msg.length()) {
                    char ch=msg.charAt(k);
                    if(Character.isLetter(ch)||ch==' ') {
                        matrix[i][j]=ch;
                        j++;
                    }
                    k++;
                }else {
                    matrix[i][j]='_';               // Add padding character '_'
                    j++;
                }
            }
        }
        for(Map.Entry<Character,Integer> entry:keyMap.entrySet()) {
            int columnIndex=entry.getValue();
            // Get the cipher text from the matrix column-wise using the permuted key
            for(int i=0;i<row;i++) {
                if(Character.isLetter(matrix[i][columnIndex])||matrix[i][columnIndex]==' '||matrix[i][columnIndex]=='_') {
                    cipher.append(matrix[i][columnIndex]);
                }
            }
        }
        return cipher.toString();
    }
    // Decryption
    static String decryptMessage(String cipher,String key) {
        // Calculate the number of columns for the cipher matrix
        int col=key.length();
        int row=(int)Math.ceil((double)cipher.length()/col);
        char[][] cipherMat=new char[row][col];
        // Add characters into the matrix column-wise
        int k=0;
        for(int j=0;j<col;j++) {
            for(int i=0;i<row;i++) {
                cipherMat[i][j]=cipher.charAt(k);
                k++;
            }
        }
        // Update the order of the key for decryption
        int index=0;
        for(Map.Entry<Character,Integer> entry:keyMap.entrySet()) {
            entry.setValue(index++);
        }
        // Arrange the matrix column-wise according to the permutation order
        char[][] decCipher=new char[row][col];
        for(int l=0;l<key.length();l++) {
            int columnIndex=keyMap.get(key.charAt(l));
            for(int i=0;i<row;i++) {
                decCipher[i][l]=cipherMat[i][columnIndex];
            }
        }
        // Get the message using the matrix
        StringBuilder msg=new StringBuilder();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(decCipher[i][j]!='_') {
                    msg.append(decCipher[i][j]);
                }
            }
        }
        return msg.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key for the cipher: ");
        String key=sc.nextLine();
        setPermutationOrder(key);
        System.out.println("Choose an option:");
        System.out.println("Encrypt or Decrypt?: ");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")) {
            System.out.println("Enter message to encrypt: ");
            String msg=sc.nextLine();
            String cipher=encryptMessage(msg,key);
            System.out.println("Encrypted Message: "+cipher);
        }else if (choice.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter message to decrypt: ");
            String cipher=sc.nextLine();
            String decryptedMsg=decryptMessage(cipher,key);
            System.out.println("Decrypted Message: "+decryptedMsg);
        }else {
            System.out.println("Invalid choice!");
        }
    }
}
