package shreya.java;

public class lec13_recursion {
//    static int sod(int n){
//        if(n>=0&&n<=9){
//            return n;
//        }
//        int smallans =sod(n/10);
//
//        return smallans+n%10;
//    }
//    static int count(int n){
//        if(n/10==0){
//            return 1;
//        }
//       return count(n/10)+1;
//    }

//    static int pow(int p ,int q){                 //p^q -> time complexity - O(q)
//        if(q==0)return 1;
//        int smallans =pow(p,q-1);
//        return smallans *p;
//    }

    static int pow(int p ,int q){
        if (q==0)return 1;
        int smallpow =pow(p,q/2);
        if(q%2 ==0){
            return smallpow*smallpow;
        }
        else {
            return p*smallpow*smallpow;
        }

    }

    public static void main(String[] args) {
//        System.out.println(sod(246));
//        System.out.println(count(1234));
//        System.out.println(pow(2,3));
        System.out.println(pow(2,3));
        System.out.println(2.000*3.000);
    }
}
