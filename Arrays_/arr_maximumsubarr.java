import java.util.*;

public class arr_maximumsubarr{
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int lar = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum + arr[k];
                }
                if(sum>lar){
                    lar = sum;
                }
            }
        }
        System.out.println(lar);
    }
}