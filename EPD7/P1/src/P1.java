/*
 * Just copy the code.
 */
import java.io.*;
/**
 *
 * @author berto
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte una frase: ");
        String frase = br.readLine();
        P1.menu();
        String opcion = br.readLine();
        br.close();
        switch(opcion){
            case "1":
                System.out.println(frase.toLowerCase());
                break;
            case "2":
                System.out.println(frase.toUpperCase());
                break;
            case "3":
                System.out.println(frase.substring(0, 1).toUpperCase() + frase.substring(1).toLowerCase());
                break;
            case "4":
                System.out.println(P1.toTitleCase(frase.toLowerCase()));
                break;
            case "5":
                System.out.println(P1.tipoInverso(frase));
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }
    
    public static void menu(){
        System.out.println("1. Todo minúsculas");
        System.out.println("2. Todo mayúsculas");
        System.out.println("3. Tipo oración");
        System.out.println("4. Tipo título");
        System.out.println("5. Tipo inverso");
        System.out.print("Inserte una opción: ");    
    }
    
    public static String toTitleCase(String frase){
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;
        for (char c : frase.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;   
            } else if(nextTitleCase){
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        return titleCase.toString();
    }
    
    public static String tipoInverso(String frase){
        String inverso = "";
        String fraseTitulo = toTitleCase(frase.toLowerCase());
        for (char c : fraseTitulo.toCharArray()) {
            inverso += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        return inverso;
    }

}   
