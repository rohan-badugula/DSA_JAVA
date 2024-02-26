// Enter cost of 3 items from the user (using floatdatatype)- a pencil,a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem

import java.util.Scanner;

public class prac9_q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the Pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of the Pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of the Eraser");
        float eraser = sc.nextFloat();
        float bill = pencil +pen + eraser;
        float gst_bill = bill + (0.18f* bill);
        System.out.println("****Bill**** \n Bill: " + bill+"\n GST_Bill: "+ gst_bill);

    }
}