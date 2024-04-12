package shreya.java;

import java.util.HashMap;
import java.util.Map;

public class lec84_hashmap {
    static void HashMapMethods(){
        //syntax
        Map<String,Integer>mp =new HashMap<>();
        HashMap<String,String>re=new HashMap<>();
        //since map is an interface and object can never made of interface so we use class hashmap
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("lav",17);
        mp.put("Shre",13);
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rakul"));
        mp.put("Akash",25);//it is for both insertion and updation
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash")) ; //provides null if key does not exists
        System.out.println(mp.containsKey("Yash"));
        mp.putIfAbsent("Yah",30);   //does not change the value if the key already exists
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key: mp.keySet()) {       //type of what    name in which to store:   of what
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer>e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            System.out.println();
            //another easier method not need to give type
            for(var m :mp.entrySet()){
                System.out.printf("Age of %s is %d\n",m.getKey(),m.getValue());
            }
        }
    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
