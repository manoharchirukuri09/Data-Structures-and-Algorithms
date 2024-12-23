
public class Sub_Array {
  public static void subArray(int num[]){
    int total_pairs =0;
    for(int i=0;i<num.length;i++){
        int start = i;
    for(int j=i;j<num.length;j++){
        int end = j;
        for(int k=start;k<=end;k++){
            System.out.print(num[k] + " ");
           
        }
        total_pairs++;
        System.out.println();
    }
    System.out.println();

    }
    System.out.println("Total number of pairs: " + total_pairs);
  } 
  public static void main(String[] args) {
    int num[] ={2,4,6,8,10};
    subArray(num);  
  }
} 

