/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(){
        dia = 1;
        mes = 1;
        año = 2000;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAño(){
        return año;
    }
    
    protected static boolean esBisiesto(int year){
        return year%4 == 0 && (year%100 != 0 || year%400 == 0);
    }
    
    public void setDia(int dia){
        switch (mes) {
            case 4: case 6: // MESES CON 30
            case 9: case 11:
                if(dia > 0 && dia < 31)
                    this.dia = dia;
                break;
            case 2:         // FEBRERO
                if(esBisiesto(año)){
                    if(dia > 0 && dia < 30)
                        this.dia = dia;
                }
                else{
                    if(dia > 0 && dia < 29)
                        this.dia = dia;
                }
                break;
            default:        // MESES CON 31
                if(dia > 0 && dia < 32)
                    this.dia = dia;
                break;
        }
    }
    
    public void setMes(int mes){
        if(mes > 0 && mes < 13)
            this.mes = mes;
    }
    
    public void setAño(int año){
        if(año > 0 && año < 3000)
            this.año = año;
    }
}
