/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado();
        /*miCuadrado.x1 = 0;
        miCuadrado.y1 = 0;
        miCuadrado.x2 = 100;
        miCuadrado.y2 = 100;*/
        miCuadrado.Inicializar();
        miCuadrado.ModificarValores(0.0F, 0.0F, 2.0F, 2.0F, 2);
        System.out.println("El perímetro es: " + miCuadrado.CalcularPerimetro());
    }

}
