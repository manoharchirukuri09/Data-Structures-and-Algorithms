public class Tower_of_Honai {
    public static void Tower(int n, String src, String helper, String dest) { 
        if(n==1){
            System.out.print("Transfer Desk " + n + " From " + src +  " to " + dest);
            return;
        }
        Tower(n-1, src, dest, helper);
        System.out.println("Transfer Desk " + n + " From " + src + " to " + dest);
        Tower(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        Tower(3, "S" ,"H", "D");
    }
}
