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
    
    /**
     * Constructor para la clase Modelo.
     * La lógica del juego de Simón Dice.
     * @param dificultad, establece la dificultad del juego.
     */
    public Modelo(){
        secuenciaColores = new Vector<>();
        random = new Random();
        this.continuaJuego = true;
        this.turnoUsuario = false;
    }
    
    /**
     * Método para iniciar juego
     * @param dificultad del juego. 
     * @throws IllegalAgumentException
     */
    public void juega(int dificultad) throws IllegalArgumentException{
        if(dificultad >= 0 && dificultad <= 2){
            this.dificultad = dificultad;
        }else{
            throw new 
                IllegalArgumentException("El argumento dado no es válido.");
        }
        while(continuaJuego){
            if(turnoUsuario){
                
            }else{
                secuenciaColores = nuevoColor();
            }
        }
    }
    
    /**
     * Añade un nuevo color a la secuencia de colores.
     * Dependiendo de la dificultad, elige un nuevo color aleatorio y lo 
     * añade a la secuencia.
     * @return secuenciaColores con el nuevo color elegido.
     */
    public Vector<Integer> nuevoColor(){
        Integer color = random.nextInt(4+dificultad);
        secuenciaColores.add(color);
        return secuenciaColores;
    }
    
    // Getters y Setters
    public Vector<Integer> getColores(){
        return secuenciaColores;
    }
    
}
