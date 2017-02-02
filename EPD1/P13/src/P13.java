
import poo.io.IO;

public class P13 {

    public static void main(String[] args) {
        int opcion;
        opcion = menu();
        if (opcion == 1) {
            for (int i = 1; i < 10; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }
        } else if (opcion == 2) {
            for (int i = 1; i < 10; i++) {
                for (int j = i; j > 0; j--) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(j);
                    }
                }
                System.out.println("");
            }
        } else if (opcion == 3) {
            for (int i = 1; i < 10; i++) {
                for (int j = i; j > 0; j--) {
                    if (j%2 == 0) {
                        System.out.print(j);
                    }
                    else
                        System.out.print("*");
                }
                System.out.println("");
            }
        }
        else
            System.out.println("Opcion incorrecta");
    }

    public static int menu() {
        int opcion;
        System.out.println("1. Mostrar el triangulo original");
        System.out.println("2. Eliminar del triangulo los numeros pares");
        System.out.println("3. Eliminar del triangulo los numero impares");
        System.out.print("Introduzca una opcion: ");
        opcion = (int) IO.readNumber();
        return opcion;
    }
}
