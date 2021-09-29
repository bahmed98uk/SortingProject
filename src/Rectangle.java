
public class Rectangle implements Comparable<Rectangle>{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [" + length + " x " + width + ", Area: " + (length * width) + "]";
    }

    @Override
    public int compareTo(Rectangle r) {
        int result = Double.compare(getArea(), r.getArea());
        return result;
    }
}