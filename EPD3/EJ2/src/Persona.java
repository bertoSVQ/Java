/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private float estatura;
    private float peso;
    private int estado;
    
    public Persona(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public float getEstatura(){
        return estatura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public int getEstado(){
        return estado;
    }
    
    private void setNombre(String n){
        this.nombre = n;
    }
    
    private void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    
    private void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }
    
    public void setEdad(int edad){
        if(edad >= 0 && edad <= 150 && this.edad < edad){
            this.edad = edad;
        }
    }
    
    public void setEstatura(float estatura){
        if(estatura >= 0 && estatura <= 3)
            this.estatura = estatura;
    }
    
    public void setPeso(float peso){
        if(peso >= 0 && peso <= 300)
            this.peso = peso;
    }
    // 1-Soltero 2-Casado 3-Separado 4-Divorciado 5-Viudo
    // 1-->2    3-->4,5     4-->2   5-->2
    public void setEstado(int estado){
        if((this.estado == 1 || this.estado == 4 || this.estado == 5) && estado == 2){
            this.estado = estado;
        }
        else if(this.estado == 3 && (estado == 4 || estado == 5)){
            this.estado = estado;
        }
        else if(this.estado == 0 && estado > 0 && estado < 6){
            this.estado = estado;
        }
    }
}