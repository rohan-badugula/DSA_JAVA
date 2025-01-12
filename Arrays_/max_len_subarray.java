import java.util.*;

public class max_len_subarray {
    public static void main(String args[]){
        int nums[] = {1,2,3,1,1,1,1,3,3};
        int s = 0;
        int e = 0;
        int n = nums.length;
        int k = 6;
        int sum = nums[s];
        int max_len = 0;
        while(e < n){
            
            while(sum < k){
                e++;
                sum += nums[e];
                if(sum == k){
                    max_len = Math.max(max_len,e-s);
                }
            System.out.println("Hi");
            }
            sum -= nums[s];
            s++;
        }
        System.out.println(max_len);
    }
}
