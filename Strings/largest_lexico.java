public class largest_lexico{
    public static void main(String args[]){
        String s[] = {"apple", "mango", "banana"};
        String largest = s[0];
        for(int i = 1; i < s.length; i++){
            if(s[1].compareTo(largest) > 0){
                largest = s[1];
            }
        }
        System.out.println(largest);

    }
}