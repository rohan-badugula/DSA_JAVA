public class last_occurance{
    public static int  focc(int[] nums, int i, int num){
        if(i == -1){
            return -1;
        }
        else if(nums[i] == num){
            return i;
        }
        return focc(nums, i - 1, num);
    }
    public static void main(String args[]){
        int nums[] = {1,2,5,7,7,5,4};
        System.out.println(focc(nums, nums.length-1, 1));
    }
}