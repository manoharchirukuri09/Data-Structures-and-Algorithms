public class Quick_sort {
    public static void Sorting(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //partion 
        int Pindex = partion(arr, si, ei);
        //left part of the pivot element
        Sorting(arr,si,Pindex-1);
        //right part of the pivot element
        Sorting(arr,Pindex+1,ei);
    }
    public static int partion(int arr[], int si, int ei){
        //intilalize the pivot element
        int pivot =arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
        }
    }
    i++;
    int temp =pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
}
public static void main(String[] args) {
    int arr[] = {6,3,9,8,2,5};
    Sorting(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
