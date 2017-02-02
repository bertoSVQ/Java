import poo.io.*;
public class P8 {
    public static void main(String[] args) {
        int year;
        System.out.print("Inserte un año: ");
        year = (int) IO.readNumber();
        if(year%4 == 0 && (year%100 != 0 || year%400 == 0))
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
    }
}
