import java.util.*;
public class Queue_Using_Dequeue {
    static class Queue{
        Deque<Integer> deque = new LinkedList<Integer>();
        // add element
        public void add(int data){
            deque.addLast(data);
        }
        // remove element
        public int remove(){
            return deque.removeFirst();
        }
        // peek element
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println( "The peek element: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        }
    }

