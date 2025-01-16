public class linear_search{
    public static void main(String args[]){
        int arr[][] = { {1,2,3},
                        {5,6,7},
                        {9,10,11}};
        int key = 6;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Found at [" + i + " ," + j + "]" );
                    break;
                }
            }
        }
    }
}