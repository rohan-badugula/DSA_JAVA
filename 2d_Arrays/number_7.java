public class number_7{
    public static void main(String args[]){
        int arr[][] = {{1,2,3}, {4,3,2}};
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 3){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}