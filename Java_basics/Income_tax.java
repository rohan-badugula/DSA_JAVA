import java.util.Scanner;

public class Income_tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary:");
        float salary = sc.nextFloat();
        if (salary < 500000){
            System.out.println("The salary is greater than 5L, 0% tax\n");
            System.out.println("The total tax this year is: 0");
        }
        else if (salary > 500000 && salary < 1000000){
            System.out.println("The salary is greater than 5L and less than 10L, 20% tax\n");
            System.out.println("The total tax this year is: "+ salary*0.2f);
        }
        else if (salary > 1000000){
            System.out.println("The salary is greater than 10L, 30% tax\n");
            System.out.println("The total tax this year is: "+ salary*0.3f);
        }
    }
}