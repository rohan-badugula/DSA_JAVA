//Linear Search

public class _3Ar_LinearSearch{
    public static int LinearSearch(int arr[], int k){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {1,4,20,32,9,10,12,28};
        int key = 101;
        int index = LinearSearch(num, key);
        if(index == -1){
            System.out.println("Does not exist");
        }
        else{
            System.out.println("Found at: " + index);
        }
    }
}