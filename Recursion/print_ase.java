public class print_ase{
    public static void print_ase(int n){
        if(n == 1){
            System.out.print(" 1");
            return;
        }
        print_ase(n-1);
        System.out.print(" "+  n);
    }
    public static void main(String args[]){
        print_ase(5);
    }
}