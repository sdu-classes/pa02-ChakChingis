public class Circle extends Shape {
    private double radius;

    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }
}
