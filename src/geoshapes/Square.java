package geoshapes;

public class Square {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCircumference() {
        return this.length * 4;
    }

    public double getArea() {
        return this.length * length;
    }

    @Override
    public String toString() {

        return "Radius " + length + 
             "\nCircumference " + getCircumference() + 
             "\nArea " + getArea() + 
             "\n";
    }

}
