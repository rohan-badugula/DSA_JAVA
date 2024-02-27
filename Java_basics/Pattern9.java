// 0-1 triagle pattern

import java.util.*;

public class Pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        int k = 0;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j<= i; j++){
                if(c==0){
                    c = 1;
                }
                else{
                    c = 0;
                }
                System.out.print(" "+ c + " ");
            }
            if(k==0){
                c = 1;
                k = 1;
            }
            else{
                c = 0;
                k = 0;
            }
            System.out.println("");
        }
    }
}