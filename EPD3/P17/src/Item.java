/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Item {
    private static int contador = 0;
    
    private int Id;
    private String nombre;
    
    Item(String nombre){
        this.nombre = nombre;
        
        Id = ++contador; 
    }
    
    int Id(){
        return Id;
    }
    
    String nombre(){
        return nombre;
    }
}
