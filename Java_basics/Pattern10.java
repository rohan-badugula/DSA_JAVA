// Butterfly

import java.util.Scanner;

public class Pattern10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<= num; i++){
            for(int j = 1; j <= num; j++){
                if(i<=num/2){
                    if(j == 1 || j == num || j<=i || j >= (num-i+1)){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                else{
                    if(j == 1 || j == num || j>=i || j <= (num-i+1)){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
    }
}