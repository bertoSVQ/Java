/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public interface IReproductorAudio extends IReproductorPortatil{
    boolean isReproduceAudioCDs();
    boolean isReproduceMP3();
    boolean isReproduceWMA();
    boolean isReproduceVorbis();    
    void setReproduceAudioCDs(boolean b);
    void setReproduceMP3(boolean b);
    void setReproduceWMA(boolean b);
    void setReproduceVorbis(boolean b);
    boolean isAccesoPorCarpetas();
    void setAccesoPorCarpetas(boolean b);
    boolean isRadio();
    void setRadio(boolean b);
    boolean isGrabacionVoz();
    void setGrabacionVoz(boolean b);
}
