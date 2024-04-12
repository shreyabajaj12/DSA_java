package shreya.java;

public class lec26_recursion_keypad_combi {
    static void combination (String dig ,String[] keypad ,String result){
        if(dig.length()==0){
            System.out.print(result+" ");
            return;
        }
      int currentno =  dig.charAt(0) -'0';     //2          //'0' represents a character = 48   represents ASCII  american standard code for information interchange
        String currchoices =keypad[currentno];  //"abc"        //to represent any character value as integer sub '0' cha...
        for(int i=0;i<currchoices.length();i++){
            combination(dig.substring(1),keypad,result+currchoices.charAt(i));

        }

    }
    public static void main(String[] args) {
        String s ="23";
        String[] keypad ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
              //           0 , 1 , 2,  3   ,4     ,5    ,6    ,7    ,8    ,9
        combination( s, keypad,"");

    }
}
