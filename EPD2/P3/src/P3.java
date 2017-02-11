/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Climatizador c = new Climatizador();
        c.setTemperaduraActual(18);
        c.setTemperaturaDeseada(29);
        c.activar();
        c.getTemperaturaActual();
        
    }

}
