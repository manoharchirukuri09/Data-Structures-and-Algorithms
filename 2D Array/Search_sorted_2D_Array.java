public class Search_sorted_2D_Array {
    public static boolean isSorted(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("Key is found : " + "(" + row + ", " + col + ")");
                return true;
            }else if(matrix[row][col]>key){
                //left
                col--;
            }else{
                //bottom
                row++;
                
            }
        }
        System.out.println("Key is not found: ");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,35,50}};
                        int key = 33;
                        isSorted(matrix,key);
    }
}

