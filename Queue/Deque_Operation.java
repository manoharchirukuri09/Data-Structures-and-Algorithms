import java.util.*;
public class Deque_Operation {
    public static void main(String[] args) {
     Deque<Integer> q = new LinkedList<Integer>();   
     q.addFirst(1);
     q.addFirst(2);
     System.out.println("Add first elements: " + q);
     q.addLast(3);
     q.addLast(4);
     System.out.println("Add last elements: " + q);
     q.removeFirst();
     System.out.println("Remove first elements: " + q);
     q.removeLast();
     System.out.println("Remove last elements: " + q);
   
     System.out.println("Get first element: " +   q.getFirst());
     System.out.println("Get last element: " + q.getLast());
     
    }
}

