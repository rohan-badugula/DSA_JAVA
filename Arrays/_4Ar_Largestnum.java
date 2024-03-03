import java.util.*;

public class _4Ar_Largestnum{
    public static int largest(int arr[]){
        int lar = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        return lar;
    }
    public static int smallest(int arr[]){
        int sml = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < sml){
                sml = arr[i];
            }
        }
        return sml;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,23,8,1,2,34};
        int lar = largest(nums);
        int sml = smallest(nums);
        System.out.println("Largest number is: " + lar);
        System.out.println("Smallest number is: " + sml);
    }
}