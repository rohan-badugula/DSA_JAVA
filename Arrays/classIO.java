import java.util.Scanner;
public class classIO{
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        System.out.println("Enter the numbers one-by-one: ");
        int arr[] = new int[num];
        for(int i = 0; i<num;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void output(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int nums[] = input();
        output(nums);
        
    }
}