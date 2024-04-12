package shreya.java;

import java.util.Scanner;

public class lec20_recursion {
    static String reverse (String s,int idx){
        if(idx ==s.length())return "";
        String smallAns =reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        String rev =reverse(s,0);
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.printf("%s is  palindrome",s);
        }else {
            System.out.printf("%s is not a palindrome",s);
        }
//        System.out.println(reverse(s,0));
   }
}
