/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd1p1;
import  poo.io.*;
import java.text.DecimalFormat;
/**
 *
 * @author berto
 */
public class EPD1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n1, n2; 
        int opcion;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Inserte un numero:");
        n1 = (float) IO.readNumber();
        System.out.println("Inserte otro numero:");
        n2 = (float) IO.readNumber();
        opcion = menu();
        while( opcion < 1 || opcion > 4){
            System.out.println("Opcion incorrecta.");
            opcion = menu();
        }
        if(opcion == 1)
            System.out.println(n1+n2);
        if(opcion == 2)
            System.out.println(n1-n2);
        if(opcion == 3)
            System.out.println(n1*n2);
        if(opcion == 4)
            System.out.println(df.format(n1/n2));
    }
    public static int menu(){
        int opcion;
        System.out.println("+-----------------------------+");
        System.out.println("| 1. Sumar los numeros.       |");
        System.out.println("| 2. Restar los numeros.      |");
        System.out.println("| 3. Multiplicar los numeros. |");
        System.out.println("| 4. Dividir los numeros.     |");
        System.out.println("+-----------------------------+");
        System.out.println("Inserta una opcion:");
        opcion = (int) IO.readNumber();
        return opcion;
    }   
}