/*
 * Just copy the code.
 */

/**
 *
 * @author berto
 */
public class Programador {
    private Bombilla bombilla1;
    private Bombilla bombilla2;
    private Bombilla bombilla3;
    private Bombilla bombilla4;
    private Bombilla bombilla5;
    private Bombilla bombilla6;
    
    public Programador(){
        bombilla1 = new Bombilla();
        bombilla2 = new Bombilla();
        bombilla3 = new Bombilla();
        bombilla4 = new Bombilla();
        bombilla5 = new Bombilla();
        bombilla6 = new Bombilla();
    }
    
    public void programa1(){
        System.out.println("----------");
        // Una si una no y de forma alternativa
        bombilla1.encender();bombilla2.apagar();
        bombilla3.encender();bombilla4.apagar();
        bombilla5.encender();bombilla6.apagar();
        mostrar();
        bombilla1.cambiar();bombilla2.cambiar();
        bombilla3.cambiar();bombilla4.cambiar();
        bombilla5.cambiar();bombilla6.cambiar();
        mostrar();
        System.out.println("----------");
    }
    
    public void programa2(){
        System.out.println("----------");
        // Barrido
        bombilla1.encender();bombilla2.apagar();
        bombilla3.apagar();bombilla4.apagar();
        bombilla5.apagar();bombilla6.apagar();
        mostrar();
        bombilla1.cambiar();bombilla2.cambiar();
        mostrar();
        bombilla2.cambiar();bombilla3.cambiar();
        mostrar();
        bombilla3.cambiar();bombilla4.cambiar();
        mostrar();
        bombilla4.cambiar();bombilla5.cambiar();
        mostrar();
        bombilla5.cambiar();bombilla6.cambiar();
        mostrar();
        bombilla6.cambiar();bombilla5.cambiar();
        mostrar();
        bombilla5.cambiar();bombilla4.cambiar();
        mostrar();
        bombilla4.cambiar();bombilla3.cambiar();
        mostrar();
        bombilla3.cambiar();bombilla2.cambiar();
        mostrar();
        bombilla2.cambiar();bombilla1.cambiar();
        mostrar();
        System.out.println("----------");
    }
    
    public void programa3(){
        System.out.println("----------");
        // Enciende de izq a dcha, apaga de izq a drcha.
        bombilla1.encender();bombilla2.apagar();
        bombilla3.apagar();bombilla4.apagar();
        bombilla5.apagar();bombilla6.apagar();
        mostrar();
        bombilla2.cambiar();
        mostrar();
        bombilla3.cambiar();
        mostrar();
        bombilla4.cambiar();
        mostrar();
        bombilla5.cambiar();
        mostrar();
        bombilla6.cambiar();
        mostrar();
        bombilla6.cambiar();
        mostrar();
        bombilla5.cambiar();
        mostrar();
        bombilla4.cambiar();
        mostrar();
        bombilla3.cambiar();
        mostrar();
        bombilla2.cambiar();
        mostrar();
        bombilla1.cambiar();
        mostrar();
        // Despues de drcha a izq.
        bombilla6.cambiar();
        mostrar();
        bombilla5.cambiar();
        mostrar();
        bombilla4.cambiar();
        mostrar();
        bombilla3.cambiar();
        mostrar();
        bombilla2.cambiar();
        mostrar();
        bombilla1.cambiar();
        mostrar();
        bombilla1.cambiar();
        mostrar();
        bombilla2.cambiar();
        mostrar();
        bombilla3.cambiar();
        mostrar();
        bombilla4.cambiar();
        mostrar();
        bombilla5.cambiar();
        mostrar();
        bombilla6.cambiar();
        mostrar();
        System.out.println("----------");
    }
    
    public void mostrar(){
        System.out.println(bombilla1.mostrarEstado() + bombilla2.mostrarEstado() + bombilla3.mostrarEstado() + bombilla4.mostrarEstado() + bombilla5.mostrarEstado() + bombilla6.mostrarEstado());
    }
}
