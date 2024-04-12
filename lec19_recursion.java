package shreya.java;

import java.util.Scanner;

public class lec19_recursion {
    static String removeA (String s , int idx) {
        if (idx == s.length()) return " ";

        String smallAns =removeA(s,idx+1);

       char currentchar = s.charAt(idx);

        if (currentchar != 'a') {

            return currentchar +smallAns;
        }
        else{
            return smallAns;
        }
    }
    static String removeA2 (String s) {
        if (s.length() == 0) {
            return " ";}
            String smallAns = removeA2(s.substring(1));
            char currentchar = s.charAt(0);

            if (currentchar != 'a') {

                return currentchar + smallAns;
            } else  return smallAns;



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));

    }
}
