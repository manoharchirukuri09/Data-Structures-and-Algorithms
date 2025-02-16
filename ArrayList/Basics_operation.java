import java.util.*;
public class Basics_operation {
    public static void main(String[] args){
        // create the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Add in the elements 
        list.add(5);
        list.add(6) ;
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        // add the value at particular index
        list.add(5,10);
        System.out.println(list);
        // Access the element
        int element= list.get(0);
        System.out.println("Access the particular element using index value:  " + element);
        //remove the element 
        int delete = list.remove(5);
        System.out.println("Remove the particular element using index value: " + delete);
        // change the value in the ArrayList
        list.set(1, 11);
        System.out.println(list);
        // check the element in the ArrayList  
        System.out.println( list.contains(6));
        // size of the Arraylist
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
       }
}
