

public class reverseDoubleLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    //addfirst 
    public static void AddFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static void print(){
        if(head==null){
            System.out.println("DoubleLinedlist is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void Reverse() {
        Node curr = head;
        Node temp = null;
    
        while (curr != null) {
            // Swap prev and next for the current node
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            // Move to the next node (which is now stored in prev)
            curr = curr.prev;
        }
    
        // Swap head and tail pointers
        if (temp != null) {
            head = temp.prev;
        }
    }
        public static void main(String[] args){
        reverseDoubleLinkedlist ll = new reverseDoubleLinkedlist();
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddFirst(0);
        ll.print();
        ll.Reverse();
        ll.print();


    }
}
