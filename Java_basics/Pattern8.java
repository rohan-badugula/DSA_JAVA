// Floyd triangle

import java.util.Scanner;

public class Pattern8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 1;
        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("\t"+ c + "\t");
                c++;
            }
            System.out.println("");
        }
    }
}