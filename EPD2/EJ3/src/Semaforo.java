
public class Semaforo {
    private int color; // 0 = rojo. 1 = ambar. 2 = verde.
    private boolean parpadeando;
    
    public int getColor(){
        return color;
    }
    
    public boolean isParpadeando(){
        return parpadeando;
    }
    
    public void setColor(int color){
        if(color >= 0 && color <= 2)
            this.color = color;
    }
    
    public void setParpadeando(boolean parpadeo){
        if(this.color == 1)
            this.parpadeando = parpadeo;
    }
    
    public String cadenaColor(){
        if(this.color == 0)
            return "ROJO";
        else if (this.color == 1)
            return "AMBAR";
        else
            return "VERDE";
    }
    
    public void imprimir(){
        if(this.color == 1 && this.parpadeando)
            System.out.println("El semáforo esta en AMBAR parpadeando." );
        else
            System.out.println("El semáforo está en " + cadenaColor());
    }
    
    public void cambia(){
        if(getColor() == 0){
            setColor(2);
        }
        else if(getColor() == 1){
            if(isParpadeando()){
                setParpadeando(false);
            }
            else
                setColor(0);
        }
        else{
            setColor(1);
            setParpadeando(true);
        }
    }
}
