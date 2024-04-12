package shreya.java;

import java.util.Scanner;

public class lec44_bs_problems {
    public static  boolean searchMatrix(int[][] a ,int target){  //concept is matrix is sorted along row wise and col wise and also lst element of of each row is smaller than 1st elem of other
        //no. of rows =n ,no of cols =n
        int n =a.length,m =a[0].length;
        int st =0,end =m*n-1;
        while (st<=end){
            int mid =st +(end-st)/2;
            int midE =a[mid/m][mid%m];
            if(midE ==target)return true;
            if(target<midE){
                end = mid-1;
            }else{
                st =mid+1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();

        int [][]a = new int [n][m];
        System.out.println("enter"+" "+"numbers");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= sc.nextInt();
                System.out.println(  searchMatrix(a,4));


    }
}}}
