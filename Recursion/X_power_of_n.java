
public class X_power_of_n {
    public static int x_power_of_n(int n, int x){
        if(n==0){
            return 1;
        }
        return x * x_power_of_n(n-1, x);
    }
    public static void main(String[] args){
        System.out.println(x_power_of_n(10, 2));
    }
}
