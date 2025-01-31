public class ith_bit{
    public static void main(String args[]){
        int num = 10;
        int i = 2;
        int mask = (1 << i);
        if((num & mask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        System.out.println((num | mask));
    }
}