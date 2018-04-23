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
public class Punkt3D extends Punkt2D{
    
    int z = 0;

    public Punkt3D() {
        super(0, 0);
        this.z = 0;
    }
    
    @Override
    public String toString() {
        return "Punkt x: " + this.x + ", y:" + this.y + " z: " +this.z;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public Punkt3D getRandomPlace() {
        this.x = (int)(Math.random() * -21 + 10);
        this.y = (int)(Math.random() * -21 + 10);
        this.z = (int)(Math.random() * -21 + 10);
        return this;
    }
}
