public class Trapping_water_practice {
    public static int trapping_rainwater(int height[]){
        int n = height.length;
        //left max boundry 
        int leftmax[] = new int[n];
         leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }
        
        //right max boundry
        int rightmax[] = new int[n];
         rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        //trapping rainwater
        int trapping_rainwater =0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapping_rainwater += waterlevel - height[i];
        }
        return trapping_rainwater;
       }
    
    public static void main(String[] args){
    int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
    int result = trapping_rainwater(height);
    System.out.println("The total trapping rainwater: " + result);
    }
}
