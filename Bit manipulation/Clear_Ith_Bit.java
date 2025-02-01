public class Clear_Ith_Bit {
    public static int clear_Ith_Bit(int n, int i){
        int bitmask = 1<<i;
        return n & ~bitmask;
    }
    public static void main(String[] args){
        System.out.println(clear_Ith_Bit(10, 1));
    }
}
