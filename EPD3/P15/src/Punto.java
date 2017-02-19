/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Punto {
    
    public static final Punto ORIGEN = new Punto(0,0);
    
    private double x, y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
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
