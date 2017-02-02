
import poo.io.IO;


public class P11 {
    public static final String PASS = "Admin";
    public static void main(String[] args) {
        String userPass;
        boolean pass = false;
        int cont = 0;
        while(!pass && cont < 3){
            System.out.print("Insert password: ");
            userPass = IO.readLine();
            cont++;
            if(userPass.equals(PASS)){
                pass = true;
                System.out.println("Acceso permitido.");
            }
        }
        if (cont > 3) {
            System.out.println("Acceso denegado.");
        }
    }
    
}
