/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item("uno");
        Item i2 = new Item("dos");
        Item i3 = new Item("tres");
        
        System.out.println("Item " + i1.nombre() + " id " + i1.Id());
        System.out.println("Item " + i2.nombre() + " id " + i2.Id());
        System.out.println("Item " + i3.nombre() + " id " + i3.Id());
    }

}
