public class Implement_queue_using_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;
        //isempty
        public boolean isEmpty(){
            return head == null && tail == null;
        }
        //Add
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }
        // remove
        public int remove(){
            if(isEmpty()){
                System.out.print("empty queue");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail=head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        //peek()
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
