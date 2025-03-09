public class print_rev{
    public static void print_rev(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }
        System.out.print(n + " ");
        print_rev(n-1);
    }
    public static void main(String args[]){
        print_rev(10);
    }
}