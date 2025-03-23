package arrays.str_008;
import java.io.*;
public class Anagram {
    String s1,s2;
    int l1,l2;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public Anagram(String s1,String s2) {
        this.s1=s1;
        this.s2=s2;
    }
    public void input() {
        try {
            System.out.println("Enter two words: ");
            s1=br.readLine();
            s2=br.readLine();
        }catch(Exception ignored) {}
    }
    public void sort(char[] c) {
        for(int i=0;i<c.length-1;i++) {
            for(int j=0;j<c.length-i-1;j++) {
                if(c[j]>c[j+1]) {
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
    }
    public boolean areAnagram(char[] str1,char[] str2) {
        String s1=new String(str1);
        String s2=new String(str2);
        return s1.equals(s2);
    }
    public void check() {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        sort(c1);sort(c2);
        if(areAnagram(c1,c2)) {
            System.out.println(s1+" and "+s2+" are Annagrams of each other");
        }else {
            System.out.println(s1+" and "+s2+" are not Annagrams of each other");
        }
    }
    public static void main(String[] args) {
        String s1="",s2="";
        Anagram obj=new Anagram(s1,s2);
        obj.input();
        System.out.println();
        obj.check();
    }
}
