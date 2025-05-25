public class array_prac{
    public static void barr(int nums[], int i, int val){
        //base
        if(i == nums.length){
            for(int k:nums){
                System.out.print(k + " ");
            }
            System.out.println("");
            return;
        }

        nums[i] = val;
        barr(nums, i+1, val+1);
        nums[i] -= 2;
    }
    public static void main(String args[]){
        int nums[] = new int[5];
        barr(nums, 0, 0);
        for(int k:nums){
            System.out.print(k + " ");
        }
        System.out.println("");
    }
}