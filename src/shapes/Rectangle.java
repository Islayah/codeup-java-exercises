package shapes;

public class Rectangle {

    //    Properties
    protected double length;
    protected double width;

    //    Constructors
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    //    Methods
    public double getArea() {
        return (length * width);
    }
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
//    Walkthrough Methods
    public double getPerimeter2() {
        return (this.length * 2) + (this.width * 2);
    }
    public double getArea2() {
        return this.length * this.width;
    }
}
