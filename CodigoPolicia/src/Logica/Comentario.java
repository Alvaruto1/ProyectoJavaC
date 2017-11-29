package Logica;
import java.io.Serializable;
import java.util.*;

/**
 * Clase en la que se registran los comentarios
 * @author Nicolas Herrera y Alvaro Niño
 */
public class Comentario implements Serializable{

    //Atributos

    /**
     * Fecha del comentario
     */
    private Date fecha;

    /**
     * Descrición del comentario
     */
    private String texto;

    /**
     * Email de quien hace el comentario
     */
    private String email;
    
    //Métodos
    
    /**
     * Método constructor
     */
    public Comentario() {
    }

    /** registro del comentario
     * @param t descripción del comentario
     * @param email email de quien hace el comentario    
     */
    public void registrarComentario(String t, String email) {        
        this.texto = t;
        this.email = email;
        this.fecha = new Date();       
    }
    /**
     * Método para obtener la fecha
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Método setter de la fecha
     * @param fecha fecha actual
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * Obtiene el comentario de la norma
     * @return texto
     */
    public String getTexto() {
        return texto;
    }
    /**
     * Método setter del texto
     * @param texto descripción comentario
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * Obtención del correo
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Método setter del correo
     * @param email Correo usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    

}