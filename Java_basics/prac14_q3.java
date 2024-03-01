// Write a Java program to check if a number is a palindrome in Java?

import java.util.*;
public class prac14_q3{
    public static int rev_num(int num){
        int rev = 0;
        int i = 0;
        while(num != 0){
            i = num % 10;
            rev = rev*10 + i;
            num = num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = rev_num(num);
        if(num == reverse){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}