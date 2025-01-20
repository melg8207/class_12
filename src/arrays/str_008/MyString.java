package arrays.str_008;
import java.util.*;
class MyString {
    String str;
    String[] arr;
    int len;
    String newStr;
    MyString() {
        str="";
        arr=new String[80];
        len=0;
        newStr="";
    }
    void Accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence (maximum 80 words):");
        str=sc.nextLine();
        sc.close();
    }
    void fillArray() {
        arr=str.split(" ");
        len=arr.length;
    }
    void Arrange() {
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(String word:arr) {
            sb.append(word).append(" ");
        }
        newStr=sb.toString().trim();
    }
    void Show() {
        System.out.println("Original sentence: "+str);
        System.out.println("Sorted sentence: "+newStr);
        System.out.println("Smallest word: "+arr[0]);
        System.out.println("Largest word: "+arr[len-1]);
    }
    public static void main(String[] args) {
        MyString myString=new MyString();
        myString.Accept();
        myString.fillArray();
        myString.Arrange();
        myString.Show();
    }
}
