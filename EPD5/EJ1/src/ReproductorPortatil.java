/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class ReproductorPortatil implements IReproductorPortatil{
    private String Marca;
    private String Modelo;
    private boolean reproduceSonido;
    private boolean reproduceVideo;
    private int capacidadDeAlmacenamiento;
    private int autonomia;
    private double peso;
    private double ancho;
    private double alto;
    private double grosor;
    private Almacenamiento almacenamiento;
    private Pantalla pantalla;
    private Bateria bateria;
    
    public ReproductorPortatil(String marca, String modelo, Almacenamiento a){
        this.Marca = marca;
        this.Modelo = modelo;
        this.almacenamiento = a;
    }
    
    @Override
    public String getMarca() {
        return this.Marca;
    }

    @Override
    public String getModelo() {
        return this.Modelo;
    }

    @Override
    public void setMarca(String marca) {
        this.Marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    @Override
    public boolean isPlayingSound() {
        return this.reproduceSonido;
    }

    @Override
    public boolean isPlayingVideo() {
        return this.reproduceVideo;
    }

    @Override
    public Almacenamiento getTipoAlmacenamiento() {
        return this.almacenamiento;
    }

    @Override
    public void setTipoAlmacenamiento(Almacenamiento a) {
        this.almacenamiento = a;
    }

    @Override
    public int getCapacidadDeAlmacenamiento() {
        return this.capacidadDeAlmacenamiento;
    }

    @Override
    public void setCapacidadDeAlmacenamiento(int a) {
        this.capacidadDeAlmacenamiento = a;
    }

    @Override
    public Pantalla getPantalla() {
        return this.pantalla;
    }

    @Override
    public void setPantalla(Pantalla p) {
        this.pantalla = p;
    }

    @Override
    public Bateria getTipoBateria() {
        return this.bateria;
    }

    @Override
    public void setTipoBateria(Bateria b) {
        this.bateria = b;
    }

    @Override
    public int getAutonomia() {
        return this.autonomia;
    }

    @Override
    public void setAutonomia(int a) {
        this.autonomia = a;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }
    
    @Override
    public void setPeso(double p) {
        this.peso = p;
    }

    @Override
    public void setAncho(double a) {
        this.ancho = a;
    }

    @Override
    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void setGrosor(double g) {
        this.grosor = g;
    }

    @Override
    public double getAncho() {
        return this.ancho;
    }

    @Override
    public double getAlto() {
        return this.alto;
    }

    @Override
    public double getGrosor() {
        return this.grosor;
    }

    @Override
    public String toString() {
        return "Reproductor Portatil:"+ 
                "\n\tMarca => " + this.Marca +
                "\n\tModelo => " + Modelo + 
                "\n\treproduceSonido => " + reproduceSonido + 
                "\n\treproduceVideo => " + reproduceVideo + 
                "\n\tcapacidadDeAlmacenamiento => " + capacidadDeAlmacenamiento +
                "\n\tautonomia => " + autonomia + 
                "\n\tpeso => " + peso + 
                "\n\tancho => " + ancho + 
                "\n\talto => " + alto + 
                "\n\tgrosor => " + grosor + 
                "\n\talmacenamiento => " + almacenamiento + 
                "\n\tpantalla => " + pantalla + 
                "\n\tbateria => " + bateria;
    }
}
