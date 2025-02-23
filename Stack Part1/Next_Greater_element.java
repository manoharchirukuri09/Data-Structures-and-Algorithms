import java.util.*;
public class Next_Greater_element {
    public static void main(String[] args) {
        int arr[]= {6,8,0,1,3};
        int nxt[] = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        // check the elements from end of the array
        for(int i=arr.length-1; i>=0; i--){
            // step 1
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                
                s.pop();
            }
            // check the condition 
            if(s.isEmpty()){
                nxt[i] = -1;
            }else{
                nxt[i] = arr[s.peek()];
            }
            // insert the elements into stack
            s.push(i);
        

        }
        // print the nxt greater element
        for(int i=0;i<nxt.length;i++){
            System.out.print(nxt[i] + " ");
        }
        System.out.println();
    }
}

