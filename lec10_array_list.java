package shreya.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lec10_array_list {
    static void reverseList (ArrayList<Integer>list){
        int i=0 ,j =list.size()-1;

        while(i<j){
            Integer temp =Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        // wrapper class
//        Integer i =Integer.valueOf(4);
//        System.out.println(i);
//        Float f =Float.valueOf(4.5f);
//        System.out.println(f);
//
        ArrayList<Integer> list =new ArrayList<>();

        //add a new element
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//        l1.add(8);
//        System.out.println(l1);
        list.add(5);
        list.add(60);
        list.add(7);
        list.add(8);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);                                      //in ascending
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());           //in descending
        System.out.println(list);
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("welcome");
        l1.add("welc");
        l1.add("wme");
        l1.add("elcome");
        l1.size();
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
                reverseList(list);
        System.out.println(list);

      //  get an element at index i
        System.out.println(l1.get(1));

        //print with loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
//
//
        //adding some element at some index i
        l1.add(1, String.valueOf(100));

        //printing the array list directly
        System.out.println(l1);

        //modifying element at an index i
        l1.set(1, String.valueOf(99));
        System.out.println("hey");
        System.out.println(l1);

        //removing an element at index i
        l1.remove(3);
        System.out.println(l1);

        //removing an element an element e
        System.out.println(l1.remove(Integer.valueOf(56)));
        System.out.println(l1);

        //checking if an element exists
        boolean ans =l1.contains(Integer.valueOf(6));
        System.out.println(ans);

   //     if u don't specify class,
   ArrayList l =new ArrayList();
        l.add(4);
        l.add("rose");
        l.add("roseeeeeeeeeee");
        l.add("bajaj");
        System.out.println(l);
        System.out.println( l1.size());
        l.add(1,"shrey");
        System.out.println(l);






        ArrayList<Boolean> B1 =new ArrayList<>();

    }
}
