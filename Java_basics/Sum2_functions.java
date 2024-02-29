import java.util.Scanner;
public class Sum2_functions{
    public static int add_both(int x, int y){
        return (x+y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add_both(a,b);
        System.out.println("Sum is: " + sum);
    }
}