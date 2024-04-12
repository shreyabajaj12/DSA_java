package shreya.java;

public class lec68_stack_implementation_with_array {
    public static class Stack{
        private int [] arr = new int[4];
    private int idx =0;
    void push(int x){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }
    int peak(){
        if(idx==0){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if(idx==0){
            System.out.println("stack is empty");
            return -1;

    }
        int top = arr[idx-1];
        arr[idx-1] =0;
        idx--;
        return top;
    }
    void display(){
    for(int i=0;i<=idx-1;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0)return true;
        else return false;
    }
    boolean isFull(){
        if(idx==arr.length)return true;
        else{
            return false;
        }

    }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(3);
        st.push(1);
       // st.push(5);
        //st.push(9);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peak());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isFull());

st.isEmpty();
st.display();

    }
}
