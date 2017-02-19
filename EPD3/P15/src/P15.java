/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto(3,4);
        Punto p2 = new Punto(0,4);
        Punto p3 =new Punto(2,-1);
        
        System.out.println("Distancia de p1 al ORIGEN = " + p1.distancia(Punto.ORIGEN));
        System.out.println("Distancia de p2 al ORIGEN = " + p2.distancia(Punto.ORIGEN));
        System.out.println("Distancia de p3 al ORIGEN = " + p3.distancia(Punto.ORIGEN));
    }

}
