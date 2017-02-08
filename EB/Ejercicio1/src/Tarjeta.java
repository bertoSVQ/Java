import poo.io.*;
public class Tarjeta {
    private String id;
    private String dniTitular;
    private int pin;
    private float saldo;
    
    public Tarjeta (String id, String dniTitular, int pin, float saldo){
        this.id = id;
        this.dniTitular = dniTitular;
        this.pin = pin;
        this.saldo = saldo;
    }
    
    public void comprar(int importe, String dni){
        if(this.dniTitular == dni){
            this.saldo -= importe;
            System.out.println("Compra realizada, -" + importe + "€");
        }
    }
    
    public void retirarCajero(float importe, int pin){
        if(this.pin == pin){
            this.saldo -= importe;
            System.out.println("Retirado " + importe + "€");
        }
    }
    
    private boolean cargo(float importe){
        if(this.saldo - importe >= 0){
            this.saldo -= importe;
            return true;
        }
        else
            return false;
    }
    
    public String getId(){
        return id;
    }
    
    public String getDniTitular(){
        return dniTitular;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setPin(int pin){
        //deberá introducir el pin anterior
        int pinAux;
        System.out.print("Introduce el pin actual:");
        pinAux = (int) IO.readNumber();
        if (pinAux == this.pin) {
            this.pin = pin;
        }
        else
            System.out.println("Error PIN incorrecto.");
    }
    
}