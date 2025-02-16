public class AddFirstDoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // addFirst in double linkedlist
    public static void AddFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Double linkedlist is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // removeFirst in double linkedlist
    public static int RemoveFirst(){
        if(head==null){
            System.out.println("Double linkedlist is empty");
        }
        if(size==1){
            int val = head.data;
            size--;
            head=tail=null;
            return val;

        }
        int val  = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        AddFirstDoubleLL ll = new AddFirstDoubleLL();
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddFirst(0);
        ll.print();
        System.out.println(ll.size);
        ll.RemoveFirst();
        ll.print();
        System.out.println(ll.size);
    }
}

