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
        new InicializarDatos().inicializarNormas(normas);    
    }
    
    /**
     * normas del codigo de policia
     */
    private ArrayList <Norma> normas = new ArrayList <Norma>(); 
    
    /**
     * ruta del pdf
     */
    private String rutaPdf = "src/codigoPDF/codPN.pdf";
    
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
     * cosntante de verificacion si es titulo
     */
    public final static int TITULO = 3;
    /**
     * cosntante de verificacion si es tema
     */
    public final static int TEMA = 4;
    
    

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
     * @param t descripcion del comentario de la norma
     * @param email correo de 
     * @param id 
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