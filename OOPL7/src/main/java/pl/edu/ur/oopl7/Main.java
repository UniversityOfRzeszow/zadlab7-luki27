package pl.edu.ur.oopl7;

/**
 *
 * @author Luki
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("ZADANIE 2");
        Punkt2D[] array2D = new Punkt2D[1000];
        Punkt3D[] array3D = new Punkt3D[1000];
        for(int i = 0; i<1000; i++) {
            array2D[i] = new Punkt2D().getRandomPlace();
        }
        for(int i = 0; i<1000; i++) {
            array3D[i] = new Punkt3D().getRandomPlace();
        }
        int a=0;
        for(int i = 0; i<1000; i++) {
            if(array2D[i].x == array3D[i].x && array2D[i].y == array3D[i].y) {
                System.out.println(i+" Ten sam punkt x: " + array2D[i].x + ", y: " + array2D[i].y);
                a++;
            }
        }
        if (a==0) {
                System.out.println("nie ma punktow wspolnych"); 
           }
    }
    
}
