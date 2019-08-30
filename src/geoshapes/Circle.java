/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoshapes;

public class Circle {

    private double radius;

    public void setRadie(double radie) {
        this.radius = radie;
    }

    public double getRadie() {
        return radius;
    }

    public Circle(double radie) {
        this.radius = radie;
    }
    
    public double getCircumference() {
        return Math.PI * radius * 2;
        
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString() {
     return "Radius " + radius + 
             "\nCircumference " + getCircumference() + 
             "\nArea " + getArea() + 
             "\n";
     
    }

}
