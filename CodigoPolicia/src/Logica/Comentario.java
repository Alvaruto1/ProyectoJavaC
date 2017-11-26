package Logica;
import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Comentario implements Serializable{

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
     */
    public void registrarComentario(String t, String email) {        
        this.texto = t;
        this.email = email;
        this.fecha = new Date();       
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}