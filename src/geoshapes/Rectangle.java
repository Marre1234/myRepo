/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoshapes;

public class Rectangle {

    private double length;
    private double width;

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

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Length " + length
                + "\nwidth" + width
                + "\nCircumference " + getCircumference()
                + "\nArea " + getArea()
                + "\n";
    }
}
