import java.util.*;

public class arr_Liner_Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,34,56,67,23,54};
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 0; i<arr.length;i++){
            if(num == arr[i]){
                System.out.println("number found at index "+ i);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("number not found");
        }
        
    }
}