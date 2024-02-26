import java.util.Scanner;

public class Arithmetic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Binary
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("--------");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println((float)a/b);
        System.out.println(a%b);

        //Unary
        int d = 10;
        int x = d++;
        System.out.println(d);
        System.out.println(x);
    }
}