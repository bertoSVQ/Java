/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class ReproductorVideo extends ReproductorPortatil implements IReproductorVideo{

    private boolean reproduceWMV;
    private boolean reproduceDIVX;
    private boolean reproduceMPG;
    private boolean reproduceDVD;
    private boolean reproduceJPG;
    private double tamañoPantalla;
    private boolean television;
    
    public ReproductorVideo(String marca, String modelo, Almacenamiento a, double t) {
        super(marca, modelo, a);
        this.tamañoPantalla = t;
    }

    @Override
    public boolean isReproduceWMV() {
        return this.reproduceWMV;
    }

    @Override
    public boolean isReproduceDIVX() {
        return this.reproduceDIVX;
    }

    @Override
    public boolean isReproduceMPG() {
        return this.reproduceMPG;
    }

    @Override
    public boolean isReproduceDVD() {
        return this.reproduceDVD;
    }

    @Override
    public boolean isReproduceJPG() {
        return this.reproduceJPG;
    }

    @Override
    public void setReproduceWMV(boolean b) {
        this.reproduceWMV = b;
    }

    @Override
    public void setReproduceDIVX(boolean b) {
        this.reproduceDIVX = b;
    }

    @Override
    public void setReproduceMPG(boolean b) {
        this.reproduceMPG = b;
    }

    @Override
    public void setReproduceDVD(boolean b) {
        this.reproduceDVD = b;
    }

    @Override
    public void setReproduceJPG(boolean b) {
        this.reproduceJPG = b;
    }

    @Override
    public double getTamañoPantalla() {
        return this.tamañoPantalla;
    }

    @Override
    public void setTamañoPantalla(double d) {
        this.tamañoPantalla = d;
    }

    @Override
    public boolean isTelevision() {
        return this.television;
    }

    @Override
    public void setTelevision(boolean b) {
        this.television = b;
    }
    
    @Override
    public String toString(){
        return "Reproductor Video:"+ 
                "\n\tMarca => " + this.getMarca() +
                "\n\tModelo => " + this.getModelo() + 
                "\n\treproduceSonido => " + this.isPlayingSound() + 
                "\n\treproduceVideo => " + this.isPlayingVideo() + 
                "\n\tcapacidadDeAlmacenamiento => " + this.getCapacidadDeAlmacenamiento() +
                "\n\tautonomia => " + this.getAutonomia() + 
                "\n\tpeso => " + this.getPeso() + 
                "\n\tancho => " + this.getAncho() + 
                "\n\talto => " + this.getAlto() + 
                "\n\tgrosor => " + this.getGrosor() + 
                "\n\talmacenamiento => " + this.getTipoAlmacenamiento() + 
                "\n\tpantalla => " + this.getPantalla() + 
                "\n\tbateria => " + this.getTipoBateria()+
                "\n\ttamaño de la pantalla => " + this.getTamañoPantalla() +
                "\n\ttelevision => " + this.isTelevision();
    }
    
}
