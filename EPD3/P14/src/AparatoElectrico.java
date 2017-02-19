/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class AparatoElectrico {
    static double consumoElectrico = 0;
    
    static double consumo(){
        return consumoElectrico;
    }
    
    private double potencia;
    private boolean encendido;
    
    AparatoElectrico(double potencia){
        this.potencia = potencia;
        encendido = false;
    }
    
    void enciende(){
        if( !encendido ){
            encendido = true;
            consumoElectrico += potencia;
        }
    }
    
    void apaga(){
        if( encendido ){
            encendido = false;
            consumoElectrico -= potencia;
        }
    }
}
