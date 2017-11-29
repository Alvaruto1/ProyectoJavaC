package Logica;


import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Clase que se conecta con la API de twitter
 * @author Nicolas Herrera y Alvaro Niño
 */
public class Twitter4J {
    
    //Atributos
    
    private String tweet;
    private Twitter twitter;
    private twitter4j.Status status;
    private Paging pagina;
    
    /**
     * configura parametros iniciales de la clase twitter
     * @param lugar lugar
     * @throws TwitterException excepción
     */
    public void configurar(String lugar) throws TwitterException{
        
        
        
        
        
        //se instancia clase Twitter        
        twitter = new TwitterFactory().getInstance();
        
        
        //Se instancia la clase Paging
        pagina = new Paging();
        
        //Se puede actuzalia "Que esta pasando a traves del metodo Twitter.updateStatus()
        
        status = twitter.updateStatus(tweet+" "+lugar);
        
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Status getStatus() {
        return status;
    }

    
    /**
     * 
     * @param lugar lugar
     * @return estado
     */
    public boolean twittear(String lugar){
        try{
            // Si el numero de caracteres excede el maximo permitido (140) , entonces se lanza una excepcion
            if((tweet+lugar).length()>140){
                throw new Exception("¡El máximo de caracteres permitidos es de 140!");
            }
            try{
                // se llama el metodo de configurar para actualizar el que esta pasando
                configurar(lugar);
                //si tiene exito             
                tweet ="";      
                return true;
            }catch (Exception ex){
                //si no tiene exito
                
                return false;
            }
        }catch(Exception ex){            
            return false;
        }
        
        
    }
    
    
}
