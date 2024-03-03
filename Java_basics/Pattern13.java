// Solid Rhombus

import java.util.Scanner;
public class Pattern13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j =1; j< 2*num; j++){
                if(j>= num-i+1 && j <= (2*num)-i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}