import java.util.Scanner;

public class largest_of2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("Largest number is :"+ num1);
        } 
        else{
            System.out.println("Largest number is : "+ num2);
        }
    }
}