package shreya.java;

public class lec24_subsetsum_recursion {

    static void subsetSum(int[]a ,int n ,int idx , int currsubetsum ){
        if(idx>=n){
            System.out.println(currsubetsum);
            return;
        }

        //curr idx +sum
        subsetSum(a,n,idx+1,currsubetsum+a[idx]);

        //curr ans
        subsetSum(a,n,idx+1,currsubetsum);

    }
    public static void main(String[] args) {
        int [] arr ={2,4,5};


       subsetSum(arr,arr.length,0,0);
    }
}


















