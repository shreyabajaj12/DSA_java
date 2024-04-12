package shreya.java;

public class lec49_problem_bs_racetrack {
    // there are k no of kids and there are a no of spots in a st line in playground === find maximal minima dis bet 2 of them
    static boolean isPossible(int []a ,int k ,int dist){
        int kidsplaced =1;
        int lastkid =a[0];

        for(int i =1;i<a.length;i++){
            if((a[i] -lastkid)>=dist){
                kidsplaced++;
                lastkid =a[i];

            }
        }
        return kidsplaced>=k;

    }

    static int recetrack(int[]a ,int k){
        if(k>a.length)
return -1;
        int st =0 ,end =(int) 1e9;
        int ans  = -1;
                while(st<=end){
                    int mid =st +(end-st)/2;
                    if(isPossible(a,k,mid)){//can k kids be placed such that no 2 kids have distance lesser than mid
                        ans =mid;
                        st =mid+1;

                    }else{
                        end =mid-1;
                    }
                }
                return ans;
    }
    public static void main(String[] args) {
        int [] a ={1,2,4,8,9};
        int k =2;
        System.out.println(recetrack(a,k));
    }
}
