package Logica;
import java.util.*;

/**
 * 
 */
public class Comentario {

    /**
     * Default constructor
     */
    public Comentario() {
    }

    /**
     * fecha del comentario
     */
    private Date fecha;

    /**
     * descricion del comentario
     */
    private String texto;

    /**
     * email de quien hace el comentario
     */
    private String email;

    /** registro del comentario
     * @param t describcion del comentario
     * @param email email de quien hace el comentario
     * @return
     */
    public void registrarComentario(String t, String email) {
        this.texto = t;
        this.email = email;
        this.fecha = new Date();       
    }

}