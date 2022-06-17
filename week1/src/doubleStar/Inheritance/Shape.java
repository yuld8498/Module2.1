package doubleStar.Inheritance;

public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }
    public void setShape(String color, boolean filled){
        this.color =color;
        this.filled =filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void defaultColor(){
        this.color = "blue";
    }
    public void defaultFilled(){
        this.filled = true;
    }
   public String toString(){
       return  "A Shape with color of xxx and filled/not filled";
   }
}
