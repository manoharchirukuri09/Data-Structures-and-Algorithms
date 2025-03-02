import java.util.*;
public class Queue_using_Two_Stack {
    public static class queue{
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();
        //empty
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        //add 
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
        }
        
        }
        // remove 
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
          return  s1.pop();
        }
        //peek()
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }


    }
    public static void main(String[] args){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
