
import poo.io.*;

public class P5 {

    public static void main(String[] args) {
        int day, month, year;
        System.out.print("Inserta un dia: ");
        day = (int) IO.readNumber();
        System.out.print("Inserta un mes: ");
        month = (int) IO.readNumber();
        System.out.print("Inserta un año: ");
        year = (int) IO.readNumber();
        String monthString;
        switch (month) {
            case 1:
                monthString = "Enero";
                break;
            case 2:
                monthString = "Febrero";
                break;
            case 3:
                monthString = "Marzo";
                break;
            case 4:
                monthString = "Abril";
                break;
            case 5:
                monthString = "Mayo";
                break;
            case 6:
                monthString = "Junio";
                break;
            case 7:
                monthString = "Julio";
                break;
            case 8:
                monthString = "Agosto";
                break;
            case 9:
                monthString = "Septiembre";
                break;
            case 10:
                monthString = "Octubre";
                break;
            case 11:
                monthString = "Noviembre";
                break;
            case 12:
                monthString = "Deciembre";
                break;
            default:
                monthString = "Mes Erróneo";
                break;
        }
        System.out.println(day + " de " + monthString + " de " + year);
    }

}
