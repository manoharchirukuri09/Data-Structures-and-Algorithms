import java.util.*;
public class Largest_Element {
    public static int Largest(int num[]){
        int largest=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={1,2,4,6,7,9,10,12,16,3,18};
        int result = Largest(num);
        System.out.println("The largest element is " + result);
}
}


