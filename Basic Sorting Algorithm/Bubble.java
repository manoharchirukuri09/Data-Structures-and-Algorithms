public class Bubble {
    public static void Bubble_sort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[] ={5,4,1,3,2};
        Bubble_sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}

