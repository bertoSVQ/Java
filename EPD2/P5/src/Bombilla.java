/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Bombilla {
    private boolean encendida;
    
    public void encender(){
        encendida = true;
    }
    
    public void apagar(){
        encendida = false;
    }
    
    public void cambiar(){
        if(encendida)
            encendida = false;
        else
            encendida = true;
    }
    
    public String mostrarEstado(){
        if (encendida) {
            return "*";
        }
        else
            return "·";
    }
    
}
