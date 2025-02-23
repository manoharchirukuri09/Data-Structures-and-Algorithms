
import java.time.chrono.ThaiBuddhistChronology;

public class practice {
    static  class Node{
        int data;
        Node next;
         Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    static class stack{
        static  Node head = null;
        // is empty() operation
        static boolean empty(){
            return head==null;
        }
        //push
        static int push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
        }
    }

}
