public class substring{
    public static void findsubsets(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //yes
        findsubsets(str, ans+str.charAt(i), i+1);

        //no
        findsubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findsubsets(str, "", 0);
    }
}