package shreya.java;

public class lec58_linked_list {
    public static void displayr(node head){
        if(head==null)return;
        System.out.println(head.data);
        displayr(head.next);
    }
    public static void display(node head){
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;


        }
    }
    public static int length(node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;

        }
        return count;
    }
    public static class node{
        int data;  //value
        node next;  //address of the nxt node
        node(int data){   //constructor
            this.data =data;
        }
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(4);
        node c = new node(7);
        node d = new node(8);
        a.next=b;
        b.next=c;
        c.next =d;

        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        node temp =a;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(length(a));
        display(a);
        displayr(a);
        System.out.println( length(a));

    }
}
