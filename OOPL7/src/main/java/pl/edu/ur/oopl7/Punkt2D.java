/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Luki
 */
public class Punkt2D {
    
    int x = 0;
    int y = 0;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "Punkt x: " + this.x + ", y:" + this.y;
    }
    
    public Punkt2D getRandomPlace() {
        this.x = (int)(Math.random() * -21 + 10);
        this.y = (int)(Math.random() * -21 + 10);
        return this;
    }
}
