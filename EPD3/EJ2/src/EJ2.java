/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Alberto", "Díaz", "Reina");
        // p.nombre; error de compilación
        p.setEdad(-2);
        System.out.println(p.getEdad());
        p.setEdad(27);
        System.out.println(p.getEdad());
        p.setEstado(3);
        p.setEstado(0);
        System.out.println(p.getEstado());
    }

}
