package Logica;
import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * Nombre de usuario unico 
     */
    private String alias;

    /**
     * Correo del usuario
     */
    private String email;

    /**
     * Contraseña del usuario
     */
    private String contra;

    /**
     * Fecha de registro del usuario en la plataforma
     */
    private Date fechaReg;

    /**
     * puntaje acumulado segun quices realizados
     */
    private double puntajeAcum;

    /**
     * @param alias nombre unico del usuario
     * @param email correo del usuario
     * @param contra contraseña del usuario
     * @return estado del registro
     */
    public boolean registrar(String alias, String email, String contra) {
        this.alias = alias;
        this.email = email;
        this.contra = contra;
        return true;
    }

    /**
     * @return el email del usuario
     */
    public String obtenerEmail() {
        return this.email;
    }

    /**
     * @param contra 
     * @return la contraseña del usuario
     */
    public boolean autenticar(String contra) {
        if (this.contra == contra){
            return true;
        }
        else{
            return false;            
        }
        
    }

    /**
     * @return puntaje acumulado del usuario
     */
    public Double obtenerPuntaje() {        
        return this.puntajeAcum;
    }

    /**
     * @return alias del usuario
     */
    public String obtenerAlias() {
        return this.alias;        
    }

    /**
     * @param p puntaje a anexar al acumulado 
     */
    public void actualizarPuntaje(double p) {
        this.puntajeAcum += p;        
    }

}