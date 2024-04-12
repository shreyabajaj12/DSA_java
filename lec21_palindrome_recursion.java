package shreya.java;

import java.util.Scanner;

public class lec21_palindrome_recursion {
    static boolean isPalindromr(String s,int l ,int r){
        if(l>=r)return true;
        return (s.charAt(l)==s.charAt(r)&& isPalindromr(s,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(isPalindromr(s,0,s.length()-1));
    }
}
