// INVERTED & ROTATED HALF-PYRAMID pattern

import java.util.*;

public class Pattern6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num ;j++){
                if(j<(num-i+1)){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}