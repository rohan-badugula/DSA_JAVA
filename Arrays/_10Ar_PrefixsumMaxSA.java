// Prefix Sum method, we add one more array to store the prefix sum of the elements.
// Explanation in notebook. 

import java.util.*;
public class _10Ar_PrefixsumMaxSA{
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int pre[] = new int[arr.length];
        int maxi = Integer.MIN_VALUE;
        pre[0] = arr[0];
        for(int i = 1; i< arr.length;i++){
            pre[i] = pre[i-1] + arr[i];
        } 
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                if(i == 0){
                    sum = pre[j];
                }
                else{
                    sum = pre[j] - pre[i-1];
                }
                if(sum > maxi){
                    maxi = sum;
                }
            }
        }
        System.out.println("The maximum subarray sum is: "+ maxi);
    }
}