/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ReproductorPortatil r = new ReproductorPortatil("Sony", "Vaio", IReproductorPortatil.Almacenamiento.DVD);
        System.out.println(r.toString());
        
        ReproductorDeAudio ra = new ReproductorDeAudio("JBL", "MiniCadena", IReproductorPortatil.Almacenamiento.CD, true, true, true, false);
        System.out.println(ra.toString());
        
        ReproductorVideo rv = new ReproductorVideo("LG", "Home Cinema 7.1", IReproductorPortatil.Almacenamiento.DVD, 11.5F);
        System.out.println(rv.toString());
        
        ReproductorMultimedia rm = new ReproductorMultimedia("Huawei", "Multimedia Player 5", IReproductorPortatil.Almacenamiento.MEMORIAFLASH, false, true, true, false, 8.5F);
        System.out.println(rm.toString());
    }

}
