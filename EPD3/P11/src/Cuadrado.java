/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Cuadrado {
    private double x1, y1, x2, y2;
    private int color;
    public static final double PI = 3.14159;
    private static int numero;
    //final int identificador;
    //coordenadas 2D de los puntos en la esquina superior
    //izquierda y esquina inferior derecha
    
    public double CalcularPerimetro(){
        double diagonal = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return 4*diagonal/Math.sqrt(2);
    }
    
    public double CalcularArea(){
        double cuadrado_diagonal = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        return 0.5*cuadrado_diagonal;
    }
    
    public double CalcularDiagonal(){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    
    public float VerValor_x1(){
        return (float) x1;
    }
    
    public float VerValor_y1(){
        return (float) y1;
    }
    
    public void VerValores(){
        System.out.println("Atributos: x1=" + x1 + " y1=" + y1 + " x2=" + x2 + " y2=" + y2 + " color=" + color);
    }
    
    public void ModificarValores(float x1_p, float y1_p, float x2_p, float y2_p, int color_p){
        x1 = x1_p;
        y1 = y1_p;
        x2 = x1_p;
        y2 = y2_p;
        color = color_p;
    //el sufijo '_p' se ha usado para denotaar parámetros de entrada
    //al método
    }
    
    public void Inicializar(){
        x1=0;y1=0;
        x2=0;y2=0;
        color=0;
    }
}
