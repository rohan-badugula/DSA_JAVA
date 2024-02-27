// alphabetic half pyramid

import java.util.Scanner;

public class Pattern4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ch = 'A';
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+ (char)ch+" ");
                ch++;
            }
            System.out.print("\n");
        }
    }
}