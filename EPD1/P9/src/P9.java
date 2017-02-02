
import java.util.Arrays;
import poo.io.*;


public class P9 {

    public static void main(String[] args) {
        double[] numeros = new double[100];
        int i = -1;
        double media = 0;
        do{
            i++;
            System.out.print("Inserta un numero: ");
            numeros[i] = (double) IO.readNumber();
        }
        while(numeros[i] != 0.0);
        for (int j = 0; j < i; j++) {
            media += numeros[j];
        }
        media = media/i;
        System.out.println("Media = " + media);
        double varianza = 0.0;
        for (int j = 0; j < i; j++) {
            double desv;
            desv = Math.pow(numeros[j]-media, 2f);
            varianza += desv;
        }
        varianza /= i;
        System.out.println("Varianza = " + varianza);
    }
}
