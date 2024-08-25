import java.util.Scanner;

public class arr_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {21,23,145,665,354,6,76,3,34435,353456,57,2321};
        int lar = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if( arr[i] > lar){
                lar = arr[i];
            }
        }
        System.out.println("Largest is "+ lar);
    }
}