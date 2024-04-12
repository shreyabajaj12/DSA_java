package shreya.java;

import java.util.Scanner;

public class lec3_sum_betn_2no_of_array {
    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];}
        return arr;
    }
    static int findArraySum(int []arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int []arr){
      int totalsum =findArraySum(arr);
      int prefsum =0;
      for(int i=0;i<arr.length;i++){
          prefsum+=arr[i];
          int suffixsum =totalsum -prefsum;
          if(suffixsum==prefsum){
              return true;
          }
      }
      return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
//        System.out.println("equal partition possibe: "+equalSumPartition(arr));
//       int [] prefisum = makePrefixSumArray[arr]
//        System.out.println("enter the no of queries");
//        int q =sc.nextInt();
//        while (q-- >0) {
//            System.out.println("enter range");
//            int l = sc.nextInt();
//            int r =sc.nextInt();
//            int ans =prefisum[r] -prefisum[l-1];
//            System.out.println("sum"+ans);
//
//        }




        }}
