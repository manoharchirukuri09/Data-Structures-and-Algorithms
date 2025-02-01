public class Binary_String {
    public static void Binary(int n, int lastIndex, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // total two possiablity 0 , 1
        //if lastIndex is 0
        if(lastIndex==0){ 
         Binary(n-1, 0 , str+ "0");
         Binary(n-1, 1, str+ "1");
        }else{
            // if lastIndex is 1
         Binary(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args){
        Binary(3,0,"");
    }
}
