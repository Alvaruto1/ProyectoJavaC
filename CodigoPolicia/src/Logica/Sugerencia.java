package Logica;
import java.util.*;

/**
 * 
 */
public class Sugerencia {

    /**
     * Default constructor
     */
    public Sugerencia() {
    }

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

    /** registrar sugerencia
     * @param t descripcion de la sugerencia
     * @return estado de hacer sugerencia
     */
    public boolean hacerSugerencia(String t, String correo) {
        
        //analisis texto
        if(t.equals("") || t.charAt(0)==' '){
            return false;                   
        }
        else{
            this.texto = t;
            this.fecha = new Date();   
            this.correo = correo;
            return true;
        }
                
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