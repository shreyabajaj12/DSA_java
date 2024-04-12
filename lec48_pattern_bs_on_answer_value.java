package shreya.java;

public class lec48_pattern_bs_on_answer_value {
    //ques  == find minimal maxima
    // there is a no of boxes which has i  no of chocolates in each and to be distributed to n no of students
    //such that the max chocolate is received is less and are in simultaneous order.
  static   boolean isDivisionPossible(int [] a , int n ,int mxChocolatesAllowed){
        int noofstudents =1;
        int choco =0; //no of choco current student has
        for(int i =0;i<a.length;i++){
            if(a[i]> mxChocolatesAllowed)return false;
            if (choco +a[i]<= mxChocolatesAllowed){
                choco+=a[i];
            }else{
                noofstudents++;
                choco = a[i];
            }
        }
        if(noofstudents> n)return  false;
        return true;
    }
    static int distributechocolates(int[]a ,int n){ //n is no of the students , a is the no of boxes of chocolates
        if(a.length<n)return -1;
        int ans =0, st =1 ,end = (int)1e9;//total boxes
//we ae using bs in the ans part such that to receive min in maxs . traversing the whole of array finding the mid if mid is the no in which it could be distributed is mid the largest max if yes then end turns
        //to mid-1 and again finding mid...........
        while (st<=end){
            int mid =st+(end-st)/2;
            if(isDivisionPossible(a,n,mid)){
                ans =mid;
                end = mid-1;

            }else{
                st =mid+1;

            }


        }
        return ans;

    }
    public static void main(String[] args) {
        int[] a ={12,34,67,90};
        int n =2;
        System.out.println(distributechocolates(a,n));

    }
}
