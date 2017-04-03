/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ITelefono fijo = new Fijo(955123456);
        ITelefono movil = new Movil(666123456);
        ITelefono satelite = new Satelite(000123456);
        fijo.marcar(954789456);
        fijo.activarAltavoz();
        fijo.desactivarAltavoz();
        System.out.println("Movil creado con numero " + movil.consultarTelefono());
        movil.sonarTimbre();
        satelite.desactivarAltavoz();
        
    }

}
