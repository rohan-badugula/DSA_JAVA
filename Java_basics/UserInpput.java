import java.util.Scanner;

public class UserInpput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // // word
        // String string_inp = sc.next();
        // System.out.println("Entered " + string_inp);

        // sentence
        String line_inp = sc.nextLine();
        System.out.println("Entered" + line_inp);
    }
}