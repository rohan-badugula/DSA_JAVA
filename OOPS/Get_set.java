public class Get_set{
    public static void main(String args[]){
        Pen p = new Pen();
        p.set_color("black");
        System.out.println(p.get_color());
    }
}

class Pen{
    private String color;
    private int tip;

    public void set_color(String color){
        this.color = color;
    }
    public String get_color(){
        return color;
    }
}