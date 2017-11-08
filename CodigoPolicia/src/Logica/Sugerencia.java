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

    /** registrar sugerencia
     * @param t descripcion de la sugerencia
     * @return estado de hacer sugerencia
     */
    public boolean hacerSugerencia(String t) {
        
        //analisis texto
        if(t.equals("") || t.charAt(0)==' '){
            return false;                   
        }
        else{
            this.texto = t;
            this.fecha = new Date();   
            return true;
        }
                
    }

}