package Logica;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;

import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Clase en donde se realiza la conexión con Java mail para mandar correos
 * @author Nicolas Herrera y Alvaro Niño
 */
public class JavaMail {
    
    //Atributos
    
    /**
     * usuario o correo de la cuenta gmail del que lo envía
     */
    private static String usuario = "";
    /**
     * contraseña del usuario
     */
    private static String contrasenia = ""; 
    /**
     * mensaje o cuerpo del correo
     */
    private String mensaje = "";
    /**
     * destinatario del correo que se va enviar
     */     
    private String destinatario = "";
    /**
     * asunto del correo
     */
    private String asunto = "";
    
    //Métodos
    
    /**
     * constructor de la clase
     * @param usuario usuario o correo de la cuenta gmail el que lo envia
     * @param contrasenia contraseña del usuario
     * @param mensaje mensaje o cuerpo del correo
     * @param destinatario destinatario del correo que se va enviar
     * @param asunto asunto del correo
     */
    public JavaMail (String usuario, String contrasenia, String mensaje, String destinatario, String asunto){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.asunto = asunto;
                
    }
    
    /**
     * confirguración y envío de correo
     * @return si fue posible el envio o no
     */
    public boolean enviarCorreo(){
        // propiedades que funcionan clave: valor, las caules se pasan como parametros a sesion
        Properties props = new Properties();
        
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "25");
        props.setProperty("mail.smtp.starttls.enable", "true"); // seguirdad habilitada
        
        // auqtenticacion del usuario con su contrasenia
        Session sesion = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(usuario, contrasenia);
            }           
                        
        });
        
        //envio del mensaje 
        try {
            Message message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(mensaje);
            
            Transport.send(message);
            return true;
                   
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
            return false;
        
                    
            
        }
    }
    /**
     * Envío de correo con archivo adjunto
     * @param ruta1 Prueba
     * @param ruta2 Prueba
     * @return envío correo adjunto
     */
    public boolean enviarCorreoAdjunto(String ruta1, String ruta2){
        // propiedades que funcionan clave: valor, las caules se pasan como parametros a sesion
        Properties props = new Properties();
        
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "25");
        props.setProperty("mail.smtp.starttls.enable", "true"); // seguirdad habilitada
        
        // auqtenticacion del usuario con su contrasenia
        Session sesion = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(usuario, contrasenia);
            }           
                        
        });
        
        //envio del mensaje 
        try {
            BodyPart texto = new MimeBodyPart();
            texto.setText(mensaje);
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            if(!ruta1.equals("")){
                BodyPart adjunto1 = new MimeBodyPart();
                adjunto1.setDataHandler(new DataHandler(new FileDataSource((String)ruta1)));
                adjunto1.setFileName("foto");  
                multiParte.addBodyPart(adjunto1);
                System.out.println("entra foto");
            }
            
            if(!ruta2.equals("")){
                BodyPart adjunto2 = new MimeBodyPart();
                adjunto2.setDataHandler(new DataHandler(new FileDataSource((String)ruta2)));
                adjunto2.setFileName("video");
                multiParte.addBodyPart(adjunto2);
                System.out.println("entra video");
            }
            
            
            
            Message message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setContent(multiParte);
            
            Transport.send(message);
            return true;
                   
        }catch (MessagingException e){
            System.out.println("Error: "+ e.getMessage());
            return false;
        
                    
            
        }
        
    
        
    }
   }
