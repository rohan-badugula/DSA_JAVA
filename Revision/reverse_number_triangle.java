public class reverse_number_triangle{
    public static void main(String args[]){
        int num = 4;
        for(int i = 1;i<=num;i++){
            for(int j = 1; j<=num;j++){
                if(j < i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" "+ j +" ");
                }
            }
            System.out.print("\n");
        }
    }
}