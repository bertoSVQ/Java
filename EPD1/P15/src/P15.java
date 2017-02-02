// http://www.lawebdelprogramador.com
public class P15 {
    public static void main(String[] args) {
        // parte superior del rombo
        int max = 9, i,j,k;
        for (i = 1; i <= max; i = i + 2) {
            // Añadimos los espacios necesarios delante de cada linea
            for (k = max + 1; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            // Mostramos loas asteriscos
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //parte inferior del rombo
        for (i = max; i >= 1; i = i - 2) {
            // Añadimos los espacios necesarios delante de cada linea
            for (k = i; k <= max + 2; k = k + 2) {
                System.out.print(" ");
            }
            // Mostramos loas asteriscos
            for (j = i - 2; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}