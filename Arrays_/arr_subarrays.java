public class arr_subarrays{
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                System.out.print("[ ");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println("");
            }
            System.out.println("");
        }
    }
}