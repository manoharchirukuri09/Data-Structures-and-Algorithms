public class Backtracking_Array {
    public static void change(int arr[], int i, int val){
        if(i==arr.length){
            System.out.print(arr +" ");
            return;
        }
        arr[i] = val; //declare variables
        change(arr, i+1, val+1);//finction call
       arr[i] = arr[i]-2;//backtracking call
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        change(arr, 0, 1);
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i] + " ");
    }
}
}
