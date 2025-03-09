public class sumn{
    public static int sumn(int n){
        if(n == 1){
            return n;
        }
        return n+ sumn(n-1);
    }
    public static void main(String args[]){
        System.out.println(sumn(7));
    }
}