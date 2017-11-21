package Logica;
import java.util.*;

/**
 * 
 */
public class Quiz {

    /**
     * Constructor parametrico
     */
    public Quiz(){
        establecerBasePregRes();
    }

    /**
     * base de preguntas
     */
    private ArrayList <String> basePreguntas = new ArrayList<String>();

    /**
     * base de respuestas
     */
    private ArrayList <String[]> baseRespuestas = new ArrayList<String[]>();
    
    /**
     * preguntas del quiz
     */
    private ArrayList <String> preguntas = new ArrayList<String>();

    /**
     * respuestas del quiz
     */
    private ArrayList <String[]> respuestas = new ArrayList<String[]>();;

    /**
     * puntaje obtenido al realizar el quiz
     */
    private int puntaje;

    /**
     * obtener preguntas del quiz
     * @return preguntas
     */
    public ArrayList<String> getPreguntas() {
        return preguntas;
    }
    /**
     * obtner respuestas del quiz
     * @return respuestas
     */
    public ArrayList<String[]> getRespuestas() {
        return respuestas;
    }
    
    /**
     * obtener puntaje del quiz
     * @return puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * alias de quien realizo el quiz
     */
    private String alias;

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
     * verifica las respuestas del usuario con las reales
     * @param r respuestas del usuario
     */
    public void calificar(ArrayList <String> r) {
        int calificacion=0;
        for(int i=0; i<5; i++){
            if(r.get(i).equals(respuestas.get(i)[0])){
                calificacion++;
            }
        }
        this.puntaje = calificacion;
    }

    /**
     * actualiza puntaje de usuario
     * @param u usuario
     */
    public void actualizarPuntaje(Usuario u) {
        u.actualizarPuntaje(this.puntaje);
        this.alias = u.obtenerAlias();
        
    }
    /**
     * se establecen las preguntas y respuestas
     */
    private void establecerBasePregRes(){
        //adicionar preguntas y respuestas
        new InicializarDatos().inicializarBasePreguntasRespuestas(basePreguntas, baseRespuestas);
        
    
    }
    
    
    

}