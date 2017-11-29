package Logica;

import InterfazGrafica.*;
import com.teamdev.jxmaps.swing.MapView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase central que controla el sistema
 * @author Nicolas Herrera y Alvaro Niño
 */
public class ProgramaCNP {
    
    //Atributos
    
    /**
     * Identificador sugerencia
     */
    public final static int SUGERENCIA =0;
    /**
     * Identificador twitter
     */
    public final static int TWITTER =1;
    /**
     * Identificador comentario denuncia
     */
    public final static int COMEN_DENUN =1;
    
    /**
     * código de policia
     */
    private CodPol codigoPolicia = new CodPol();
    
    // vistas del programa Codigo de Polcia   
    
    /**
     * ventana correspondiente al registro del usuario
     */
    private Registro ventanaRegistro = new Registro();
    /**
     * Ventana correspondiente al perfil del usuario
     */
    private PerfilUsuario ventanaPerfil = new PerfilUsuario(this);
    /**
     * ventana correspondiente al menu principal
     */
    private MenuPrincipal ventanaMenu = new MenuPrincipal(this);
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
    private Normas ventanaNorma = new Normas(this);
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
     * Ventana ubicacion
     */
    private UbicacionCAI ventanaUbicacion = new UbicacionCAI(this);
    /**
     * sugerencias
     */
    private ArrayList<Sugerencia> sugerencia = new ArrayList<>();

    /**
     * arreglo de usuarios
     */
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

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
     * lugar de ubicacion
     */
    private String lugar = "";
    /**
     * latitud ubicacion usuario
     */
    private double latitud = 0.0;
    /**
     * longitud ubicacion usuario
     */
    private double longitud = 0.0;
    /**
     * posicion cai cercano
     */
    private int posCaiCercano = 152;

    //Métodos
    
