public class PalindromeLinkedlist {
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void Last(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }
    public static void Print(){
        if(head==null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean Palindrome(Node head){
        // check the node is empty
        if(head == null || head.next == null){
            return true;
        }
        // step 1 find mid value using slow fast approach
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;// it increase +1;
            fast = fast.next.next; // it increase +2;

        }
         Node MidNode = slow;
        // step 2 revesre the second half;
        Node prev = null;
        Node curr = MidNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step 3 check the left and right parts are equal or not
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }
    public static void main(String[] args){
        PalindromeLinkedlist ll = new PalindromeLinkedlist();
        ll.Last(1);
        ll.Last(2);
        ll.Last(2);
        ll.Last(2);
        ll.Print();
        System.out.println(ll.Palindrome(head));

    }
}
