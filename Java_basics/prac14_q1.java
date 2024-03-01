// Write a Java method to compute the averageof three numbers.

import java.util.Scanner;
public class prac14_q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = (float) (a+b+c)/3;
        System.out.println("The average is: "+ average); 

    }
}