/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha();
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
        f.setAño(2017);f.setMes(2);f.setDia(29);
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
        f.setDia(28);
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
        f.setAño(2016);f.setMes(2);f.setDia(29);
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
        f.setAño(2017);f.setMes(1);f.setDia(31);
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
    }

}
