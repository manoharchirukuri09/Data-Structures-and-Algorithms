import java.util.*;
public class Maximum_Array {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.print(list);
        System.out.println();
        int max = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }

        }
        System.out.println("The Maximum Number in the Array is " + max);
    }
}
