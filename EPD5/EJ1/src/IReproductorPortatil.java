/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public interface IReproductorPortatil {
    
    enum Almacenamiento{
        CD, DVD, MEMORIAFLASH, MINIDISK;
    }
    enum Pantalla{
        NINGUNA, TEXTO, MONOCROMO, COLOR;
    }
    enum Bateria{
        PILAS, LI_ION;
    }
    
    String getMarca();
    String getModelo();
    void setMarca(String marca);
    void setModelo(String modelo);
    
    boolean isPlayingSound();
    boolean isPlayingVideo();
    Almacenamiento getTipoAlmacenamiento();
    void setTipoAlmacenamiento(Almacenamiento a);
    int getCapacidadDeAlmacenamiento();
    void setCapacidadDeAlmacenamiento(int a);
    Pantalla getPantalla();
    void setPantalla(Pantalla p);
    Bateria getTipoBateria();
    void setTipoBateria(Bateria b);
    int getAutonomia();
    void setAutonomia(int a);
    double getPeso();
    void setPeso(double p);
    double getAncho();
    double getAlto();
    double getGrosor();
    void setAncho(double a);
    void setAlto(double alto);
    void setGrosor(double g);
    
}
