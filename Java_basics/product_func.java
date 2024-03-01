import java.util.Scanner;
public class product_func{
    public static int mult(int x , int y){
        int res = x * y;
        return res;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = mult(a,b);
        System.out.println(product);
    }
}