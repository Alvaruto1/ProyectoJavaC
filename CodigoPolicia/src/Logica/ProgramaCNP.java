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
    private Comentarios ventanaComentario = new Comentarios();
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
    private ReportarInfraccion ventanaInfraccion = new ReportarInfraccion();
    /**
     * ventana correspondiente al panico
     */
    private Panico ventanaPanico = new Panico();
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
    private String emailPCNP = "codP@gmail.com";
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
        if(codigoPolicia == null){
            System.out.println("si es null");
        }
        
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
     * envia un sugerencia sobre el programa
     * @param comentario
     * @param correo
     * @return 
     */
    public boolean enviarSugerencia(String comentario, String correo){
        Sugerencia suge = new Sugerencia();
        suge.hacerSugerencia(comentario, correo);
        JavaMail javaMail = new JavaMail(emailPCNP,"contracorreo",comentario,emailPCNP, "Sugerencia: "+correo+"("+suge.getFecha()+")");
        return javaMail.enviarCorreo();      
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
        this.ventanaComentario.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, this);
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
        
    }
    
    public String obtenerAlias(){
        return this.usuarioAlias;
    }

}