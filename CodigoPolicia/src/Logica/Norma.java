package Logica;


/**
 * 
 */
public class Norma {

    /**
     * Default constructor
     */
    public Norma() {
    }

    /**
     * id de la norma que hace referencia de esta manera, tccaa 
     * t: #titulo, cc: #capitulo, aa: #articulo
     */
    private String id;

    /**
     * 
     */
    private String tema;

    /**
     * 
     */
    private String boletin;

    /**
     * ruta a archivo pdf de la norma caricatura
     */
    private String caricatura;

    /**
     * precio o valor de la multa de la norma     
     */
    private String precioMulta;

    /**
     * cantidad de consultas que se han hecho sobre esta norma
     */
    private int consultas;

    /**
     * comentarios realizados por los usuarios sobre la norma
     */
    private Comentario[] comentarios;

    /**
     * @return
     */
    public void mostrarBoletin() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void mostrarCaricatura() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void aumentarConsultas() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return "";
    }

    /**
     * @param t 
     * @param email 
     * @return
     */
    public void registrarComentario(String t, String email) {
        // TODO implement here
        
    }

}