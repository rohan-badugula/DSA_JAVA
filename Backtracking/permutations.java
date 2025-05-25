public class permutations{
    public static void find(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        //rec
        for(int i = 0; i < str.length(); i++){
            String news = str.substring(0,i) + str.substring(i+1, str.length());
            find(news, ans+str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "abcd";
        find(str, "");
    }
}