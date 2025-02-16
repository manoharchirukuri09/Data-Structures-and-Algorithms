

public class RemoveCycle {
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
        public static void remove(){
            if(head==null || head.next == null){
                return;
            }
            // find the cycle detect
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast != null && fast.next != null){
                slow = slow.next; 
                fast = fast.next.next;
                if(fast==slow){
                    cycle = true;
                    break;
                }
            }
            if(cycle==false){
                return;
            }
            // Find the when the matching point of slow and fast
            slow =head;
            Node prev = null;//last node
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            // remove the cycle detect
            prev.next = null;
        }
        public static void main(String[] args){
            head = new Node(1);
            Node temp = new Node(2);
            head.next=temp;
            head.next.next = new Node(3);
            head.next.next.next=temp;
            remove();
           Node current = head;
           while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
           }
           System.out.println("null");
        }
    }

