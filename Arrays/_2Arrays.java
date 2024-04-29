// arrays pass by argument

public class _2Arrays{
    public static void upd(int ar[]){
        for(int i = 0; i< ar.length; i++){
            ar[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {1,2,3,4,5};
        upd(marks);
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
    
    }
}