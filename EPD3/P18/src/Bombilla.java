/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */

enum Estado { ON, OFF};

public class Bombilla {
    //Parte estática que representa el estado general
    private static Estado interruptorGeneral = Estado.OFF;
    
    public static void pulsaInterruptorGeneral(){
        if(interruptorGeneral == Estado.ON){
            interruptorGeneral = Estado.OFF;
        }
        else{
            interruptorGeneral = Estado.ON;
        }
    }
    
    //Atributos y métodos relativos a cada bombilla
    private Estado interruptor;
    
    public Bombilla(){
        interruptor = Estado.OFF;
    }
    
    public boolean luce(){
        return (interruptor == Estado.ON) && (interruptorGeneral == Estado.ON);
    }
    
    public void pulsaInterruptor(){
        if(interruptor == Estado.ON){
            interruptor = Estado.OFF;
        }
        else{
            interruptor = Estado.ON;
        }
    }
}
