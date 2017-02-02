import poo.io.*;
public class P7 {

    public static void main(String[] args) {
        int numero;
        System.out.print("Inserte un numero entero: ");
        numero = (int) IO.readNumber();
        System.out.println("Su factorial es: " + factorial(numero));
    }

    private static int factorial(int numero) {
        if(numero == 1 || numero == 0){
            return 1;
        }
        else{
            return factorial(numero-1) * numero;
        }
    }
    
}
