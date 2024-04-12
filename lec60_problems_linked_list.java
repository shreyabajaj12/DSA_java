package shreya.java;

public class lec60_problems_linked_list {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }

public static Node nthNode(Node head,int n){
    int size =0;
    Node temp = head;
    while(temp!=null){
        size++;
        temp = temp.next;
    }
    int m = size-n+1;
    //mth node from start
    temp = head;

    for(int i =1;i<=m-1;i++){temp =temp.next;

    }
    return temp;


}
public static Node nthNode2(Node head , int n){
    Node slow =head;
    Node fast =head;
    for(int i=1;i<=n;i++){
        fast = fast.next;
    }
    while ((fast != null)) {

        slow =slow.next;
        fast = fast.next;
    }
    return slow;
}
public static Node deleteNthFromEnd(Node head,int n){
    Node slow = head;                     //case of 1 traversing
    Node fast = head;
    for(int i=1;i<=n;i++){
        fast = fast.next;            //traverse 1st till the n.
    }
    if(fast ==null){
         head = head.next;
         return head;
    }
    while (fast.next!=null){
        slow = slow.next;
        fast =fast.next;

    }
    slow.next = slow.next.next;
    return head;
}
public static void display (Node head){      //in case traversing 2
    Node temp = head;
    while (temp!= null){
        System.out.print(temp.data +" ");
        temp =temp.next;
    }
    System.out.println();
}


    public static void main(String[] args) {
        Node a =new Node(100);
        Node b =new Node(10);
        Node c =new Node(1);
        Node d =new Node(200);
        Node e =new Node(400);
        Node f =new Node(500);
        a.next =b;
        c.next=d;
        d.next=e;
        e.next=f;
        b.next=c;
        Node v = nthNode2(a,3);
        System.out.println(v.data);

        display(a);
     a=   deleteNthFromEnd(a,6);
        display(a);




    }
}
