public class RemoveNthNode {
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
    public static int size;
    public static void Last(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void print(){
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
    public static void Remove(int n){
        int sz =0;
        Node temp =head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        // check the n value and size of the linkedlist is equal
        if(n==sz){
            head = head.next;
            return;
        }
        // to find the previous Node
        // size - n; 6 -3 = 3;
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    public static void main(String[] args){
        RemoveNthNode ll = new RemoveNthNode();
        ll.Last(1);
        ll.Last(2);
        ll.Last(3);
        ll.Last(4);
        ll.Last(5);
        ll.Last(6);
        ll.print();
        ll.Remove(3);
        ll.print();
    }
}
