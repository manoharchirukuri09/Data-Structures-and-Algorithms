public class AddElements {
    // create a node 
    public static class Node{
        //node contains data, nexrt
        int data;
        Node next;
        // Node contstrcutor 
        public Node(int data){
            // declare node
                   this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addFirst(int data){
        // step 1 create a new node
        Node newNode = new Node(data);
        if(head==null){
            head=tail = newNode;
            return;
        }
        // step 2 
        newNode.next=head;
        // step 3 head = newNode
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = null;
            return;
        }
        // step 2
        tail.next = newNode;
        // step 3 tail = newNode
        tail = newNode;
    }
    public static void print(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->" );
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        AddElements ll = new AddElements();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
}
