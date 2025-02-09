public class Subsets_String {
    public static void Subsets(String str, int i, String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
                return;
            }
        }
        //yes
        Subsets(str, i+1, ans+str.charAt(i));
        //No
        Subsets(str, i+1, ans);
    }
    public static void main(String[] args){
        String str = "abc";
        Subsets(str, 0, "");
    }
}
