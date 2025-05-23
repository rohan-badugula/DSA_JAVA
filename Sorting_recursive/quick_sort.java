public class quick_sort{
    public static void quick_sort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }

        //recursion
        int p = partition(arr, si, ei);
        quick_sort(arr,si, p-1);
        quick_sort(arr, p, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int i = si - 1;
        int p = arr[ei];
        for(int j = si; j < ei; j++){
            if(arr[j] < p){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = p;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        quick_sort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}