package shapes;

public abstract class Quadrilateral {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength () {
        return this.length;
    }

    abstract void setLength(int length);

    public int getWidth () {
        return this.width;
    }

    abstract void setWidth(int width);
}
