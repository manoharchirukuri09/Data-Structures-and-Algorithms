import java.util.*;
public class Reverse_queue {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        // add element into stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        // add element stack to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       reverse(q);
       while(!q.isEmpty()){
        System.out.print(q.remove()+ " ");
       } 
       System.out.println();
    }
}

