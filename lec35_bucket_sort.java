package shreya.java;

import java.util.ArrayList;
import java.util.Collections;

public class lec35_bucket_sort {
   public static void bucketsort (float[]arr) {
       int n = arr.length;
       //buckets
       ArrayList<Float>[] buckets = new ArrayList[n];               //we are making array of arraylist
       //creating empty buckets
       for (int i = 0; i < n; i++)
           buckets[i] = new ArrayList<Float>();

   //add elements in buckets
       for(int i =0;i<n ;i++){
        int bucketindex = (int) arr[i]*n;  //multiply with n becz it is a float value and in order to put an int we multiplied
        buckets[bucketindex].add(arr[i]);
    }
    //sort each bucket individually
       for(int i=0;i< buckets.length;i++){
           Collections.sort(buckets[i]);

       }
   //merge all buckets
       int index =0;
       for(int i=0;i< buckets.length;i++){
           ArrayList<Float>currentbucket = buckets[i];
           for(int j=0;j<currentbucket.size();j++){              //currentbucket ke sare element ko hmmay array mai likhna hai....traverse through each bucket
               arr[index++] =currentbucket.get(j);
           }
       }



   }

    public static void main(String[] args) {
        float []  arr={0.43f,0.98f ,0.54f ,0.13f ,0.34f};
        bucketsort(arr);
        for (float value:arr
             ) {
            System.out.println(value);


        }
    }
}
