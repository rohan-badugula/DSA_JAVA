import java.util.Scanner;

public class print_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while(i<=num){
            System.out.print(i + " ");
            i++;
        }
    }
}