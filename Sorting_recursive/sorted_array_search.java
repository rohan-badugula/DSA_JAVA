public class sorted_array_search{

    public static int search(int arr[], int t, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;
        if(arr[mid] == t){
            return mid;
        }
        else if(arr[si] <= arr[mid]){
            if(arr[si] <= t && t <= arr[mid]){
                return search(arr, t, si, mid - 1);
            }
            else{
                return search(arr, t, mid+1, ei);
            }
        }
        else{
            if(arr[mid] <= t && t <= arr[ei]){
                return search(arr,t,mid+1, ei);
            }
            else{
                return search(arr,t, si, mid-1);
            }
        }
        
    }


    public static void main(String args[]){
        int arr[] = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
        int target = 0;
        int index = search(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }
}