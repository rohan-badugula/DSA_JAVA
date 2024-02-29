import java.util.*;

public class Trying_methods{
    public static void say_hi(String name){
        System.out.println("Hi "+ name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String n = sc.nextLine();
        say_hi(n);
    }
}