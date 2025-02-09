public class Permutations {
    public static void Substring(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String rest = str.substring(0,i) + str.substring(i+1);
            Substring(rest, ans+curr);
        }
    }
    public static void main(String[] args){
        Substring("abc" , "");
    }
}
