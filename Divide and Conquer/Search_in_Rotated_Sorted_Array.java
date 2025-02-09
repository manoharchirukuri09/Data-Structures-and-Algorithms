public class Search_in_Rotated_Sorted_Array {
    public static int Search(int arr[], int key, int si, int ei){
        if(si>ei){
            return -1;
        }
        //mid value
        int mid = si + (ei-si)/2;
        if(arr[mid]==key){ 
            return mid;
        }
        //divide the array in two parts 
        //left part of the mid value
        if(arr[si] <=arr[mid]){
            //in the left total 2 cases
            //case 1;
            if(arr[si]<=key && key <= arr[mid]){
                //left part
                return Search(arr,key,si,mid-1);
            }else{
                // case 2
                // right part
                return Search(arr,key, mid+1,ei);
            }
        }else{
            //right part of the mid value
            if(arr[mid]<= key && key<=arr[ei]){
                // case 3 right part 
                return Search(arr, key, mid+1, ei);
            }else{
                // case 4 left part
                return Search(arr, key, si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;
         int indx=Search(arr, key, 0, arr.length-1);
         System.out.println("The target value found in: " + indx);
    }
}

