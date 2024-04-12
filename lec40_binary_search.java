package shreya.java;

public class lec40_binary_search {
    static boolean binarysearch(int[]a,int target){
        int n =a.length;
        int st =0, end =n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(target == a[mid]){
                return true;
            } else if (target<a[mid]) {
                end =mid-1;

            }
            else{
                st =mid+1;
            }
        }
        return false;

    }
    static boolean recursive(int[]a , int st , int end, int target){
        if(st>end)return false;
        int mid =(st+end)/2; //better approach == start +(end-st)/2
        if(target == a[mid]){
            return true;
        } else if (target<a[mid]) {
            return recursive(a,st,mid-1,target);

        }
        else{
            return recursive(a,mid+1,end,target);
        }


        }


    public static void main(String[] args) {
        int[] a ={1,2,3,5,6};
        int target =0;
        while(target!= 10){
            System.out.printf("%d exists in the arr %b \n", target ,binarysearch(a,target));
            System.out.printf("%d exists in the arr %b \n", target , recursive(a,0,a.length-1,target));
            target++;



        }





    }
}
