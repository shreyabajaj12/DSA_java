package shreya.java;

import java.util.ArrayList;
import java.util.List;

public class lec98_permutation {
    public static void printp(String str,String t,List<String>l){
        if(str.equals("")) {
            l.add(t);
            return;}
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String res=left+right;
            printp(res,t+ch,l);
        }

    }
    public static void main(String[] args) {
        List<String>l=new ArrayList<>();
        String str="abc";
        printp(str,"",l);
        for (String i:l
             ) {
            System.out.println(i);

        }
    }
}
