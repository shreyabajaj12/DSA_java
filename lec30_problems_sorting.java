package shreya.java;

public class lec30_problems_sorting {
//     static void zeros (int []arr){
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             boolean flag = false;
//             for(int j= 0;j<n-i-1;j++){
//                 if(arr[j]==0 &&arr[j+1] !=0){
//                     //swap
//                     int temp =arr[j];
//                   arr [ j]=arr[j+1];
//                   arr[j+1] =temp;
//                   flag =true;
//                 }
//             }
//             if(flag==false)
//                 return;
    //     }
     //}
    static void sortFruits(String[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minalpha =i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[minalpha])<0){
                    minalpha=j;
                }
            }
            //swap of fruit of minindex and arr[i]
            String temp =arr[i];
            arr[i] =arr[minalpha];
            arr[minalpha] = temp;
        }
    }
    public static void main(String[] args) {
//        int []arr ={1,0,4,0,0};
//        zeros(arr);
//        for (int i:arr) {
//            System.out.println(i);
//
//        }
        String [] arr ={"mango","kiwi","apple","avacado","grapes"};
        sortFruits (arr);
        for (String val:arr
             ) {
            System.out.println(val);

        }
    }
}
