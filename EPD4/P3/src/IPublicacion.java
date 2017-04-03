/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public interface IPublicacion {
    int getCodigo();
    String getAutor();
    String getTitulo();
    int getAñoPublicacion();
    boolean isPrestado();
    void setCodigo(int codigo);
    void setAutor(String autor);
    void setTitulo(String titulo);
    void setAñoPublicacion(int año);
    void setPrestado(boolean prestado);
}
