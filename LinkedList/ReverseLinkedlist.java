public class ReverseLinkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void Last(int data){
        Node NewNode = new Node(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        tail.next = NewNode;
        tail=NewNode;
    }
    public static void Print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    
    }
    public static void Reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;    
        head = prev;


    }
    public static void main(String[] args){
        ReverseLinkedlist ll = new ReverseLinkedlist();
        ll.Last(1);
        ll.Last(2);
        ll.Last(3);
        ll.Last(4);
        ll.Last(5);
        ll.Last(6);
        ll.Print();
        ll.Reverse();
        ll.Print();
    }
}
