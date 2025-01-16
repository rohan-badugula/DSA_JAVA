public class Diagnol_sum{
    public static void main(String args[]){
        int arr[][] = { {1,2,3},
                        {5,6,7},
                        {9,10,11}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length - i - 1){
                sum += arr[i][arr.length - i - 1];
            }
        }
        System.out.println(sum);

    }
}