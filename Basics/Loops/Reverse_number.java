public class Reverse_number {
    public static void main(String[] args) {
        int n = 1088;
        while(n>0){
            int r = n%10;
            System.out.print(r);
            n = n/10;
        }
    }
}

