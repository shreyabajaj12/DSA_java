package shreya.java;

import java.util.Scanner;

public class lec52_stringbuilder {
    public static void main(String[] args) {
//        String str ="PhYsics";

        Scanner sc =new Scanner(System.in);
        StringBuilder str =new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        for(int i=0;i<str.length();i++){
            //check if the alpha is capital or small
            boolean flag =true; //true==capital
            char ch  = str.charAt(i);
            if(ch ==' ')continue;
            int asci =(int)ch;
            if(asci>=97)flag =false;  //small
            if(flag==true){  //capital
                asci+=32;
                char dh =(char) asci;  //a
               str.setCharAt(i,dh);

            }
            else{ //small
                asci-=32;
                char dh = (char) asci;
               str.setCharAt(i,dh);

            }
        }
        System.out.println(str);
    }
}
