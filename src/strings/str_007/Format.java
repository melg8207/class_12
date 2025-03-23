package strings.str_007;
import java.io.*;
public class Format {
    String str="",newstr="";
    int count;
    public void accept() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter sentence: ");
            str=br.readLine().trim();
            int len=str.length();
            char c=str.charAt(len-1);
            if(c=='.'||c=='?'||c=='!')
                str=str.substring(0,len-1);
            str=str.toUpperCase();
            newstr="";
        }catch (Exception ignored) {}
    }
    public int find(String w) {
        char first=w.charAt(0);char last=w.charAt(w.length()-1);
        String vow="AEIOU";
        if(vow.indexOf(first)!=-1&&vow.indexOf(last)!=-1) return 1;
        return 0;
    }
    public void new_format() {
        String[] arr=str.split("\\s+");
        String temp1="",temp2="";
        count=0;
        for(int i=0;i<arr.length;i++) {
            if(find(arr[i])==1) {
                temp2+=arr[i]+" ";
                count++;
            }else temp1+=arr[i]+" ";
        }
        newstr=(temp1+temp2).trim();
    }
    public void show() {
        System.out.println("Original Sentence: "+str);
        System.out.println("New Sentence: "+newstr);
        System.out.println("Number of words beginning and ending with vowels: "+count);
    }
    public static void main(String[] args) {
        Format obj=new Format();
        obj.accept();
        obj.new_format();
        System.out.println();
        obj.show();
    }
}
