/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Movil implements ITelefono{

    int numeroTelefono;
    
    public Movil(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public int consultarTelefono() {
        return numeroTelefono;
    }

    @Override
    public void marcar(int numeroTelefono) {
        System.out.println("Movil --> Marcado numero " + numeroTelefono);
    }

    @Override
    public void colgar() {
        System.out.println("Movil --> Telefono colgado.");
    }

    @Override
    public void activarAltavoz() {
        System.out.println("Movil --> Altavoz activado.");
    }

    @Override
    public void desactivarAltavoz() {
        System.out.println("Movil --> Altavoz desactivado.");
    }

    @Override
    public void sonarTimbre() {
        System.out.println("Movil --> Telefono sonando.");
    }
    
}
