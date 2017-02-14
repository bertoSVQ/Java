/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Numero {
    private double numero;
    
    public Numero(int numero){
        this.numero = (double) numero;
    }
    
    public Numero(long numero){
        this.numero = (double) numero;
    }
    
    public Numero(float numero){
        this.numero = (double) numero;
    }
    
    public Numero(double numero){
        this.numero = numero;
    }
    
    public int getInt(){
        return (int) numero;
    }
    
    public long getLong(){
        return (long) numero;
    }
    
    public float getFloat(){
        return (float) numero;
    }
    
    public double getDouble(){
        return numero;
    }
    
    public void setInt(int numero){
        this.numero = (double) numero;
    }
    
    public void setLong(long numero){
        this.numero = (double) numero;
    }
    
    public void setFloat(float numero){
        this.numero = (double) numero;
    }
    
    public void setDouble(double numero){
        this.numero = numero;
    }
    
    public void sumar(int numero){
        this.numero += (double) numero;
    }
    
    public void sumar(long numero){
        this.numero += (double) numero;
    }
    
    public void sumar(float numero){
        this.numero += (double) numero;
    }
    
    public void sumar(double numero){
        this.numero += numero;
    }
    
    public void restar(int numero){
        this.numero -= (double) numero;
    }
    
    public void restar(long numero){
        this.numero -= (double) numero;
    }
    
    public void restar(float numero){
        this.numero -= (double) numero;
    }
    
    public void restar(double numero){
        this.numero -= numero;
    }
    
    public void multiplicar(int numero){
        this.numero *= (double) numero;
    }
    
    public void multiplicar(long numero){
        this.numero *= (double) numero;
    }
    
    public void multiplicar(float numero){
        this.numero *= (double) numero;
    }
    
    public void multiplicar(double numero){
        this.numero *= numero;
    }
    
    public void dividir(int numero){
        this.numero /= (double) numero;
    }
    
    public void dividir(long numero){
        this.numero /= (double) numero;
    }
    
    public void dividir(float numero){
        this.numero /= (double) numero;
    }
    
    public void dividir(double numero){
        this.numero /= numero;
    }
}
