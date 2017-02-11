
import java.text.DecimalFormat;

/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class MaquinaExpendedora {
    private int numeroSerie;
    private float creditoAcumuladoUsuario;
    private float creditoConsumidoUsuario;
    private float dineroMaquina;
    
    public MaquinaExpendedora(int numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    
    public MaquinaExpendedora(int numeroSerie, float creditoAcumuladoUsuario, float dineroMaquina){
        this(numeroSerie);
        this.creditoAcumuladoUsuario = creditoAcumuladoUsuario;
        this.dineroMaquina = dineroMaquina;
    }
    
    public float getCreditoAcumuladoUsuario(){
        return creditoAcumuladoUsuario;
    }
    
    public void insertarMoneda(float moneda){
        this.creditoAcumuladoUsuario += moneda;
        System.out.println("Máquina " + numeroSerie + " - Insertado " + (new DecimalFormat("0.00").format(moneda)) + "€");
    }
    
    public void pedirProducto(float costeProducto){
        if (creditoAcumuladoUsuario >= costeProducto) {
            // Lo puede comprar
            creditoAcumuladoUsuario -= costeProducto;
            creditoConsumidoUsuario += costeProducto;
            System.out.println("Máquina " + numeroSerie + " Comprado producto por valor de " + (new DecimalFormat("0.00").format(costeProducto)) + "€");
            dineroMaquina += costeProducto;
        }
        else
            // No lo puede comprar
            System.out.println("Máquina " + numeroSerie + " Crédito insuficiente.");
    }
    
    public void devolucion(){
        if(creditoAcumuladoUsuario > 0){
            // Le sobra pasta
            System.out.println("Máquina " + numeroSerie + 
            " devuelve " + (new DecimalFormat("0.00").format(creditoAcumuladoUsuario)) + "€");
        }
        else
            System.out.println("Máquina " + numeroSerie + " - No hay devolución.");
        creditoAcumuladoUsuario = 0;
        creditoConsumidoUsuario = 0; // Transacción terminada
        System.out.println("Máquina " + numeroSerie + " Insert coin.");
    }
}