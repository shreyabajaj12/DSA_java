package shreya.java;

public class lec27_bubble_sort {
   static void bubblesort(int []a){
       int n =a.length;

       //n-1th iteraation
       for (int i=0;i<n-1;i++){
           boolean flag =false;                 //has any swapping happened
           for(int j=0;j<n-i-1;j++){            //because we know loops stop after n-i-1 as it is arranged . lst i elements are already correct sorted positions
               if(a[j]>a[j+1]){
                   //swap
                   int temp =a[j];
                   a[j] =a[j+1];
                   a[j+1]= temp;
                   flag =true;         //some swap happened
               }

           }
           if(flag ==false){               //have any swap happened
               return;
           }
       }
   }
    public static void main(String[] args) {
       int []a ={7,5,4,3,0 , 9};
       bubblesort(a);
        for (int i:a
             ) {
            System.out.println(i);

        }
        
    }
}
