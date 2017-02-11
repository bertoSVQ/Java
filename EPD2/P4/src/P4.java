/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaquinaExpendedora m = new MaquinaExpendedora(123);
        m.insertarMoneda(1.20F);
        m.pedirProducto(1);
        m.devolucion();
    }

}
