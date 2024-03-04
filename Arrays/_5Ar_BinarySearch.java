// Binary Search

import java.util.*;
public class _5Ar_BinarySearch{
    public static int BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            System.out.print(start + " ");
            System.out.print(end+ " ");
            int mid = (start + end)/2;
            System.out.print(mid+ "\n");
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {11,13,16,17,18,19,12,34};
        System.out.println("The array is: ");
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n Enter the key to search: ");
        int key = sc.nextInt();
        int index = BinarySearch(nums,key);
        if(index == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at index: "+ index);
        }
    }
}