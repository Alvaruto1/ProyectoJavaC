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
    public boolean registrar(String alias, String email, String contra, ArrayList <Usuario> u) {
        this.alias = alias;
        this.email = email;
        this.contra = contra;
        this.fechaReg = new Date();
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
    
    /**
     * coprueba que este disponible el alias
     * @param a alias del usuario
     * @param u listado de alias
     * @return 
     */    
    private boolean comprobarAliasUsuario(String a,ArrayList <Usuario> u){
        for(int i=0;i< u.size();i++){
            if (u.get(i).alias.equals(a)){
                return false;
            }                 
            
        }
        return true;
    }
    /**
     * 
     * @param a
     * @param e
     * @param c
     * @return 
     */
    private boolean analisisDatosRegistros(String a, String e, String c){
        boolean estado=true;
        // analisis alias
        
        // tamaño menor a 10 y mayor a 0
        if(a.length()>10 && a.length()!=0){
            estado = estado && false;
        }
        String aux = a.trim();
        
        // no pueder ser vacia, ni el primer caracter pueder ser un espacio
        if(!aux.equals("") || a.charAt(0)!=' '){
            estado = estado && false;
        }
        
        // analisis email
        int cont=0,cont1=0;
        aux=e.trim();
        // no vacia, la primera no espacio, y no debeb tener espacios
        if(e.length()!=0 || e.charAt(0)!=' ' || !aux.equals(e)){
            estado = estado && false;
        }
        // verficar que halla un @ y un .
        for(int i=0;i<a.length();i++){
            if(e.charAt(i) =='@'){
                cont++;
            }
            if(e.charAt(i) =='.'){
                cont1++;
            }
            if(cont>1||cont1>1){
                estado = estado && false;
            }
        }
        return estado;
        
    }

}