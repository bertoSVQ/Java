/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Revista implements IPublicacion, IConsultable{
    private int codigo;
    private String autor;
    private String titulo;
    private int añoPublicacion;
    private boolean prestado;
    private boolean consultando;
    
    public Revista(int codigo, String autor, String titulo, int añoPublicacion){
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        prestado = false;
    }
    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    @Override
    public boolean isPrestado() {
        return this.prestado;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setAñoPublicacion(int año) {
        this.añoPublicacion = año;
    }

    @Override
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void retirar() {
        this.consultando = true;
    }

    @Override
    public void devolver() {
        this.consultando = false;
    }

    @Override
    public boolean estaConsultando() {
        return this.consultando;
    }
}
