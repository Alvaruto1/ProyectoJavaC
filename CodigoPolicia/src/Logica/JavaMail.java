package Logica;
import java.util.Properties;
import javax.mail.Message;

import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {
    
    /**
     * usuario o correo de la cuenta gmail el que lo envia
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
     * confirguracion y nevio de correo
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
    
   
    
}
