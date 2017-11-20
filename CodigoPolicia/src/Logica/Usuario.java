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
    private int puntajeAcum;
    
    /**
     * mensajes de panico enviados
     */
    private ArrayList <LPanico> mensajePanico = new ArrayList<>();
    
    /**
     * Denuncias realizados por los usuarios
     */
    private ArrayList <Denuncia> denuncias = new ArrayList <Denuncia>();

    /**
     * @param alias nombre unico del usuario
     * @param email correo del usuario
     * @param contra contraseña del usuario
     * @return estado del registro
     */
    public boolean registrar(String alias, String email, String contra) {
        
        if(this.analisisDatosRegistros(alias, email, contra)){
            this.alias = alias;
            this.email = email;
            this.contra = contra;
            this.fechaReg = new Date(); 
            return true;
        }
        
        else{
            return false;          
        }     
        
       
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
        if (this.contra.equals(contra)){
            return true;
        }
        else{
            return false;            
        }
        
    }

    /**
     * @return puntaje acumulado del usuario
     */
    public int obtenerPuntaje() {        
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
     * comprueba que este disponible el alias
     * @param a alias del usuario
     * @param u listado de alias
     * @return 
     */    
    public boolean comprobarAliasUsuario(String a,ArrayList <Usuario> u){
        if(u!=null){
            for(int i=0;i< u.size();i++){
            if (u.get(i).alias.equals(a)){
                return false;
            }                 
            
        }
        return true;            
        }
        else{
            return true;
        }
        
    }
    
    /**
     * crear mensaje panico
     * @param mensaje de panico
     * @return 
     */
    public boolean enviarPanico(String mensaje){
        String t = mensaje;
        if(t.equals("") && t.charAt(0)==' ' && t.length()>140){
            return false;                   
        }
        else{
            mensajePanico.add(new LPanico("@AppCodigoPolici De: " + email + ": " + mensaje));
            return true;
        }        
    }
    
    /** registra un comentario sobre la norma
     * @param t describcion comentario     
     * @param comentarios arreglo de comentarios de la norma
     * @return estado de registro
     */
    public boolean registrarComentario(String t, ArrayList <Comentario> comentarios) {
        Comentario com= new Comentario();
        boolean estado = true;
        //analisis texto
        if(t.equals("") || t.charAt(0)==' '){
            estado = estado && false;                    
        }
        
        // analisis email
        int cont=0,cont1=0;        
        // no vacia, la primera no espacio, y no debeb tener espacios
        if(email.length()!=0 || email.charAt(0)!=' ' || !email.trim().equals(email)){
            estado = estado && false;
        }
        // verficar que halla un @ y un .
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) =='@'){
                cont++;
            }
            if(email.charAt(i) =='.'){
                cont1++;
            }
            if(cont>1||cont1>1){
                estado = estado && false;
            }
        }
        
        if (estado) {
            com.registrarComentario(t, email);
            comentarios.add(com);
        } 
        
        return estado;
        
            
    }
    /**
     * analiza los datos a registrar si son correctos o no
     * @param a alias del usuario
     * @param e email del usuario
     * @param c contrasenioa del usuario
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
        if(aux.equals("") || a.charAt(0)==' '){
            estado = estado && false;            
        }
        
        // analisis email
        int cont=0,cont1=0;
        aux=e.trim();
        // no vacia, la primera no espacio, y no debeb tener espacios
        if(e.length()==0 || e.charAt(0)==' ' || !aux.equals(e)){
            estado = estado && false;
        }
        // verficar que halla un @ y un .
        for(int i=0;i<e.length();i++){
            if(e.charAt(i) =='@'){
                cont++;
            }
            if(e.charAt(i) =='.'){
                cont1++;
            }            
        }
        if(cont!=1||cont1!=1){
                estado = estado && false;
        }
        
        // analisis contraseña
        
        //comprobar que no tenga espacios, que no sea vaci
        if (!c.trim().equals(c) || c.equals("")){            
            estado= estado && false;
        }
        return estado;
        
    }
    
    public boolean registrarDenuncia(String t, String id) {
        //analisis registroDenuncia
        
        if(t.equals("") && t.charAt(0)==' '){
            return false;                   
        }
        else{
            Denuncia c = new Denuncia();
            c.hacerReporte(t,id);
            denuncias.add(c);
            return true;
        } 
               
        
    }
    
    public ArrayList<Denuncia> getDenuncias() {
        return denuncias;
    }   

}