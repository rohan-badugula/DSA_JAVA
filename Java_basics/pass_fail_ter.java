import java.util.Scanner;

public class pass_fail_ter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String res = marks > 33 ? "Pass" : "Fail" ;
        System.out.println("The result is : " + res);
    }
}