public class _4Ar_Largestnum{
    public static int largest(int arr[]){
        int lar = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        return lar;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,23,8,1,2,34};
        int lar = largest(nums);
        System.out.println("Largest number is: " + lar);
    }
}