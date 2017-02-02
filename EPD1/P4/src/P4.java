import poo.io.*;
public class P4 {
    public static void main(String[] args) {
        int temperaturaDeseada;
        Termostato t = new Termostato();
        System.out.print("Inserte la temperatura actual: ");
        t.setTemperatura((int) IO.readNumber());
        System.out.print("Inserte la temperatura deseada: ");
        temperaturaDeseada = (int) IO.readNumber();
        if(temperaturaDeseada < t.getTemperatura()){
            t.setCalefaccion(true);
            System.out.println("Calefaccion ON");
        }
        else if(temperaturaDeseada > t.getTemperatura()){
            t.setAcondicionado(true);
            System.out.println("Aire Acondicionado ON");
        }
        else{
            System.out.println("Temperatura OK" + "\nCalefaccion: " + 
                              t.isCalefaccion() + "\nAire Acondicionado: " + 
                              t.isAcondicionado());
        }
    }
}
