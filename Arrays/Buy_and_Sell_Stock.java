public class Buy_and_Sell_Stock{
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        int min_bp = arr[0];
        int max_prof = 0;
        for(int i = 1; i<arr.length;i++){
            int prof = arr[i] - min_bp;
            max_prof = Math.max(max_prof,prof);
            min_bp = Math.min(min_bp,arr[i]);
        }
        System.out.println("Max profit: "+ max_prof);
    }
}