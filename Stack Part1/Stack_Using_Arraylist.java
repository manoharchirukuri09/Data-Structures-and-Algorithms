import java.util.*;
public class Stack_Using_Arraylist {
    public static  class Stack{
        ArrayList<Integer> list = new ArrayList<Integer>();
        // stack operations 
        //isEmpty()
        public  boolean isEmpty(){
            return list.size()==0;
        }
        // push operation insert element in top 
        public void push(int data){
            list.add(data);
            
        }
        // pop operation remove element from the top and return
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek operation - return the top element without removing it
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
      Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      } 
       
    
    }
}

