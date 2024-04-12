package shreya.java;

public class lec17_recursion {
//    static boolean search (int []arr ,int target ,int idx) {
//        if (idx >= arr.length) {
//            return false;
//        }
//        if (arr[idx] == target) return true;
//        return search(arr, target, idx + 1);
//    }

//        if(search(arr,target,idx+1)){
//            return true;
//        }
//        else return false;
//static int findindex (int []arr ,int target ,int idx){
//    if(idx>= arr.length){
//        return -1;
//    }
//    if(arr[idx] ==target)return idx;
//    return findindex(arr,target,idx+1);
//   }


   static void findallindices (int[]arr,int n ,int target ,int idx){
    if(idx >= n){
        return;
    }
    if(arr[idx] ==target){
        System.out.println(idx);

    }
    findallindices(arr ,n ,target,idx+1);
   }


    public static void main(String[] args) {
        int []arr ={1,2,3,4,5 ,5,5};
        int target =5;
        int n = arr.length;
//        System.out.println(findindex(arr,target,0));
//        if (findindex(arr, target, 0)) {
//
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
        findallindices(arr,n,target,0);
    }
}
