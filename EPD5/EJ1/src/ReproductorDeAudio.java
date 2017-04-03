/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class ReproductorDeAudio extends ReproductorPortatil implements IReproductorAudio{

    private boolean reproduceAudioCDs;
    private boolean reproduceMP3;
    private boolean reprodueWMA;
    private boolean reproduceVorbis;
    private boolean accesoPorCarpetas;
    private boolean radio;
    private boolean grabacionDeVoz;
    
    public ReproductorDeAudio(String marca, String modelo, Almacenamiento a, boolean cd, boolean mp3, boolean wma, boolean vorbis) {
        super(marca, modelo, a);
        this.reproduceAudioCDs = cd;
        this.reproduceMP3 = mp3;
        this.reprodueWMA = wma;
        this.reproduceVorbis = vorbis;
    }

    @Override
    public boolean isReproduceAudioCDs() {
        return this.reproduceAudioCDs;
    }

    @Override
    public boolean isReproduceMP3() {
        return this.reproduceMP3;
    }

    @Override
    public boolean isReproduceWMA() {
        return this.reprodueWMA;
    }

    @Override
    public boolean isReproduceVorbis() {
        return this.reproduceVorbis;
    }
    
    @Override
    public void setReproduceAudioCDs(boolean b) {
        if(super.getTipoAlmacenamiento() == Almacenamiento.CD)
            this.reproduceAudioCDs = b;
    }

    @Override
    public void setReproduceMP3(boolean b) {
        this.reproduceMP3 = b;
    }

    @Override
    public void setReproduceWMA(boolean b) {
        this.reprodueWMA = b;
    }

    @Override
    public void setReproduceVorbis(boolean b) {
        this.reproduceVorbis = b;
    }

    @Override
    public boolean isAccesoPorCarpetas() {
        return this.accesoPorCarpetas;
    }

    @Override
    public void setAccesoPorCarpetas(boolean b) {
        this.accesoPorCarpetas = b;
    }

    @Override
    public boolean isRadio() {
        return this.radio;
    }

    @Override
    public void setRadio(boolean b) {
        this.radio = b;
    }

    @Override
    public boolean isGrabacionVoz() {
        return this.grabacionDeVoz;
    }

    @Override
    public void setGrabacionVoz(boolean b) {
        this.grabacionDeVoz = b;
    }
    
    public String toString(){
        return "Reproductor De Audio:"+ 
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
                "\n\talmacenamiento => " + this.getCapacidadDeAlmacenamiento() + 
                "\n\tpantalla => " + this.getPantalla() + 
                "\n\tbateria => " + this.getTipoBateria() +
                "\n\tAcceso por carpetas => " + this.isAccesoPorCarpetas() +
                "\n\tGrabacion de voz => " + this.isGrabacionVoz() +
                "\n\tRadio => " + this.isRadio() +
                "\n\tReproduce Audio-CD => " + this.isReproduceAudioCDs() +
                "\n\tReproduce MP3 => " + this.isReproduceMP3() + 
                "\n\tReproduce WMA => " + this.isReproduceWMA() +
                "\n\tReproduce Vorbis => " + this.isReproduceVorbis();
        
    }
}
