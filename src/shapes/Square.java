package shapes;

public class Square extends Rectangle{
//    Constructor
    public Square(double side) {
        super(side, side);
    }

//    Override
    @Override
    public double getArea() {
        System.out.println("Square");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square2");
//        double side = 5;
//        return 4*(side);
        return this.length * 4;
    }

    //    This may not be working. Check source code in fortran-web-exercises
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                "}";
    }
}
