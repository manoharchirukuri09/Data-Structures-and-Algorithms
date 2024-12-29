public class Diagonal_sum {
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum +=matrix[i][i];
            //secondary diagonal
            sum +=matrix[i][matrix.length-1-i];
        }
        return sum;

    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},
    {5,6,7,8},
{9,10,11,12},
{13,14,15,16}};
 int result =diagonal_sum(matrix);
System.out.println("The diagonal sum is " + result);
    }
}
