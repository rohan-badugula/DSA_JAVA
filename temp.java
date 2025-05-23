public class temp {
    public static void main(String args[]){
        int nums[] = {6, 3, 9, 8, 2, 5};
        int i = -1;
        int p = nums[nums.length - 1];
        for(int j = 0; j < nums.length; j++){
            if(nums[j] < p){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        int temp = nums[i];
        nums[i] = p;
        nums[nums.length - 1] = temp;
        for(i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}