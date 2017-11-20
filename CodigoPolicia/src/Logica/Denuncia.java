package Logica;
import java.util.*;

/**
 * 
 */
public class Denuncia {

    /**
     * Default constructor
     */
    public Denuncia() {
    }

    /**
     * fecha del reporte
     */
    private Date fecha;
    
    /**
     * URL de la evidencia de la infracción
     */
    private String prueba;

    /**
     * descricion de la infracción
     */
    private String descripcion;

    /**
     * email de quien hace el reporte
     */
    private String email;
    
    /**
     * Artículo de la infración
     */
    private int id;

    /** registrar sugerencia
     * @param t descripcion de la infracción
     * @return estado de hacer el reporte
     */
    public boolean hacerReporte(String d) {
        
        //analisis descripción reporte
        if(d.equals("") || d.charAt(0)==' '){
            return false;                   
        }
        else{
            this.descripcion = d;
            this.fecha = new Date();   
            this.email = email;
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
        return descripcion;
    }

    public void setTexto(String texto) {
        this.descripcion = texto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}