public class Termostato {
    private int temperatura;
    private boolean calefaccion;
    private boolean acondicionado;

    public Termostato() {
        
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public boolean isAcondicionado() {
        return acondicionado;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public void setAcondicionado(boolean acondicionado) {
        this.acondicionado = acondicionado;
    }
    
}
