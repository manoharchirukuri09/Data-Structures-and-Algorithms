import java.util.*;
public class Sort_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.print(list);
        System.out.println();
        // ascending order sort
        Collections.sort(list);
        System.out.print(list);
        System.out.println();
        // descending order sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
        System.out.println();
    }
}

