import java.util.*;

public class counting_sort{
    public static void main(String args[]){
        int nums[] = {1,4,1,3,2,4,3,7};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int arr[] = new int[max+1];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+",");
        // }
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                continue;
            }
            else if(arr[i] == 1){
                nums[j] = i;
                j++; 
            }
            else if(arr[i] > 1){
                nums[j] = i;
                j++;
                arr[i]--;
                i--;
            }
        }

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+",");
        }
    }
}