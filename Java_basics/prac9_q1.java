// In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.

import java.util.Scanner;

public class prac9_q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("Enter number 3:");
        int c = sc.nextInt();

        float avg = (float) (a+b+c)/3;
        System.out.println("The Average is :" + avg);
    }
}