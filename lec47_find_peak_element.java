package shreya.java;

public class lec47_find_peak_element {
    public static int findPeakElement(int[]a){
        int n =a.length;
        int st =0,end =n-1;

        while(st<=end){
            int mid =st +(end-st)/2;
            if((mid==0||a[mid]>a[mid-1])&&(mid == n-1||a[mid]>a[mid+1])){  //we are finding the peak no when arranged from inc and then dec ordercin the case
                //where a single line also could be there here 0 and nth element is considered to be (-infinity).
                return mid;
            }
        if(a[mid]<a[mid+1]){   //accending
            st =mid+1;
        }else{
            end =mid-1;
        }


        }
        return -1;

    }
    public static void main(String[] args) {
        int []a ={2,3,4,5,4,5,2};
        int ans =findPeakElement(a);
        System.out.println(ans);

    }
}
