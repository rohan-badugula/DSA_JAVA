// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class prac11_q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            System.out.println(a + " is positive");
        }
        else if(a < 0){
            System.out.println(a + " is negative");
        }
        else{
            System.out.println(a + " = 0");
        }
    }
}