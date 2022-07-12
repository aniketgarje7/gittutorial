public class LinkedList {
    Node head;
    Node tail;
    public void create(int val){
        Node newNode = new Node(val);
        newNode.next = null;
        
        if(head==null){
            head=newNode;
            tail = newNode;
            tail.next = head;

        }
        else{
            
            tail.next = newNode;
//             did some changes for demo git learnig;
            
            newNode.next = head;
            tail = tail.next;
        }

    }
    public void print(){
        Node temp = head;
        while(temp!=tail){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(tail.val);
    }
    public void getLast(){
        System.out.println(tail.val);
    }
}
