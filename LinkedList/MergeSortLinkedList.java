public class MergeSortLinkedList {
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
    public static void AddFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
       
    }
    public static void Print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // step 1 find the mid value
    private Node getMid(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //merge two sorted linked lists
    private Node Merge(Node head1, Node head2){
        Node Mergedll = new Node(-1);
        Node temp = Mergedll;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1 = head1.next;
                temp= temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp= temp.next;
            }
        }
        //copy remaining elements from left to right half
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp= temp.next;
        }
        return Mergedll.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right merge sort
        Node rightHead=mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return Merge(newLeft,newRight);
    }

    


    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();
        ll.AddFirst(1);
    
        ll.AddFirst(2);
        
        ll.AddFirst(3);
        
        ll.AddFirst(4);
    
        ll.AddFirst(5);
        ll.Print();
        ll.head = ll.mergeSort(ll.head);
        ll.Print();
    }
    }


