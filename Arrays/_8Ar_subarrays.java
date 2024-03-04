public class _8Ar_subarrays{
    public static void main(String args[]){
        int arr[] = {12,13,14,12,16,17,29,39,49};
        int ts = 0;
        for(int i =0; i< arr.length; i++){
            int s = i;
            for(int j =i; j<arr.length; j++){
                int e = j;
                for(int k = s; k<=e;k++){
                    System.out.print(arr[k]+ " ");
                }
                ts++;
                System.out.println(" ");
            }
        }
        System.out.println("Total sub arrays = "+ ts);
    }
}