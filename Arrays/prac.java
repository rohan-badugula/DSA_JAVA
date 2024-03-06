class prac{
    public static void main(String args) {
        int[] nums = {3,2,4};
        int target = 7;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    int ar[] = [nums[i],nums[j]];
                }
            }
        }
        classIO.output(ar);
    }
}