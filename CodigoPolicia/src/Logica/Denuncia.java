package Logica;
import java.io.Serializable;
import java.util.*;

/**
 * Clase en la que se registran las denuncias
 * @author Nicolas Herrera y Alvaro Niño
 */
public class Denuncia implements Serializable{

    //Atributos

    /**
     * Fecha del reporte
     */
    private Date fecha;
    
    /**
     * URL de la evidencia de la infracción
     */
    private String prueba;

    /**
     * Descrición de la infracción
     */
    private String descripcion;
    
    /**
     * Artículo de la infración
     */
    private String id;
    
    //Métodos
    
    /**
     * Método constructor
     */
    public Denuncia() {
    }
    
    /** Registrar sugerencia
     * @param d descripcion de la infracción
     * @param id # de articulo
     */
    public void hacerReporte(String d, String id) {       
        this.descripcion = d;
        this.fecha = new Date(); 
        this.id = id;
    }
    /**
     * Obtención de la fecha
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Setter de la fecha
     * @param fecha fecha actual
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * Obtención de la descripción de la denuncia
     * @return descripción
     */
    public String getTexto() {
        return descripcion;
    }
    /**
     * Setter del texto
     * @param texto texto
     */
    public void setTexto(String texto) {
        this.descripcion = texto;
    }

    
    

}