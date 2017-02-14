/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero n = new Numero(1.5F);
        System.out.println(n.getInt());
        n.sumar(2);
        System.out.println(n.getDouble());
        n.multiplicar(12345678987654321L);
        System.out.println(n.getDouble());
        n.dividir(12345678987654321L);
        System.out.println(n.getDouble());
        n.setInt(10);
        n.dividir(6);
        System.out.println(n.getFloat());
    }

}
