/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Climatizador {
    private boolean encendido;
    private float temperaturaActual;
    private float temperaturaDeseada;
    
    public void activar(){
        if(temperaturaActual != 0 && temperaturaDeseada != 0){
            this.encendido = true;
            System.out.println("Climatizador ON");
            if(temperaturaDeseada < temperaturaActual){
                while(temperaturaDeseada < temperaturaActual){
                    enfriar();
                }
                desactivar();
                System.out.println("Temperatura alcanzada.");
            }
            else if(temperaturaDeseada > temperaturaActual){
                while(temperaturaDeseada > temperaturaActual){
                    calentar();
                }
                desactivar();
                System.out.println("Temperatura alcanzada.");
            }
            else{
                desactivar();
                System.out.println("Temperatura deseada igual a la actual.");
            }
        }
    }
    
    public void desactivar(){
        this.encendido = false;
        System.out.println("Climatizador OFF");
    }
    
    public boolean isEncendido(){
        return encendido;
    }
    
    public float getTemperaturaActual(){
        System.out.println("Temperatura actual: " + temperaturaActual + "º");
        return temperaturaActual;
    }
    
    public float getTemperaturaDeseada(){
        System.out.println("Temperatura deseada: " + temperaturaDeseada + "º");
        return temperaturaDeseada;
    }
    
    public void setTemperaduraActual(float temp){
        if(!isEncendido()){
            this.temperaturaActual = temp;
            System.out.println("Temperatura actual: " + temperaturaActual);
        }
    }
    
    public void setTemperaturaDeseada(float temp){
        if(!isEncendido()){
            this.temperaturaDeseada = temp;
            System.out.println("Temperatura deseada: " + temperaturaDeseada);
        }
    }
    
    private void enfriar(){
        this.temperaturaActual -= 0.5;
        System.out.println("-0.5º");
    }
    
    private void calentar(){
        this.temperaturaActual += 0.5;
        System.out.println("+0.5º");
    }
}
