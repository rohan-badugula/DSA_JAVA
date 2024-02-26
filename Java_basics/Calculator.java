import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator ");
        char x = sc.next().charAt(0);
        switch (x) {
            case '+': System.out.println(a + " " + x + " " + b + " = "+ (a+b));
                      break;
            case '-': System.out.println(a + " " + x + " " + b + " = "+ (a-b));
                      break;
            case '*': System.out.println(a + " " + x + " " + b + " = "+ (a*b));
                      break;
            case '/': System.out.println(a + " " + x + " " + b + " = "+ (a/b));
                      break;
            case '%': System.out.println(a + " " + x + " " + b + " = "+ (a%b));
                      break; 
            default: System.out.println("Invalid operator");           
        }
    }
}