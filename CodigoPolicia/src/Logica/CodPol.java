package Logica;
import java.util.*;

/**
 * 
 */
public class CodPol {

    /**
     * Default constructor
     */
    public CodPol() {
        //adicion de los articulos
        normas.add(new Norma("1", "texto articulo 1", "N.D", "N.D", "N.D", "N.D", "N.D"));
    }
    
    /**
     * normas del codigo de policia
     */
    private ArrayList <Norma> normas; 
    
    /**
     * ruta del pdf
     */
    private String rutaPdf;
    
    /**
     * cosntante de verificacion si es boletin de la norma
     */
    public final static int BOLETIN = 0;
    
    /**
     * cosntante de verificacion si es caricatura de la norma
     */
    public final static int CARICATURA = 1;
    
    /**
     * cosntante de verificacion si es leyenda de la norma
     */
    public final static int LEYENDA = 2;
    
    

    /**
     * consulta del codigo completo la ruta del pdf
     * @return ruta del codigo en pdf
     */
    public String consultar() {
        return this.rutaPdf;        
    }

    /**
     * consulta por norma segun opcion (caricatura, boletin o lyenda)
     * @param id de la norma # articulo
     * @param opcion dada por ser una caricatura, boletin o lyenda
     * @return retorna el texto, o caraictura o boletin de la norma
     */
    public String consultarNorma(String id, int opcion) {
        for (Norma norma : normas) {
            if(norma.getId().equals(id)){
                switch(opcion){
                    case LEYENDA:
                        return norma.mostrarLeyenda();
                    case CARICATURA:
                        return norma.mostrarCaricatura();
                    case BOLETIN:
                        return norma.mostrarCaricatura();           

                } 
                
                break;
            }            
        }
        
        return "N.D";       
    }
    
    /**
     * registra comentario en la norma
     * @param t descripcion del comentario de la norma
     * @param email correo de 
     * @param id 
     */
    public void registrarComentario(String t, String email, String id) {        
        for(Norma n: normas){
            if(n.getId().equals(id)){
                n.registrarComentario(t, email);                
            }
        }             
    }

}