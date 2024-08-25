import java.util.Scanner;

public class arr_Binary_search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[7];
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = arr.length;
        int key = sc.nextInt();
        boolean flag = true; 
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                System.out.println("Number found at "+ mid + " index");
                flag = false;
                break;
            }
            else if(arr[mid] >= key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if (flag){
            System.out.println("Not found");
        }
    }
}