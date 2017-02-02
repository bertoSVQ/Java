import java.text.DecimalFormat;
public class P3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        if( args.length == 1){
            System.out.println("Cuadrado...");
            double lado = Float.parseFloat(args[0]);
            double area = 2*lado;
            double perimetro = 4*lado;
            System.out.println("Area: " + df.format(area) + " u^2");
            System.out.println("Perimetro: " + df.format(perimetro) + " u");
        }
        else{
            System.out.println("Triangulo...");
            double base = Float.parseFloat(args[0]);
            double altura = Float.parseFloat(args[1]);
            double area = (base*altura)/2;
            double catetos = base*base + altura*altura;
            double hipotenusa = Math.sqrt(catetos);
            double perimetro = base + altura + hipotenusa;
            System.out.println("Area: " + df.format(area));
            System.out.println("Perimetro: " + df.format(perimetro));
        }
    }
}
