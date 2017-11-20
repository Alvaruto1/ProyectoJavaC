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
     * Artículo de la infración
     */
    private String id;

    /** registrar sugerencia
     * @param d descripcion de la infracción
     * @param id # de articulo
     */
    public void hacerReporte(String d, String id) {       
        this.descripcion = d;
        this.fecha = new Date(); 
        this.id = id;
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

    
    

}