/*
 * Just copy the code.
 */

/**
 * Clase sencilla para envolver puntos de dos coordenadas como objetos.
 * @author berto
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void borrar(){
        this.x = 0;
        this.y = 0;
    }
    
    public void mover(Punto p){
        this.x = p.getX();
        this.y = p.getY();
    }
    /**
     * Distancia euclídea entre dos puntos.
     * @param p Referencia de tipo Punto para realizar distancia
     *          El otro punto es el que invoca al método.
     * @return Devuelve la raiz cuadrada de la suma de las diferencias
     *          de las componentes al cuadrado.
     */
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(this.x - p.getX(),2) + 
                         Math.pow(this.y - p.getY(), 2));
    }
    
    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }
}