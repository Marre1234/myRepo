/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoshapes;

/**
 *
 * @author user01
 */
public class RightAngledTriangle {
    private double cathetus1;
    private double cathetus2;
    private double hypotenuse;

    public RightAngledTriangle(double cathetus1, double cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = Math.sqrt(cathetus1*cathetus1 + cathetus2*cathetus2);
    }

    public double getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }
    
    public double getCircumference() {
        return cathetus1 + cathetus2 + hypotenuse;
    }
    
    public double getArea() {
        return (cathetus1 * cathetus2)/2; 
    }
    
     @Override
    public String toString() {

        return " Cathetus a" + this.cathetus1 +
               "\nCathetus b" + this.cathetus2 +
                "\nHypotenuse" + this.hypotenuse +
             "\nCircumference " + getCircumference() + 
             "\nArea " + getArea() + 
             "\n";
    }
    
}
