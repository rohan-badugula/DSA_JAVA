import java.util.Scanner;

public class sum_ofN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first "+ num+ " numbers is: "+ sum);
    }
}