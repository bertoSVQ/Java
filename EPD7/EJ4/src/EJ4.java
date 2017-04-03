
import java.io.*;

/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String cadena;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte una cadena: ");
        cadena = br.readLine();
        br.close();
        cadena = EJ4.quitaEspacios(cadena);
        if(EJ4.invierteCadena(cadena).equals(cadena))
            System.out.println("Es palindromo");
        else 
            System.out.println("No es palindromo");
    }
    
    public static String invierteCadena(String cadena){
        String aux = "";
        for (int i = 0; i < cadena.length(); i++) {
            aux += cadena.charAt(cadena.length()-1-i);
        }
        return aux;
    }
    
    public static String quitaEspacios(String cadena){
        return cadena.toLowerCase().replace(" ", "");
    }

}