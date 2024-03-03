// Diamond Pattern

import java.util.Scanner;
public class Pattern15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<= num/2; i++){
            for(int j =1; j<= (num/2) - i; j++){
                System.out.print("   ");
            }
            for(int j =1; j<= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for(int i = num/2; i>=1; i--){
            for(int j =1; j<= (num/2) - i; j++){
                System.out.print("   ");
            }
            for(int j =1; j<= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        


    }
}