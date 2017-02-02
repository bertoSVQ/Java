
import poo.io.IO;

public class P14 {
    public static void main(String[] args) {
        int numero;
        boolean primo;
        System.out.print("Inserte un numero entero: ");
        numero = (int) IO.readNumber();
        primo = esPrimo(numero);
        if(primo)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
    public static boolean esPrimo(int num){
        int cont = 0;
        int aux = num;
        if(num == 1)
            return true;
        else{
            while(aux > 1){
                aux--;
                if(num % aux == 0){
                    cont++;
                }
            }
            if(cont > 1)
                return false;
            else
                return true;
        }
    }
}
