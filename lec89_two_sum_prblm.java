package shreya.java;

import java.util.HashMap;

public class lec89_two_sum_prblm { //time complexity is n^2
//    public  int[]twoSum(int[]nums,int target){
//        int n = nums.length;
//        int[]ans ={-1};
//        for(int i=0;i<n;i++){
//            for(int j =i+1;j<n;j++){
//                if(nums[j] == target - nums[i]){
//                    ans =new int []{i,j};
//                    return ans;
//                }
//            }
//
//        }
//        return ans;


    public int[] twoSum(int[] nums, int target) {// time complexity is n
        int n = nums.length;
        int[] ans = {-1};
        //value , index
        HashMap<Integer,Integer>mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target-nums[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);

        }

    return ans;

}
    public static void main(String[] args) {

    }
}
