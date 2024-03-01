import java.util.*;
public class Decimal_to_Binary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int dec = sc.nextInt();
        int i =0;
        int bin = 0;
        int pow = 0;
        while( dec >= 1){
            i = dec % 2;
            bin = bin + i*(int)Math.pow(10,pow);
            dec /=2;
            pow++;
        }
        System.out.println("Binary: "+ bin);
    }
}