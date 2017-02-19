/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */

enum TipoHorario { H24, H12}; //Enumerado adicional para determinar el formato de la hora
//Los identificadores de Java no pueden empezar por un dígito.

public class Reloj {
    private int hora, minutos, segundos;
    
    private void compruebaHora(int hora, int minutos, int segundos) throws Exception {
        if( hora < 0 || hora > 23 )
            throw new Exception ("Error en hora");
        if( minutos < 0 || minutos > 59 )
            throw new Exception ("Error en minutos");
        if ( segundos < 0 || segundos < 59 )
            throw new Exception ("Error en segundos");
    }
    
    public Reloj(){
        hora = minutos = segundos = 0;
        //No se delega en this(0,0,0) para evitar lanzar excepciones.
        //El constructor sin parámetros siempre tiene que ser correcto o no existir.
    }
    
    public Reloj(int hora, int minutos, int segundos) throws Exception {
        compruebaHora(hora, minutos, segundos); //Si comprueba hora encuentra algún valor
                                                //incorrecto, lanzará una excepción
                                                //y el objeto no se construirá.
        
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Reloj(int hora, int minutos) throws Exception{
        this(hora, minutos , 0);
    }
    
    String dameHora(){
        return hora + ":" + minutos + ":" + segundos;
    }
    
    String dameHora(TipoHorario tipo){
        String res;
        
        if( tipo == TipoHorario.H12 && hora >= 12)
            res = "" + (hora-12);
        else
            res = "" + hora;
        
        res += ":" + minutos + ":" + segundos + ((hora < 12) ? "am" : "pm" );
        return res;
    }
    
    void ponHora(int hora, int minutos) throws Exception {
        ponHora(hora, minutos, 0);
    }
    
    void ponHora(int hora, int minutos, int segundos) throws Exception{
        compruebaHora(hora, minutos, segundos);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
}