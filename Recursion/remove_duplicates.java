public class remove_duplicates{
    public static void rm_dup(String str, StringBuilder sb, boolean map[], int i){
        if(i == str.length()){
            System.out.println(sb.toString());
            return; 
        }
        if(map[str.charAt(i) - 'a']){
            rm_dup(str,sb,map,i+1);
        }
        else{
            map[str.charAt(i) - 'a'] = true;
            rm_dup(str,sb.append(str.charAt(i)), map,i+1);
        }

    }
    public static void main(String args[]){
        String str = "rrrooohaaannsssswaassaathsasasasaai";
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        rm_dup(str, sb, map, 0);
    }
}