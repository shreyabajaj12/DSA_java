package shreya.java;

public class lec12_recursion {
//    static int factorial (int n ){
//        if(n==0){
//            return 1;
//        }
//        int smallans =factorial(n-1);
//        int ans = n *smallans;
//        return ans;
//    }

    static int fib (int n ){
        if(n==0 || n==1){
            return n;
        }
//        int prev =fib(n-1);
//        int prevprev = fib (n-2);
//        return  prev+prevprev;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
        for(int i=0;i<10;i++){
        System.out.println(fib(i));}
    }
}
