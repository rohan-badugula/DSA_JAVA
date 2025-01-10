import java.util.Scanner;

public class selection_sort{
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printarr(arr);
    }
}