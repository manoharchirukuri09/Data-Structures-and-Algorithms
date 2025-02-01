public class Update_Ith_Bit {
    public static int update(int n, int i, int newBit){
        return n | (newBit << i);
    
}
public  static void main(String[] args){
    System.out.println(update(10,2,1));
}
}
