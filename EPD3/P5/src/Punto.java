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
    
    public double distancia(Punto p){
        double diffX = x - p.x;
        double diffY = y - p.y;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
}