    /**
     * Default constructor
     */
    public ProgramaCNP() {
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    /**
     * @param args[]
     */
    public static void main(String args[]) {
        ProgramaCNP programa = new ProgramaCNP();
        programa.iniciarProgramaCNP();
    }
    /**
     * Obtiene latitud usuario
     * @return latitud usuario
     */
    public double getLatitud() {
        return latitud;
    }
    /**
     * Obtiene longitud usuario
     * @return longitud
     */
    public double getLongitud() {
        return longitud;
    }
    /**
     * Obtienes posicion CAI cercano
     * @return Posición CAI cercano
     */
    public int getPosCaiCercano() {
        return posCaiCercano;
    }

    /**
     * consulta el codigo completo pdf
     *
     * @return ruta pdf codigo policia
     */
    public String consultarTodo() {
        return codigoPolicia.consultar();
    }

    /**
     * consulta por norma segun opcion (caricatura, boletin o lyenda)
     *
     * @param id de la norma
     * @param opcion caricatur, boletin o leyenda
     * @return ruta de caricatura, boletin o leyenda
     */
    public String consultarNorma(String id, int opcion) {

        return codigoPolicia.consultarNorma(id, opcion);
    }

    /**
     * obtener codigo de policia
     *
     * @return codigo de policia
     */
    public CodPol obtenerCodigoPolicia() {
        return codigoPolicia;
    }

    /**
     * registro de un usario
     *
     * @param alias nombre del usuario
     * @param email correo del usuario
     * @param contra contraseña del usuario
     * @return texto
     */
    public String registrarUsuario(String alias, String email, String contra) {
        Usuario u = new Usuario();
        if (u.comprobarAliasUsuario(alias, usuarios)) {
            if (u.registrar(alias, email, contra)) {
                usuarios.add(u);
                return "Bienvenido ud se ha registrado exitosamente";

            } else {
                return "<html>No se ha podio registrar usuario"
                        + "<br>Tenga en cuenta lo siguiente:"
                        + "<br>Alias: no debe estar vacia, ni puede comenzar con un espacio, ademas no debe ser mayor a 10 caracteres"
                        + "<br>Email: debe contener un correo valido (ejemplo: codigo@policia.com)"
                        + "<br>Contraseña: no debe estar vacia, ni puede comenzar con un espacio y no pueden haber espacios.</html>";
            }
        } else {
            return "Nombre de alias ya utilizado";
        }

    }

    /**
     * autentica a un usuario en la aplicacion
     *
     * @param alias nombre del usuario
     * @param contra contraseña del usuario
     * @return retorna si fue posible autenticarlo
     */
    public boolean autenticarUsuario(String alias, String contra) {
        for (Usuario u : usuarios) {
            if (u.obtenerAlias().equals(alias)) {
                if (u.autenticar(contra)) {
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
     *
     * @param idNorma el id de la norma a comentar
     * @param comentario descripcion del comentario
     */
    public void comentarNorma(String comentario, String idNorma) {
        String email = "";
        for (Usuario u : usuarios) {
            if (u.obtenerAlias().equals(this.usuarioAlias)) {
                email = u.obtenerEmail();
            }
        }

        codigoPolicia.registrarComentario(comentario, email, idNorma);
    }

    /**
     * obtiene los coemntarios de la norma
     *
     * @param id de la norma
     * @return retorna un arreglo de coemntarios
     */
    public ArrayList<Comentario> obtenerComentarios(String id) {
        return codigoPolicia.devolverNorma(id).getComentarios();
    }

    /**
     * envia un sugerencia sobre el programa
     *
     * @param comentario
     * @param correo
     * @return
     */
    public boolean enviarSugerencia(String comentario, String correo) {
        if(analisisTexto(COMEN_DENUN, comentario, correo, ventanaSugerencia)){
            Sugerencia suge = new Sugerencia();
            suge.hacerSugerencia(comentario, correo);
            sugerencia.add(suge);
            JavaMail javaMail = new JavaMail(emailPCNP, "appcodigopolicia.com", comentario, emailPCNP, "Sugerencia: " + correo + "(" + suge.getFecha() + ")");
            return javaMail.enviarCorreo();            
        }
        else{
            return false;
        }
        
    }

    /**
     * envia un mensaje via twitter
     *
     * @param comentario
     * @return estado de envio mensaje de panico
     */
    public boolean enviarPanico(String comentario) {
        if(analisisTexto(TWITTER, comentario,"",ventanaPanico)){
            obtnerUbicacion(ventanaPanico);
            for (Usuario u : usuarios) {
                if (u.obtenerAlias().equals(usuarioAlias)) {

                    if (u.enviarPanico(comentario)) {
                        Twitter4J twitter = new Twitter4J();
                        twitter.setTweet(comentario);
                        return twitter.twittear(lugar);
                    }

                }
            }            
        }
        
        return false;
    }

    /**
     * envia reporte de infraccion
     *
     * @param descripcion de la infraccion
     * @param ruta1 evidencia fotografica
     * @param ruta2 evidencia video
     * @return
     */
    public boolean enviarReporte(String descripcion, String ruta1, String ruta2) {

        if(analisisTexto(COMEN_DENUN, descripcion, "", ventanaInfraccion)){
            if (ruta1.equals("") && ruta2.equals("")) {
                for (Usuario u : usuarios) {
                    if (u.obtenerAlias().equals(usuarioAlias)) {
                        if (u.registrarDenuncia(descripcion, ventanaInfraccion.getIdNorma())) {
                            JavaMail javaMailAdjunto = new JavaMail(emailPCNP, "appcodigopolicia.com", descripcion, emailPCNP, ("Infracción del ar.: " + ventanaInfraccion.getIdNorma() + "-" + u.obtenerEmail()));
                            return javaMailAdjunto.enviarCorreo();
                        }
                    }

                }
            } else {
                for (Usuario u : usuarios) {
                    if (u.obtenerAlias().equals(usuarioAlias)) {
                        if (u.registrarDenuncia(ruta1, ventanaInfraccion.getIdNorma())) {
                            JavaMail javaMailAdjunto = new JavaMail(emailPCNP, "appcodigopolicia.com", descripcion, emailPCNP, ("Infracción del ar.: " + ventanaInfraccion.getIdNorma() + "-" + u.obtenerEmail()));
                            return javaMailAdjunto.enviarCorreoAdjunto(ruta1, ruta2);
                        }
                    }

                }
            }            
        }
        

        return false;

    }

    /**
     * crear quiz
     *
     * @return quiz creado
     */
    public Quiz hacerQuiz() {
        return new Quiz();
    }

    /**
     * inicia el programa de Codigo de Policia
     */
    public void iniciarProgramaCNP() {
        inicializarVentanas();
        ventanaMenu.setVisible(true);
    }

    /**
     * obtener mapa de cais ubicando ubicacion del usuario
     *
     * @return mapa
     */
    public MapView obtenerMapaCais() {

        MapaCais mapaC = new MapaCais();
        //posicion por defecto plaza de bolivar
        double lat = 4.5981206;
        double lon = -74.0760435;

        if (latitud != 0 || longitud != 0) {
            lat = latitud;
            lon = longitud;
        }

        mapaC.generarMapa(lat, lon);
        if (latitud != 0 || longitud != 0) {
            posCaiCercano = mapaC.caiMasCercano(lat, lon);
        }

       

        return mapaC;
    }

    /**
     * obtener unciacion del usario
     *
     * @param ventana ventana en donde se ejecuta la ubicacion
     * @return si se obtvo o no la ubicacion
     */
    public boolean obtnerUbicacion(JFrame ventana) {

        Geolocalizar geo = new Geolocalizar();
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(ventana, "Desea compartir su ubicación", "Confirmacion Ubicación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            if (!geo.capturarCoordenadas()) {
                JOptionPane.showMessageDialog(ventana, "No se ha podido obtener su ubicación, intentelo mas tarde", "Estado mensaje", JOptionPane.WARNING_MESSAGE);

                return false;
            } else {
                latitud = Double.parseDouble(geo.getLatitud());
                longitud = Double.parseDouble(geo.getLongitud());
                lugar = geo.getLugar();

                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * actulizar dadtos cai cercano
     *
     * @return infromación
     */
    public String actualizarCaiCercano() {
        String dir, tel, nombre, t;
        obtenerMapaCais(); //// line arreglo 777777777777777777777777777777777777777777777777777777777
        
        if (MapaCais.datosCais.size() == 0) {
            nombre = "CAI ROSARIO";
            dir = "AV JIMENEZ NO. 5-00";
            tel = "2860744";

        } else {
            nombre = MapaCais.datosCais.get(posCaiCercano)[0];
            dir = MapaCais.datosCais.get(posCaiCercano)[1];
            tel = MapaCais.datosCais.get(posCaiCercano)[2];
        }

        t = "<HTML><B>" + nombre + "</B>"
                + "<BR><I>DIRECCIÓN:</I> " + dir
                + "<BR><I>TELEFONO:</I> " + tel + "</HTML>";
        return t;
    }

    /**
     * guardar los datos cambidados duante la sesion
     */
    public void guardarDatos() {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("src/Datos/Usuarios.dat"));
            guardar.writeObject(usuarios);
            guardar.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(ventanaMenu, e, "Estado datos", JOptionPane.ERROR_MESSAGE);
        }
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("src/Datos/CodPol.dat"));
            guardar.writeObject(codigoPolicia);
            guardar.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(ventanaMenu, e, "Estado datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * recupera los datos
     */
    public void recuperarDatos() {
        try {
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("src/Datos/Usuarios.dat"));
            usuarios = (ArrayList<Usuario>) recuperar.readObject();
            for (Usuario u : usuarios) {
                System.out.println(u.obtenerAlias());
            }
            recuperar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventanaMenu, e, "Estado datos", JOptionPane.ERROR_MESSAGE);

        }
        try {
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("src/Datos/CodPol.dat"));
            codigoPolicia = (CodPol) recuperar.readObject();
            recuperar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventanaMenu, e, "Estado datos", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * analiza los textos que se van a enviar como comentario, mensjae de tiwiter(panico), sugerencia
     * @param n podra ser TWITTER, SUGERENCIA o COMENTARIO
     * @param texto 
     * @param correo
     * @return 
     */
    public boolean analisisTexto(int n, String texto, String correo, JFrame ventana) {
        
        if(texto.equals("")||texto.charAt(0)==' '){
            JOptionPane.showMessageDialog(ventana, "Por favor el contenido del mensaje no debe estar vacio", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        switch(n){
            case TWITTER:
                if(texto.length()>100){
                    JOptionPane.showMessageDialog(ventana, "El mensaje debe ser menor o igula a 100 caracteres", "Error", JOptionPane.WARNING_MESSAGE);                    
                    return false;
                }
                return true;
            case SUGERENCIA:
                int cont=0,cont1=0;
                boolean estado=true;
                String aux=correo.trim();
                // no vacia, la primera no espacio, y no debeb tener espacios
                if(!aux.equals(correo)){
                    estado = estado && false;
                }
                // verficar que halla un @ y un .
                for(int i=0;i<correo.length();i++){
                    if(correo.charAt(i) =='@'){
                        cont++;
                    }
                    if(correo.charAt(i) =='.'){
                        cont1++;
                    }            
                }
                if(cont!=1||cont1!=1){
                        estado = estado && false;
                }
                if(!estado){
                    JOptionPane.showMessageDialog(ventana, "Por favor el correo no debe estar vacio, ademas debe corresponder a un correo real", "Error", JOptionPane.WARNING_MESSAGE);
                }
                return estado;
            
            default:
                return true;               
        }
    }
    
    /**
     * cambiar contraseña
     * @param u usuario
     * @param contra contraseña
     * @param confirm confrimacion correo
     * @return 
     */
    public boolean cambiarContrasenia(Usuario u, String contra, String confirm){
        return u.cambiarContrasenia(contra, confirm);
    }
    
    public void cerrarSesion(){
        this.usuarioAlias = "Invitado";        
    }

    /**
     * Inicializa las ventanas con sus respectivos parametros
     */
    public void inicializarVentanas() {
        this.ventanaMenu.inicioVentana(ventanaSesion, ventanaRegistro, ventanaNorma, ventanaQuiz, ventanaSugerencia, ventanaInfraccion, ventanaPanico, ventanaUbicacion, ventanaPerfil);
        this.ventanaRegistro.inicioVentana(ventanaMenu, ventanaSesion, ventanaPanico, ventanaInfraccion, this, ventanaPerfil);
        this.ventanaSesion.inicioVentana(ventanaMenu, ventanaRegistro, ventanaInfraccion, ventanaPanico, this, ventanaPerfil);
        this.ventanaInfraccion.inicioVentana(ventanaMenu, ventanaPanico, ventanaPerfil);
        this.ventanaPanico.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPerfil);
        this.ventanaNorma.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico, ventanaArticulo, ventanaEscogerDidactico, ventanaPerfil);
        this.ventanaDidactico.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico, ventanaComentario, ventanaEscogerDidactico, ventanaPerfil);
        this.ventanaEscogerDidactico.inicioVentana(ventanaMenu, ventanaInfraccion, ventanaPanico, ventanaDidactico, ventanaPerfil);
        this.ventanaArticulo.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaComentario, ventanaPerfil);
        this.ventanaComentario.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaArticulo, ventanaDidactico, ventanaPerfil);
        this.ventanaQuiz.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, this, ventanaPerfil);
        this.ventanaSugerencia.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaPerfil);
        this.ventanaUbicacion.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion, ventanaPerfil);
        this.ventanaPerfil.inicioVentana(ventanaMenu, ventanaPanico, ventanaInfraccion);
    }

    /**
     * actualiza el nombre del usuario en cada ventana
     */
    public void actualizarSesion() {
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
        ventanaUbicacion.actualizarSesion(usuarioAlias);
        ventanaPerfil.actualizarSesion(usuarioAlias);
    }

    public String obtenerAlias() {
        return this.usuarioAlias;
    }

}
