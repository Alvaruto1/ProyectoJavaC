package Logica;
import java.util.*;

/**
 * 
 */
public class Quiz {

    /**
     * Constructor parametrico
     */
    public Quiz(Usuario u){
        establecerBasePregRes();
    }

    /**
     * base de preguntas
     */
    private ArrayList <String> basePreguntas;

    /**
     * base de respuestas
     */
    private ArrayList <String> baseRespuestas;
    
    /**
     * preguntas del quiz
     */
    private ArrayList <String> preguntas;

    /**
     * respuestas del quiz
     */
    private ArrayList <String> respuestas;

    /**
     * puntaje obtenido al realizar el quiz
     */
    private int puntaje;

    /**
     * alias de quien realizo el quiz
     */
    private Usuario usuario;

    /**
     * escoge al azar 5 preguntas de la base para hacer el quiz
     */
    public void hacerPreguntas() {
        // esocger preguntas para el quiz
        for(int i=0; i<5; i++){
            Random r=new Random();
            int num=r.nextInt(basePreguntas.size());
            //adicionar preguntas al quiz
            preguntas.add(basePreguntas.get(num));
            //adicionar repuestas al quiz
            respuestas.add(baseRespuestas.get(num));
            //borrar de la base pregunta y respuesta que se adiciono al quiz, para no repetir
            basePreguntas.remove(num);
            baseRespuestas.remove(num);
        }       
    }

    /**
     * @return
     */
    public void calificar(ArrayList <String> r) {
        int calificacion=0;
        for(int i=0; i<5; i++){
            if(r.get(i).equals(respuestas.get(i))){
                calificacion++;
            }
        }
        this.puntaje = calificacion;
    }

    /**
     * @return
     */
    public boolean actualizarPuntaje() {
        this.usuario.actualizarPuntaje(this.puntaje);
        return false;
    }
    /**
     * se establecen las preguntas y respuestas
     */
    private void establecerBasePregRes(){
        
    }
    

}