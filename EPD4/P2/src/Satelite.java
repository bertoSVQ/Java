/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Satelite implements ITelefono{
    
    int numeroTelefono;
    
    public Satelite(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public int consultarTelefono() {
        return numeroTelefono;
    }

    @Override
    public void marcar(int numeroTelefono) {
        System.out.println("Satelite --> Marcado " + numeroTelefono);
    }

    @Override
    public void colgar() {
        System.out.println("Satelite --> Colgado.");
    }

    @Override
    public void activarAltavoz() {
        System.out.println("Satelite --> Altavoz activado.");
    }

    @Override
    public void desactivarAltavoz() {
        System.out.println("Satelite --> Altavoz desactivado");
    }

    @Override
    public void sonarTimbre() {
        System.out.println("Satelite --> Telefono sonando.");
    }
    
}
