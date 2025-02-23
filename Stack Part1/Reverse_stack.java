import java.util.*;
public class Reverse_stack {
    public static void pushtobottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
        }
        int top = s.pop();
        pushtobottom(s, data);
        s.push(top);
    }
    public static void Reverse(Stack<Integer> s ){
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        Reverse(s);
        pushtobottom(s,top);
       
    }
    public static void Print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(2);
        s.push(1);
        Print(s);
        Reverse(s);
        Print(s);
    }
}

