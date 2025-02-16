public class ZigZagLinkedlist {
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
    public static void AddLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next =newNode;
            tail=newNode;
        }
       
    }
    public static void Print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
    }
    public void Zigzag(){
        // step 1 find mod value
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;
        // reverse the 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // zigzag
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
       ZigZagLinkedlist ll = new ZigZagLinkedlist();
       ll.AddLast(1);
       ll.AddLast(2);
       ll.AddLast(3);
       ll.AddLast(4);
       ll.AddLast(5);
       ll.AddLast(6);
       ll.Print();
       ll.Zigzag();
       ll.Print();
    }
}

