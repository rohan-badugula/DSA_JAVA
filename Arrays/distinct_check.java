// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

public class distinct_check{
    public static boolean isDistinct(int arr[]){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(isDistinct(arr));
        
    }
}