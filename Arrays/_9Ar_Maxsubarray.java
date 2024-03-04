import java.util.*;
public class _9Ar_Maxsubarray{
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum + arr[k];
                }
                if(sum > maxi){
                    maxi = sum;
                }
            }
        }
        System.out.println("The max sum is: "+ maxi);
    }
}