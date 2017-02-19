/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla a1 = new Bombilla();
        Bombilla a2 = new Bombilla();
        Bombilla a3 = new Bombilla();
        
        a1.pulsaInterruptor();
        System.out.println("a1 " + (a1.luce() ? "SI" : "NO") + " luce.");
        
        Bombilla.pulsaInterruptorGeneral();
        System.out.println("a1 " + (a1.luce() ? "SI" : "NO") + " luce.");
    }

}
