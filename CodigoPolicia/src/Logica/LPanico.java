package Logica;

import java.util.Date;

/**
 *
 * @author alvar
 */
public class LPanico {
    /**
     * mensaje rapido para enviar
     */
    private String mensaje;
    /**
     * localizacion persona
     */    
    private String localizacion;   
    /**
     * fecha de envio
     */
    private Date fecha;
    
    /**
     * constructor parametrico
     * @param mensaje mensaje
     */
    public LPanico(String mensaje){        
        this.mensaje = mensaje;
        this.fecha = new Date();
    }

    
    
    
}
