import java.util.*;
public class Non_repeating_element {
    public static void Non_Repeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<Character>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[ch - 'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() +  " ");
            }
        }
       System.out. println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        Non_Repeating(str);
    }
}
    

