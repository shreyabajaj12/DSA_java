package shreya.java;

import java.util.*;

public class lec85_hashmap_prblm {
    public static void main(String[] args) {
        int []arr={1,3,2,1,4,2,1,3,3,3,3,4,4,7,1};
        Map<Integer,Integer>mp=new HashMap<>();
        for (int el:arr
             ) {
            if(!mp.containsKey(el)){
                mp.put(el,1);}
            else{
                mp.put(el,mp.get(el)+1);

        }

        }
        System.out.println("Frequency Map");
        System.out.println(mp.entrySet());
        int maxfreq = 0,ansKey = -1;
        for (var e:mp.entrySet()
             ) {
            if (e.getValue() > maxfreq) {
                maxfreq = e.getValue();
                ansKey = e.getKey();
            }

        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey,maxfreq);

    }
}
