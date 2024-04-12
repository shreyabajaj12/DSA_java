package shreya.java;

public class lec59_linked_list2 {
    public static class Node{
        int data; //declaration
        Node next;
        Node(int data){    //constructor
            this.data =data;
        }
    }
    public static class linkedlist{
        Node head =null;
        Node tail =null;
        int size =0;
        void insertAtEnd(int val){
            Node temp =new Node(val) ;
            if(head==null){
                head = temp;
                tail =temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val){
            Node temp =new Node(val);
            if(head ==null){
                head = tail =temp;
            }
            else{
                temp.next =head;
                head = temp;
            }
            size++;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();

        }
        void insertAt(int idx ,int val){
         Node t = new Node (val);
         Node temp = head;
         if (idx == size){
             insertAtEnd(val);
             return;
         }
         else if(idx ==0){
             insertAtHead(val);
             return;
            } else if (idx<0) {

             System.out.println("wrong index");
             return;}
         else if (idx>0) {
             System.out.println("wrong index");
             return;

         }


            for(int i=1;i<=idx-1;i++){
             temp = temp.next;  }
             t.next =temp.next;
             temp.next =t;
             size++;

        }
//        int size(){   //o(n)
//            Node temp = head;
//            int count =0;
//            while (temp!= null){
//                count++;
//
//                temp = temp.next;
//            }
//            return count;
//
//
//        }
        int getAt(int idx){
            Node temp =head;
            for(int i=1;i<=idx;i++){
                temp =temp.next;
            }
            return temp.data;


    }
    void delete(int idx){
            if(idx ==0){
                head = head.next;
                size--;
                return;
            }
            Node temp =head;
            for(int i =0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
            if(idx ==size-1){  //if we are removing the last index index before removing make temp as the last index
                tail =temp;
            }

    }


    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtEnd(45);
        ll.display();
      //  System.out.println();
        System.out.println(ll.size);
        ll.insertAtHead(77);
       System.out.println();
       ll.display();
     //   System.out.println();
      ll.insertAt(4,10);
       ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.getAt(4));
        System.out.println(ll.size);
        ll.delete(0);
        ll.display();


    }
}
