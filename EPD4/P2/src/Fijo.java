/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Fijo implements ITelefono{

    int numeroTelefono;
    
    public Fijo(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public int consultarTelefono() {
        return numeroTelefono;
    }

    @Override
    public void marcar(int numeroTelefono) {
        System.out.println("Fijo --> Marcado numero " + numeroTelefono);
    }

    @Override
    public void colgar() {
        System.out.println("Fijo --> Telefono colgado.");
    }

    @Override
    public void activarAltavoz() {
        System.out.println("Fijo --> Altavoz activado.");
    }

    @Override
    public void desactivarAltavoz() {
        System.out.println("Fijo --> Altavoz desactivado.");
    }

    @Override
    public void sonarTimbre() {
        System.out.println("Fijo --> Telefono sonando.");
    }
    
}
