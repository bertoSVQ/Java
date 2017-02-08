public class Ejercicio1 {
    public static void main(String[] args) {
        Tarjeta t = new Tarjeta("1A", "49032229R", 12345, 1050.5F);
        System.out.println("La tarjeta " + t.getId() + " tiene " + t.getSaldo() + "€");
        
    }
    
}
