import java.util.*;
public class _1Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // creation
        int marks[] = new int[50];
        int num[] = {1,2,3};
        String fruits[] = new String[10];

        // input & output
        marks[0] = 18;
        marks[1] = 70;
        marks[2] = 99;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //updating
        marks[2] = 89;
        marks[1] = marks[1] + 1; 
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("Length of array"+ marks.length);


    }
}