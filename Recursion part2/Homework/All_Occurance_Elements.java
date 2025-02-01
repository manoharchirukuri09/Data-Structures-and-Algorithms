public class All_Occurance_Elements {
    public static void Elements( int arr[], int i, int key){
        if(i<arr.length){
            if(arr[i]==key){
          return;
               
        }
    
         Elements(arr, i+1, key);
    }
}
    
    
    public static void main(String[] args){
       int arr[] = {1,2,3,4,5,6,7,2,2,2};
       int key = 2;
   for (int i=0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.print(i + " ");
        }
       }
       System.out.println();
       Elements(arr, 0, key);
    }
}
