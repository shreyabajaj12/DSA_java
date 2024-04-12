package shreya.java;
//AlL occurrences of a character must be replaced with another character while preserving the order of the characters no two characters map to the same character

import java.util.HashMap;

public class lec88_isomorphic_prblm {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length();i++){
            Character sCh = s.charAt(i);
            Character tCh =t.charAt(i);

            if(mp.containsKey(sCh)){
                if(mp.get(sCh)!=tCh)return false;
            }else if (mp.containsValue(tCh)){
                return false;
            }else{
                mp.put(sCh,tCh);
            }
        }
        return true;

    }
    public static void main(String[] args) {

    }
}
