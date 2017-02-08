/**
 *
 * @author berto
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        s.imprimir();
        s.setColor(4);
        s.imprimir();
        s.setColor(2);
        s.imprimir();
        s.setParpadeando(true);
        System.out.println(s.isParpadeando());
        s.setColor(1);
        s.imprimir();
        s.setParpadeando(true);
        s.imprimir();
        for (int i = 0; i < 5; i++) {
            s.cambia();
        }
        s.imprimir();
        Semaforo s2 = new Semaforo();
        s2 = s;
        s2.imprimir();
    }
    
}
