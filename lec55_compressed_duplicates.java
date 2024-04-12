package shreya.java;

public class lec55_compressed_duplicates {
    public static void main(String[] args) {
        String str ="aaaaaabbcdddeeef";
        String ans =""+str.charAt(0);   //a
        int count =1;
        for(int i =1;i<str.length();i++){
            char curr =str.charAt(i);
            char prev =str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1)  ans+= count;
                count=1;          //for the index b refresh
                ans+=curr;           //to add b character already
            }

        }
        if(count>1)  ans+= count;
        System.out.println(ans);

    }
}
