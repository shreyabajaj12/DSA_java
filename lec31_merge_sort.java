package shreya.java;

public class lec31_merge_sort {

    static void displayarry(int []arr){              //max time complexity is nlogn which is the worst best , all cases.
        for(int val :arr){
            System.out.print(val);
        }
    }
    static void merge (int []arr ,int l ,int mid ,int r){
        int n1 = mid -l+1;
        int n2 =r-mid;
        int [] left =new int [n1];
        int []right =new int [n2];
        int i,j,k;
        for( i=0;i<n1;i++) left[i]=arr[l+i];
        for( j=0;j<n2;j++)right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1&& j<n2){
            if(left[i]<=right[j])
                arr[k++] =left[i++];
                else
                    arr[k++] =right[j++];
                while (i<n1)
                    arr[k++] =left[i++];
                while (j<n2){
                    arr[k++] =right[j++];
            }


    }}


    static void mergesort(int[] arr, int l, int r) {
        if(l>=r)return;                 //base case
        int mid =(l+r)/2;
        mergesort(arr, l, mid);              //recursive work
        mergesort(arr, mid+1, r);
        merge(arr,l,mid ,r);                   //selfwork


    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 7, 7};
        int n = arr.length;
        System.out.println("before sorting");
        displayarry(arr);
        System.out.println(" ");
        mergesort(arr, 0, n - 1);
        System.out.println("array after sorting");
        displayarry(arr);
    }
}