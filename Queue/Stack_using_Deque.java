import java.util.*;
public class Stack_using_Deque {
    static class stack{
        Deque<Integer> q = new LinkedList<Integer>();
        // add element
        public void push(int data){
            q.addLast(data);
        }
        // remove element
        public int pop(){
            return q.removeLast();
        }
        // top element
        public int peek(){
            return q.getLast();
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek element : " + s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
