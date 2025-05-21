public class opower{
    public static int opower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpow = opower(x,n/2);
        if(n % 2 == 0){
            return halfpow * halfpow;
        }
        else{
            return x * halfpow * halfpow;
        }
    }
    public static void main(String args[]){
        System.out.println(opower(5,10));
    }
}