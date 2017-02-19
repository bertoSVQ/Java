/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico (100);
        AparatoElectrico radiador = new AparatoElectrico (2000);
        AparatoElectrico plancha = new AparatoElectrico (1200);
        
        System.out.println("El consumo eléctrico es " + 
                            AparatoElectrico.consumo());
        bombilla.enciende();
        plancha.enciende();
        System.out.println("El consumo eléctrico es " + 
                            AparatoElectrico.consumo());
        plancha.apaga();
        radiador.enciende();
        System.out.println("El consumo eléctrico es " + 
                            AparatoElectrico.consumo());
        
    }

}
