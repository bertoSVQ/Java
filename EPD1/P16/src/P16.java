import poo.io.IO;
public class P16 {
    public static void main(String[] args) {
        int numero;
        System.out.print("Inserte un numero entero: ");
        numero = (int) IO.readNumber();
        for (int i = 1; i < numero; i++) {
            if(numero % i == 0)
                System.out.println(i);
        }
    }
}
