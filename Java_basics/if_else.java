import java.util.Scanner;

public class if_else{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18){
            System.out.println("*** \n Major \n Can Drive \n Can vote");
        }
        else{
            System.out.println("***\n Minor");
        }
    }
}