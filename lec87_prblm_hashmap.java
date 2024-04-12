package shreya.java;

import java.util.HashMap;
import java.util.HashSet;
//        anagram=when the set of the character in a given two words is same then it is anagram

public class lec87_prblm_hashmap {
    static HashMap<Character,Integer>makeFreqMap(String str){
        HashMap<Character,Integer>mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currfreq = mp.get(ch);
                mp.put(ch,currfreq+1);
            }
        }
        return mp;
    }
//    public boolean isAnagram1(String s,String t){
//        if(s.length()!=t.length())return false;
//        HashMap<Character,Integer>mp1 = makeFreqMap(s);
//        HashMap<Character,Integer>mp2 = makeFreqMap(s);
//        return mp1.equals(mp2);
//
  //  }
    public boolean isAnagram2(String s,String t){
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>mp1 = makeFreqMap(s);
      for(int i=0;i<t.length();i++){
          Character ch = t.charAt(i);
          if(!mp1.containsKey(ch))return false;
          int currfreq = mp1.get(ch);
          mp1.put(ch,currfreq-1);
      }
      //alla the values to be 0 for all anagrams
        for (Integer i: mp1.values()
             ) {if(i!=0)return false;

        }
       return true;
//
    }
    public static void main(String[] args) {

    }
}
