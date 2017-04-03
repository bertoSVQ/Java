/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public interface IReproductorVideo extends IReproductorPortatil{
    // WMV, DIVX, MPG, DVD y JPG.
    boolean isReproduceWMV();
    boolean isReproduceDIVX();
    boolean isReproduceMPG();
    boolean isReproduceDVD();
    boolean isReproduceJPG();
    void setReproduceWMV(boolean b);
    void setReproduceDIVX(boolean b);
    void setReproduceMPG(boolean b);
    void setReproduceDVD(boolean b);
    void setReproduceJPG(boolean b);
    double getTamañoPantalla();
    void setTamañoPantalla(double d);
    boolean isTelevision();
    void setTelevision(boolean b);
}
