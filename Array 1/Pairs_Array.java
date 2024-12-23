public class Pairs_Array {
    public static  void pairs_array(int num[]){
        int total_pairs =0;
        for(int i=0;i<num.length;i++){
            int curr = num[i];
        for(int j=i+1;j<num.length;j++){
            System.out.print("(" + curr + "," + num[j] + ")");
            total_pairs++;
        }
        System.out.println();
        }
        System.out.println("The total number of Pairs: " + total_pairs);
    }
    public static void main(String[] args){
        int num[] = {2,4,6,8,10};
        pairs_array(num);
    }
}
