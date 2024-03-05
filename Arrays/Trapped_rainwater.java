import java.util.*;
public class Trapped_rainwater{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5  };
        int max_left[] = new int[arr.length];
        int max_right[] = new int[arr.length];
        max_left[0] = arr[0];
        max_right[arr.length-1] = arr[arr.length-1];
        for(int i = 1; i<arr.length;i++){
            max_left[i] = Math.max(max_left[i-1], arr[i]);
        }
        for(int i = arr.length-2; i >=0; i--){
            max_right[i] = Math.max(max_right[i+1],arr[i]);
        }
        // for(int i = 0; i<arr.length;i++){
        //     System.out.print(max_left[i]+ " ");
        //     System.out.println(max_right[i]);
        // }
        int wt = 0;
        for(int i = 1; i<arr.length-1;i++){
            int wl = Math.min(max_left[i],max_right[i]);
            // System.out.println(wl);
            wt = wt+ (wl - arr[i]);
        }
        System.out.println("The water trapped: "+ wt);
    }
}