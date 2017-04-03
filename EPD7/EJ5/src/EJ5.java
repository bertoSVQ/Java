/*
 * Just copy the code.
 */
import java.io.*;
/**
 *
 * @author berto
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Entrada e = new Teclado();
        String s = e.leerLinea();
        int i = e.leerInt();
        float f = e.leerFloat();
        double d = e.leerDouble();
        char c = e.leerChar();
        boolean b = e.leerBoolean();
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
    }

}
