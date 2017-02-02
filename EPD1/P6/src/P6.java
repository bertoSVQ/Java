import poo.io.*;
public class P6 {

    public static void main(String[] args) {
        int key = 3572, userKey;
        do{
            System.out.print("Inserte la clave: ");
            userKey = (int) IO.readNumber();
        }
        while(key != userKey);
        System.out.println("Clave correcta.");
    }
    
}
