package shreya.java;

public class lec57_oops_fraction_problem {
    public static Fraction add(Fraction f1 ,Fraction f2){
        int numerator = f1.num*f2.den+ f2.num* f1.den;
        int denominator = f1.den *f2.den;
        Fraction f3 =new Fraction(numerator,denominator);
        return f3;
    }
    public static Fraction multiply(Fraction f1 ,Fraction f2){
        int numerator = f1.num* f2.num;
        int denominator = f1.den *f2.den;
        Fraction f4 =new Fraction(numerator,denominator);
        return f4;
    }
    public static class Fraction{
        public static int gcd(int x , int y){
            if (y==0){
                return x;
            }
          return   gcd(y,x%y);
        }
        int num;
        int den;
        public Fraction(int num,int den){    //constructor
            this.num =num;
            this.den =den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num,den);
            num/= hcf;
            den/= hcf;
                }
            }



    public static void main(String[] args) {
        Fraction f1 =new Fraction(35,21);
        //f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2=new Fraction(7,3);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3 =add(f1, f2);
        System.out.println(f3.num+"/"+ f3.den);
        Fraction f4 =multiply(f1,f2);
        System.out.println(f4.num+"/"+f4.den);


    }
}
