
import java.util.*;
public class Inter_Leave_element {
    public static void inter_leave_element(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<Integer>();
        int size = q.size();
        // insert the element in first queue
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        // inter_leave elements like 1 6 2 7 3 8 4 9 5 10;
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        inter_leave_element(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
    }
}

