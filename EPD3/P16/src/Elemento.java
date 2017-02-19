/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Elemento {
    private String nombre;
    
    Elemento (String nombre){
        this.nombre = nombre;
        
        numElementos++;
    }
    
    static private int numElementos = 0;
    
    static int numeroDeElementos(){
        return numElementos;
    }
    
}
