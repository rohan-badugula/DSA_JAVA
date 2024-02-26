public class Logical{
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        System.out.println((a>b)&&(b==a)); // false
        System.out.println((a>b)||(b==a)); // true
        System.out.println(!(b==a));       // true
    }
}