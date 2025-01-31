public class odd_or_even{
    public static void main(String args[]){
        int num = 32;
        int mask = 1;
        if((num & mask) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
}