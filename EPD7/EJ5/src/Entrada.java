
import java.io.IOException;

public interface Entrada {
    char leerChar() throws IOException;
    double leerDouble() throws IOException;
    float leerFloat() throws IOException;
    int leerInt() throws IOException;
    String leerLinea() throws IOException;
    long leerLong() throws IOException;
    boolean leerBoolean() throws IOException;
}
