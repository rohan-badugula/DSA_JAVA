public class _7Ar_Pairs{
    public static void main(String args[]){
        int nums[] = {11,12,14,16,17,18,19};
        int tp = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                System.out.print("("+nums[i]+","+nums[j]+")"+"\t");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total pairs: "+ tp);
    }
}