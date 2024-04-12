package shreya.java;

public class lec46_peak_index_in_mountain_array {
    public static int peak_index(int[]a){
        int st =0 , end =a.length-1;
        int ans = -1;
        while(st<=end){
            int mid =st+(end-st)/2;
            if(a[mid]< a[mid+1]){
                ans = mid+1;
                st =mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a ={1,3,5,7,9,2,0};
        int ans = peak_index(a);
        System.out.println(ans);
        System.out.println(a[ans]);

    }
}
