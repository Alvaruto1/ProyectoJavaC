package Logica;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase para envío de mansaje de pánico
 * @author Nicolas Herrera y Alvaro Niño
 */
public class LPanico implements Serializable{
    
    //Atributos
    
    /**
     * mensaje rapido para enviar
     */
    private String mensaje;
    /**
     * localización persona
     */    
    private String localizacion;   
    /**
     * fecha de envío
     */
    private Date fecha;
    
    //Métodos
    
    /**
     * constructor parametrico
     * @param mensaje mensaje
     */
    public LPanico(String mensaje){        
        this.mensaje = mensaje;
        this.fecha = new Date();
    }

    
    
    
}
