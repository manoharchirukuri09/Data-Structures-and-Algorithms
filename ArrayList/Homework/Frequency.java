import java.util.*;
public class Frequency {
    public static int Lonely(ArrayList<Integer> list, int key){
        // store the elements counts
        int count[] = new int[1001];
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                count[list.get(i+1)]++;
            }
        }
        // find the values
        int maxvalue = 0;
        int target =0;
        for(int i=0;i<count.length;i++){
            if(count[i]>maxvalue){
                target = i;
                maxvalue = count[i];
            }
        }
        return target;
    
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key =1;
        System.out.println(Lonely(list, key));
    }
}
