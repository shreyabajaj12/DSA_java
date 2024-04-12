package shreya.java;

import java.util.HashSet;
class lon{
    public int longestConsectutive(int []nums){
        HashSet<Integer>st=new HashSet<>();
        int length=0;
        int len;
        for(int num :nums)st.add(num);
        for(int num :st){
            if(!st.contains(num-1)){   //num is  the starting point since num-1 doesnot exist
                len=1;
                while(st.contains(num+1)){
                    len++;
                    num++;
                }
                if(len>length)length=len;
            }
        }
        return length;

    }
}

public class lec91_hashset {
    public static void main(String[] args) {
       int []arr={1,2,3,100,99,97,82,21,4,5};
        System.out.println("ans is");
       lon obj=new lon();
        System.out.println(obj.longestConsectutive(arr));
    }
}
