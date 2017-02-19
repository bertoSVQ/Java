/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Punto {
    private double x, y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        this (0, 0);
    }
    
    public double dameX(){
        return x;
    }
    
    public double dameY(){
        return y;
    }
    
    
}
