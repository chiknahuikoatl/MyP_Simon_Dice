package javafxapplication1;

/**
 * @author chicnahuicoatl
 */

import java.util.Vector;
import java.util.Random;

public class Modelo {
    // Vector para almacenar la secuencia de colores.
    private Vector<Integer> secuenciaColores;
    // Objeto Random para crear números aleatorios.
    private Random random;
    // Define la dificultad del juego con un entero entre 0 y 2.
    private int dificultad;
    private boolean continuaJuego; // Avisa cuándo el juego ha terminado.
    private boolean turnoUsuario; // Indica si es el turno del usuario.
    private int colorActual; // Da el índice de la secuencia en el que se encuentra el jugador.
    
    /**
     * Constructor para la clase Modelo.
     * La lógica del juego de Simón Dice.
     * @param dificultad, establece la dificultad del juego.
     */
    public Modelo(int dificultad){
        if(dificultad >= 0 && dificultad <= 2){
            this.dificultad = dificultad;
        }else{
            throw new 
                IllegalArgumentException("El argumento dado no es válido.");
        }
        secuenciaColores = new Vector<>();
        random = new Random();
        this.continuaJuego = true;
        this.turnoUsuario = false;
        this.colorActual = 0;
    }
    
    /**
     * Método para iniciar juego
     * @param dificultad del juego. 
     * @throws IllegalAgumentException
     
    public void juega(int dificultad) throws IllegalArgumentException{
        while(continuaJuego){
            if(turnoUsuario){
                
            }else{
                secuenciaColores = nuevoColor();
            }
        }
    }*/
    
    public void turno(){
        secuenciaColores = nuevoColor();
    }
    
    /**
     * Añade un nuevo color a la secuencia de colores.
     * Dependiendo de la dificultad, elige un nuevo color aleatorio y lo 
     * añade a la secuencia.
     * @return secuenciaColores con el nuevo color elegido.
     */
    public Vector<Integer> nuevoColor(){
        Integer color = random.nextInt(4+dificultad);
        Vector<Integer> sC = new Vector<>();
        sC.add(color);
        return sC;
    }
    
    /**
     * Registra el tiro del jugador.
     * Si es válido, continúa. De otro modo, lanza una excepción.
     * Un tiro válido significa que el color elegido por el jugador es el mismo que el del índice 
     * correspondiente en el vector de colores.
     * @param color el color elegido por el usuario
     * @throws IllegalArgumentException si el color es válido.
     */
    public void tiroJugador(int color){
        if(secuenciaColores.get(colorActual) == color){
            colorActual++;
        }else{
            throw new IllegalArgumentException();
        }
    }
    
    // Getters y Setters
    public Vector<Integer> getColores(){
        return secuenciaColores;
    }
    
    public int getColorActual(){
        return this.colorActual;
    }
    
    public Vector<Integer> getSecuenciaColores(){
        return this.secuenciaColores;
    }
    
}
