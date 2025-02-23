import java.util.*;
public class Push_element_to_Bottom {
    public static void push_to_bottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        push_to_bottom(s, data);
        s.push(top);

    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
         push_to_bottom(s,4);
         while(!s.isEmpty()){
            System.out.println(s.peek()); //
            s.pop();
         }
    }
}
