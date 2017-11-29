package Logica;
import java.io.Serializable;
import java.util.*;

/**
 * Clase registra las sugerencias
 * @author Nicolas Herrera y Alvaro Niño
 */
public class Sugerencia implements Serializable{

    //Atributos

    /**
     * fecha de la sugerencia
     */
    private Date fecha;

    /**
     * descripcion de la sugerencia
     */
    private String texto;
    
    /**
     * correo de la persona que hace la sugerencia
     */
    private String correo;
    
    //Métodos
    
    /**
     * Método constructor
     */
    public Sugerencia() {
    }
    
    /** registrar sugerencia
     * @param t descripcion de la sugerencia
     * @param correo correo
     */
    public void hacerSugerencia(String t, String correo) {
        
       
        this.texto = t;
        this.fecha = new Date();   
        this.correo = correo;
        
                
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

}