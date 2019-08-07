public class Circle extends Shape {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }
    public double getArea(){
        double circleArea= this.radius*this.radius*Math.PI;
        return circleArea;
    }
    public double getPerimeter(){
        double circlePerimeter=this.radius*2*Math.PI;
        return circlePerimeter;
    }
    @Override
    public String toString(){
        String circleDescribe="A circle with radius ="+ getRadius()+" which is a subclass of "+super.toString();
        return circleDescribe;
    }
    @Override
    public void resize(double percent){
        this.radius*=(1+percent/100);
    }
}
