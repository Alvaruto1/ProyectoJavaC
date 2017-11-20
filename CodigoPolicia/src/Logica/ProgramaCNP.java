package Logica;
import InterfazGrafica.*;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * 
 */
public class ProgramaCNP {

    /**
     * Default constructor
     */
    public ProgramaCNP() {
    }

    
    /**
     * codigo de policia
     */ 
    private CodPol codigoPolicia = new CodPol();
    // vistas del programa Codigo de Polciia
    
    
    /**
     * ventana correspondiente al registro del usuario
     */
    private Registro ventanaRegistro = new Registro();    
    /**
     * ventana correspondiente al menu principal
     */
    private MenuPrincipal ventanaMenu = new MenuPrincipal();
    /**
     * ventana correspondiente al menu principal
     */
    private IniciarSesion ventanaSesion = new IniciarSesion();
    /**
     * ventana correspondiente a las sugerencias
     */
    private Sugerencias ventanaSugerencia = new Sugerencias(this);
    /**
     * ventana correspondiente a los comentarios
     */
    private Comentarios ventanaComentario = new Comentarios(this);
    /**
     * ventana correspondiente al quiz
     */
    private Quices ventanaQuiz = new Quices();
    /**
     * ventana correspondiente a las normas
     */
    private Normas ventanaNorma = new Normas();
    /**
     * ventana correspondiente al reporte infracciones
     */
    private ReportarInfraccion ventanaInfraccion = new ReportarInfraccion(this);
    /**
     * ventana correspondiente al panico
     */
    private Panico ventanaPanico = new Panico(this);
    /**
     * Ventana articulos
     */    
    private Articulos ventanaArticulo = new Articulos(this);
    /**
     * Ventana esoger tipo material didactico
     */    
    private EscogerMaterialDidactico ventanaEscogerDidactico = new EscogerMaterialDidactico(this);
    /**
     * Ventana material didactico
     */    
    private MaterialDidactico ventanaDidactico = new MaterialDidactico(this);    
    
    
    /**
     * arreglo de usuarios
     */    
    private ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
    /**
     * estado si se encuentra loggeado o no un usuario
     */
    private boolean usuarioAutenticado;

    /**
     * nombre del usuario loggeado
     */
    private String usuarioAlias = "Invitado";  
    /**
     * correo al que se le envia
     */
    private String emailPCNP = "appcodigopolicia@gmail.com";
    /**
     * Correo de la policia
     */
    private String emailPolicia = "policianacionalcolomPOO@gmail.com";
    /**
     * @param args[]     
     */
    
    public static void main(String args[]) {    
        new ProgramaCNP().iniciarProgramaCNP();        
    }

    /**
     * consulta el codigo completo pdf
     * @return ruta pdf codigo policia
     */
    public String consultarTodo() {
        return codigoPolicia.consultar();
    }

    /**
     * consulta por norma segun opcion (caricatura, boletin o lyenda)
     * @param id de la norma
     * @param opcion caricatur, boletin o leyenda
     * @return ruta de caricatura, boletin o leyenda
     */
    public String consultarNorma(String id , int opcion) {        
        
        return codigoPolicia.consultarNorma(id, opcion);        
    }

    /**
     * registro de un usario
     * @param alias nombre del usuario
     * @param email correo del usuario
     * @param contra contraseña del usuario
     */
    public String registrarUsuario(String alias, String email, String contra) {
        Usuario u = new Usuario();
        if(u.comprobarAliasUsuario(alias, usuarios)){
            if(u.registrar(alias, email, contra)){                
                usuarios.add(u);                  
                return "Bienvenido ud se ha registrado exitosamente";
            
            }
            else{
                return "<html>No se ha podio registrar usuario"
                        + "<br>Tenga en cuenta lo siguiente:"
                        + "<br>Alias: no debe estar vacia, ni puede comenzar con un espacio, ademas no debe ser mayor a 10 caracteres"
                        + "<br>Email: debe contener un correo valido (ejemplo: codigo@policia.com)"
                        + "<br>Contraseña: no debe estar vacia, ni puede comenzar con un espacio y no pueden haber espacios.</html>";
            }
        }
        else{
            return "Nombre de alias ya utilizado";                
        }        
        
        
    }

    /**
     * autentica a un usuario en la aplicacion
     * @param alias nombre del usuario   
     * @param contra contraseña del usuario
     * @return retorna si fue posible autenticarlo
     */
    public boolean autenticarUsuario(String alias,String contra) {        
        for(Usuario u: usuarios){
            if (u.obtenerAlias().equals(alias)){
                if(u.autenticar(contra)){
                    this.usuarioAlias = u.obtenerAlias();
                    this.usuarioAutenticado = true;   
                    actualizarSesion(); //actualiza el nombre de usuario de la sesion
                    return true;
                    
                }
                
            }
        }
        this.usuarioAlias = "Invitado";
        this.usuarioAutenticado = false;
        return false;
    }

    /**
     * comentar una norma
     * @param idNorma el id de la norma a comentar
     * @param comentario descripcion del comentario
     */
    public void comentarNorma(String comentario, String idNorma) {
        String email="";
        for(Usuario u: usuarios){
            if(u.obtenerAlias().equals(this.usuarioAlias)){
                 email = u.obtenerEmail();                 
            }
        }    
        
        codigoPolicia.registrarComentario(comentario, email , idNorma);
    }
    
