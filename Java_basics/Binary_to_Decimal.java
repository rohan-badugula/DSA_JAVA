import java.util.Scanner;
public class Binary_to_Decimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int i = 0;
        int power = 0;
        int dec = 0;
        while( bin != 0){
            i = bin % 10;
            dec = dec + i* (int)Math.pow(2,power);
            bin /= 10;
            power++;
        }
        System.out.println("Decimal: "+ dec);
    }
}