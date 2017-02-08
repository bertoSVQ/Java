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
        Punto p = new Punto();
        p.imprime();
        p.setX(1);p.setY(1);
        p.imprime();
        Punto p2 = new Punto();
        p2.setX(3.5);p2.setY(4.6);
        p2.imprime();
        System.out.println(p.distancia(p2));
        p.mover(p2);
        System.out.println(p.distancia(p2));
    }
}
