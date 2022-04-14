package shapes;

public class Circle {
//    Properties
    private double radius;

//    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

//    Methods
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return (2 * Math.PI) * this.radius;
    }
}
