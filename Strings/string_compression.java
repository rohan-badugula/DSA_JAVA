public class string_compression{
    public static void main(String args[]){
        String s = "aabcccdd";
        StringBuilder res = new StringBuilder("");
        int count = 1;
        res.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else if(s.charAt(i) != s.charAt(i-1)){
                res.append(count);
                res.append(s.charAt(i));
                count = 1;
            }
        }
        res.append(count);
        System.out.println(res.toString());
    }
}