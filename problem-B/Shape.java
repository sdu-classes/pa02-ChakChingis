public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this("red" , true);
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        if (this.filled == true){
            return "A Shape with color of " + this.color + " and filled";
        }
        else return "A Shape with color of " + this.color + " and not filled";
    }
}
