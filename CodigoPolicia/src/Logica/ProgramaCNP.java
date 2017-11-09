package Logica;
import java.util.*;

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
    
    private codPol codigoPolicia;
    /**
     * arreglo de usuarios
     */    
    private ArrayList <Usuario> usuarios;
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
    private String emailPCNP;

    /**
     * @param args[]     
     */
    public void main(String args[]) {
        // TODO implement here
        
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
                return "Usuario registrado exitosamente";
            
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

}