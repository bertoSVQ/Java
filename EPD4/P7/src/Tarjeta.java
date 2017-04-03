/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Tarjeta {
    private String id;
    private String dniTitular;
    private int pin;
    private float saldo;
    
    public Tarjeta(String id, String dniTitular, int pin, float saldo){
        this.id = id;
        this.dniTitular = dniTitular;
        this.pin = pin;
        this.saldo = saldo;
    }
    
    public void comprar(float importe, String dni){
        
    }
}