    /**
     * obtiene los coemntarios de la norma
     * @param id de la norma
     * @return retorna un arreglo de coemntarios
     */
    public ArrayList<Comentario> obtenerComentarios(String id) {
        return codigoPolicia.devolverNorma(id).getComentarios();
    } 
    
    /**
     * envia un sugerencia sobre el programa
     * @param comentario
     * @param correo
     * @return 
     */
    public boolean enviarSugerencia(String comentario, String correo){
        Sugerencia suge = new Sugerencia();
        suge.hacerSugerencia(comentario, correo);
        JavaMail javaMail = new JavaMail(emailPCNP,"appcodigopolicia.com",comentario,emailPCNP, "Sugerencia: "+correo+"("+suge.getFecha()+")");
        return javaMail.enviarCorreo();      
    }
    
    /**
     * envia un mensaje via twitter
     * @param comentario
     * @return estado de envio mensaje de panico
     */
    public boolean enviarPanico(String comentario){
        for(Usuario u: usuarios){
            if(u.obtenerAlias().equals(usuarioAlias)){
                if(u.enviarPanico(comentario)){
                    Twitter4J twitter = new Twitter4J();
                    twitter.setTweet(comentario);
                    return twitter.twittear();           
                }
                                
            }
        }
        return false;
    }
    
    
    /**
     * envia reporte de infraccion
     * @param descripcion de la infraccion
     * @param ruta1 evidencia fotografica
     * @param ruta2 evidencia video
     * @return 
     */
    public boolean enviarReporte(String descripcion, String ruta1, String ruta2){
        
        if(ruta1.equals("") && ruta2.equals("")){
            for(Usuario u: usuarios){
                if(u.obtenerAlias().equals(usuarioAlias)){
                    if(u.registrarDenuncia(descripcion,ventanaInfraccion.getIdNorma())){
                        JavaMail javaMailAdjunto = new JavaMail(emailPCNP,"appcodigopolicia.com",descripcion,emailPCNP, ("Infracción del ar.: "+ventanaInfraccion.getIdNorma()+"-"+u.obtenerEmail()));
                        return javaMailAdjunto.enviarCorreo(); 
                    }                                
                }

            }            
        }
        else{
            for(Usuario u: usuarios){
                if(u.obtenerAlias().equals(usuarioAlias)){
                    if(u.registrarDenuncia(ruta1,ventanaInfraccion.getIdNorma())){
                        JavaMail javaMailAdjunto = new JavaMail(emailPCNP,"appcodigopolicia.com",descripcion,emailPCNP, ("Infracción del ar.: "+ventanaInfraccion.getIdNorma()+"-"+u.obtenerEmail()));
                        return javaMailAdjunto.enviarCorreoAdjunto(ruta1,ruta2); 
                    }                                
                }

            }            
        }
        
        return false;      
        
    }
    
    /**
     * inicia el programa de Codigo de Policia
     */
    public void iniciarProgramaCNP(){
        inicializarVentanas();
        ventanaMenu.setVisible(true);
    }
    
    
    /**
     * Inicializa las ventanas con sus respectivos parametros
     */
    public void inicializarVentanas(){        
        this.ventanaRegistro.inicioVentana(ventanaMenu, ventanaSesion, ventanaPanico, ventanaInfraccion, this);
        this.ventanaMenu.inicioVentana(ventanaSesion, ventanaRegistro, ventanaNorma, ventanaQuiz, ventanaSugerencia, ventanaInfraccion, ventanaPanico);
        this.ventanaSesion.inicioVentana(ventanaMenu, ventanaRegistro, ventanaInfraccion, ventanaPanico, this);
        this.ventanaInfraccion.inicioVentana(ventanaMenu,ventanaPanico);
        this.ventanaPanico.inicioVentana(ventanaMenu, ventanaInfraccion);
        this.ventanaNorma.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico,ventanaArticulo,ventanaEscogerDidactico);
        this.ventanaDidactico.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico, ventanaComentario, ventanaEscogerDidactico);
        this.ventanaEscogerDidactico.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico, ventanaDidactico);
        this.ventanaArticulo.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaComentario);
        this.ventanaComentario.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaArticulo, ventanaDidactico);
        this.ventanaQuiz.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, this);
        this.ventanaSugerencia.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion);
        
    }
    
    /**
     * actualiza el nombre del usuario en cada ventana
     */
    public void actualizarSesion(){
        
        ventanaRegistro.actualizarSesion(usuarioAlias);
        ventanaSesion.actualizarSesion(usuarioAlias);
        ventanaMenu.actualizarSesion(usuarioAlias);
        ventanaInfraccion.actualizarSesion(usuarioAlias);
        ventanaPanico.actualizarSesion(usuarioAlias);
        ventanaNorma.actualizarSesion(usuarioAlias);
        ventanaDidactico.actualizarSesion(usuarioAlias);
        ventanaEscogerDidactico.actualizarSesion(usuarioAlias);
        ventanaArticulo.actualizarSesion(usuarioAlias);
        ventanaComentario.actualizarSesion(usuarioAlias);
        ventanaQuiz.actualizarSesion(usuarioAlias);
        ventanaSugerencia.actualizarSesion(usuarioAlias);
        
        
    }
    
    public String obtenerAlias(){
        return this.usuarioAlias;
    }

}