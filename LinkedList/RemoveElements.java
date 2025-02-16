public class RemoveElements {
    // create the Node
    public static class Node{
        int data;
        Node next;
        // constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // declare required for node
    public static Node head;
    public static Node tail;
    public static int size;
    // add element in first
    public  void AddFirst(int data){
        // step create the new node
        Node NewNode = new Node( data);
        size++;
        // check the node is empty or nor
        if(head == null){
            head=tail=NewNode;
            return;
        }
        // step 2 assign the node to the new node
        NewNode.next = head;
        // step 3
        head= NewNode;
    }
    public void addLast(int data){
        // step 1 create the new node
        Node NewNode = new Node(data);
        size++;
        // check the node is empty
        if(head==null){
            head=tail=NewNode;
            return;
        }
        // step to assign the node to tail
        tail.next = NewNode;
        tail=NewNode;

    }
    public void Middle(int index, int data){
        // create Node is empty or not
        if(index==0){
            AddFirst(data);
            return;
        }
        if(index >= size){
            addLast(data);
            return;
        }
        // create the new node
        Node NewNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        // if index is 3 and it add element in 2
        while(temp != null && i<index-1){
            temp = temp.next;
            i++;
        }
        NewNode.next= temp.next;
        temp.next = NewNode;
    }
    // Remove the First Element
    public int RemoveFirst(){
        
        // check the likedlist 
        if(size ==0){
            System.out.println("LL is empty");
            return -1;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public  int RemoveLast(){
        if(size==0){
            System.out.print("LL is Empty");
            return -1;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // last node prev -> size-2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    
    }
    public void Print(){
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        RemoveElements ll = new RemoveElements();
        ll.AddFirst(2);
        ll.Print();
        ll.AddFirst(1);
        ll.Print();
        ll.addLast(3);
        ll.Print();
        ll.addLast(4);
        ll.Print();
        System.out.println( "Size: " + ll.size);
        ll.RemoveFirst();
        ll.Print();
        ll.RemoveLast();
        ll.Print();
        System.out.println("Size: " + ll.size);


    }
}



