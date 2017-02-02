import java.text.DecimalFormat; //Import DecimalFormat Class
public class P2 {
    public static final double PI = 3.14; //Constant PI
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); //Instancia objeto decimalFormat
        double radio = Float.parseFloat(args[0]); //Get string args to float
        double diametro, area, circunferencia;
        diametro = 2*radio;
        area = PI*radio*radio;
        circunferencia = 2*PI*radio;
        System.out.println("Diametro: " + df.format(diametro)); //Format call from df object
        System.out.println("Area: " + df.format(area));
        System.out.println("Circunferencia: " + df.format(circunferencia));
    }
}