public class arr_Reverse{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        for(int i = 0; i<n/2;i++){
            arr[i] = arr[i] + arr[n-i-1];
            arr[n-i-1] = arr[i] - arr[n-i-1];
            arr[i] = arr[i] - arr[n-i-1];
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}