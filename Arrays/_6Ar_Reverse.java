public class _6Ar_Reverse{
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12,14};
        int n = nums.length;
        for(int i = 0; i<n/2;i++){
            nums[i] = nums[i] + nums[(n-1)-i];
            nums[(n-1)-i] = nums[i] - nums[(n-1)-i];
            nums[i] = nums[i] - nums[(n-1)-i];
            // System.out.println(nums[i]+" " + nums[(n-1) - i]);            
        }
        for(int i = 0; i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}