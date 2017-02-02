
import java.util.Arrays;

public class P10 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            if ((i+1)%2 != 0 && (i+1)%3 != 0) {
                numeros[i] = i+1;
                if (numeros[i] != 0) {
                System.out.print(numeros[i] + " ");
                }
            }
        }
    }
    
}
