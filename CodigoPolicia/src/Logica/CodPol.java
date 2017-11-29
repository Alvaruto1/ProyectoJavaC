package Logica;
import java.io.Serializable;
import java.util.*;

/**
 * Clase que contiene el código nacional de policía y convivencia en todas sus formas
 * @author Nicolas Herrera y Alvaro Niño
 */
public class CodPol implements Serializable{

    //Atributos
    
    /**
     * normas del código de policia
     */
    private ArrayList <Norma> normas = new ArrayList <Norma>(); 
    
    /**
     * ruta del pdf
     */
    private String rutaPdf = "src/codigoPDF/codPN.pdf";
    
    /**
     * constante de verificación si es boletin de la norma
     */
    public final static int BOLETIN = 0;
    
    /**
     * constante de verificacion si es caricatura de la norma
     */
    public final static int CARICATURA = 1;
    
    /**
     * constante de verificacion si es leyenda de la norma
     */
    public final static int LEYENDA = 2;
    /**
     * constante de verificacion si es título
     */
    public final static int TITULO = 3;
    /**
     * constante de verificación si es tema
     */
    public final static int TEMA = 4;
    
    //Métodos
    
    /**
     * Método constructor
     */
    public CodPol() {
        //adición de los artículos 
        new InicializarDatos().inicializarNormas(normas);    
    }

    /**
     * consulta del código completo la ruta del pdf
     * @return ruta del codigo en pdf
     */
    public String consultar() {
        return this.rutaPdf;        
    }

    /**
     * consulta por norma según opción (caricatura, boletin o leyenda)
     * @param id de la norma # articulo
     * @param opcion dada por ser una caricatura, boletin o leyenda
     * @return retorna el texto, o caricatura o boletin de la norma
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
                        return norma.mostrarBoletin();
                    case TITULO:
                        return norma.mostrarTitulo(); 
                    case TEMA:
                        return norma.mostrarTema(); 
                    

                } 
                
                break;
            }            
        }
        
        return "N.D";       
    }
    
    /**
     * registra comentario en la norma
     * @param t descripción del comentario de la norma
     * @param email correo del usuario
     * @param id identificador
     */
    public void registrarComentario(String t, String email, String id) {    
        
        for(Norma n: normas){           
            if(id.equals(n.getId())){
                n.registrarComentario(t, email);                
                break;        
                
                
            }
            
        }
        
    }
    
    /**
     * devuelve la norma
     * @param id de la norma
     * @return una norma
     */
    public Norma devolverNorma(String id){
        for(Norma n: normas){
            if(n.getId().equals(id)){
                return n;
            }            
        }
        return null;
    }
    /**
     * Metodo que devuelve todas las normas
     * @return el conjunto de todas las normas
     */
    public ArrayList<Norma> getNormas() {
        return normas;
    }
    
    
    
}