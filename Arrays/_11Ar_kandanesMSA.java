// kandane's appraoch 

import java.util.*;
public class _11Ar_kandanesMSA{
    public static void main(String args[]){
        int arr[] = {-2,-3,-4,-2,-5,-3};
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int n_sum = Integer.MIN_VALUE;
        boolean flag = true;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>0){
                flag = false;
            }
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            n_sum = Math.max(arr[i], n_sum);
        }
        if(flag){
            System.out.println("Maximum Sub array sum: "+ n_sum);
        }
        else{
            System.out.println("Maximum Sub array sum: "+ ms);
        }
    }
}
