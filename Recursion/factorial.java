public class factorial{
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String agrs[]){
        System.out.println(fact(0));
    }
}