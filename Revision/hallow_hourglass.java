public class hallow_hourglass{
    public static void main(String args[]){
        int num = 4;
        for(int i = 1; i<= num; i++){
            for(int j = 1; j<=num;j++){
                if(i == 1){
                    System.out.print(" "+ "*"+ " ");
                }
                // else if(j<i){
                //     System.out.print(" ");
                // }
                else if(j == i || j == num-i){
                    System.out.print(" "+ "*"+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}