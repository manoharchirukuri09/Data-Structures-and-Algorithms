public class Middle {
    public static class Node{
        int data;
        Node next;
    
    public   Node(int data){
        this.data = data;
         this.next = null;

    }
}
public static Node head;
public static  Node tail;
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head= tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
public  void addLast(int data){
    Node NewNode = new Node(data);
    if(head == null){
        head=tail=NewNode;
        return;
    }
    tail.next= NewNode;
    tail=NewNode;
} 
public void print(){
   if(head == null){
    System.out.println("null");
    return;
   }
   Node temp = head;
   while(temp != null){
    System.out.print(temp.data + "->");
    temp = temp.next;
   } 
   System.out.println("null");

}
public void add(int index, int data){
    // insertion at the beginning
    if(index ==0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i=0;
    while( temp != null && i < index-1 ){
        temp = temp.next;
        i++;
    }
    // i = idx -1 temp->prev
    newNode .next = temp.next;
    temp.next= newNode;
}
public static void main(String[] args){
    Middle ll = new Middle();
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.add(2,9);
    ll.print();
}

}
