/*
 * Just copy the code.
 */
import java.io.*;
/**
 *
 * @author berto
 */
public class Teclado implements Entrada {
    
    private BufferedReader br;
    
    public Teclado(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    @Override
    public char leerChar() throws IOException {
        return br.readLine().charAt(0);
    }

    @Override
    public double leerDouble() throws IOException {
        return Double.parseDouble(br.readLine());
    }

    @Override
    public float leerFloat() throws IOException {
        return Float.parseFloat(br.readLine());
    }

    @Override
    public int leerInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    @Override
    public String leerLinea() throws IOException {
        return br.readLine();
    }

    @Override
    public long leerLong() throws IOException {
        return Long.parseLong(br.readLine());
    }

    @Override
    public boolean leerBoolean() throws IOException {
        return Boolean.parseBoolean(br.readLine().toLowerCase());
    }
    
    @Override
    protected void finalize() throws IOException {
        if (br != null) {
            br.close();
            br = null;
        }
    }
    
}
