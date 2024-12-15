import java.util.*;
public class purchaseofitems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of Pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of Eraser: ");
        float eraser = sc.nextFloat();
        float total_Cost = pencil + pen + eraser;
        System.out.println("The total of the purchase items : " + total_Cost);
        float gst = 0.18f;
        float total_Cost_With_gst = (total_Cost * gst) ;
        System.out.println("The total of the purchase items with gst : " + total_Cost_With_gst);
        float total_price = total_Cost + total_Cost_With_gst ;
        System.out.println("The total price of the purchase items with gst : " + total_price);
     }
}

