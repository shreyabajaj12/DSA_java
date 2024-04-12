package shreya.java;

import java.util.ArrayList;

public class lec18_recursion {
    static ArrayList<Integer>allIndices (int []a ,int n ,int target ,int idx){
      if(idx>=n){
          return new ArrayList<>();   //return empty arraylist
      }
      //selfwork
      ArrayList<Integer>ans =new ArrayList<>();
      if(a[idx]==target){
          ans.add(idx);
      }
      //recursive work
      ArrayList<Integer> smallAns = allIndices(a ,n,target,idx+1);
      ans.addAll(smallAns);     //to append a new funs ans inside ans.
      return ans;
    }
    public static void main(String[] args) {
        int []a ={4,1,2,3,4,4,4};
        int n = a.length;
       ArrayList<Integer>ans =allIndices(a,n,4,0) ;
        for (Integer i: ans)
              {
            System.out.println(i);

        }
    }
}
