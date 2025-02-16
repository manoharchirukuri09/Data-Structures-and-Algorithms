import java.util.*;
public class Reverse_Array {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.print(list);
       System.out.println();
       // reverse of the array
       for(int i= list.size()-1 ; i>=0;i--){
        System.out.print(list.get(i) + " ");
       }
    }
}
