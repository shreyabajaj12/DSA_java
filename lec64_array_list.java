package shreya.java;

import java.util.ArrayList;
import java.util.Arrays;

public class lec64_array_list {
    public static class ArrayList{
        int []arr =new int [5];
        int idx = 0;
        int size;
        public void add(int ele){
            if(size== arr.length){
                int []brr = Arrays.copyOf(arr,arr.length*2);
             arr =brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx, int val){
            arr[idx] = val;
        }

    }

    public static void main(String[] args) {
        ArrayList arr =new ArrayList();
        arr.add(2);
        arr.add(5);
        System.out.println(arr.size);
        arr.add(0);
        System.out.println(arr.size);

//        ArrayList<Integer> arr =new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(5);
//        System.out.println(arr);
    }
}
