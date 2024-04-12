package shreya.java;
//static word is used for the the whole some it should be class dependent rather then onj
   class Algebra{
       int a;
       int b;
       Algebra(int x ,int y) {
           System.out.println("constructor");
           a=x;
           b=y;
       }
       int add(){
        int ans =a+b;
        return ans;


       }
       int sub(){
           return a-b;
       }
       int multiply(){
           return a*b;
       }
    }


public class lec56_oops {
//    public class StudentClass {
        //Objects are real life entities
        //classes are blueprints  , they aren't real are just a source to categorise diff obj

//    public static class Students{
//       private int rno;
//        String name;
//        double percentage;
//    }
//    }
    public static void fun(Students x){
        System.out.println(x.name);
    }

    public static void main(String[] args) {
            Algebra obj =new Algebra(5,7);
        System.out.println(obj.add());
        System.out.println(obj.multiply());
        System.out.println(obj.sub());

//        Students s2 =new Students();
//        x.name ="shreya";
//        System.out.println(x.name);
//        //update
//        x.name ="bajaj";
//        fun(x);
        Students s1 =new Students("Shreya",34,90.2);
      //  Students.numberofstudents =100;
        //  to cope with such kind of issue we use private s
        //such that method would also not able to change the value i.e, set we can only get its
        //value
      //  s1.schoolname = "kv";
        s1.rno =45;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percentage);
        System.out.println(s1.schoolname);
        System.out.println(s1.getNoofstudents());
//        s1.name ="shreya";
//      s1.rno =67;
//
//        s1.setRno(76);
//        System.out.println(s1.getRno());
        Students s2 = new Students("rakshit",43,98.2);
        System.out.println(s2.getNoofstudents());


    }
}
