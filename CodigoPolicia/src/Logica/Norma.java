package Logica;

import java.util.ArrayList;


/**
 * 
 */
public class Norma {

    /**
     * contructor parametrico crea y registra datos de una norma
     * @param id de la norma # articulo
     * @param boletin ruta del boletin de la norma
     * @param caricatura ruta de la caricatura de la norma
     * @param tema de la norma
     * @param multa de la norma
     */
    public Norma(String id, String boletin, String caricatura, String tema, String multa) {
        this.precioMulta = multa;
        this.id = id;
        this.caricatura = caricatura;
        this.boletin = boletin;
        this.tema = tema;        
    }

    /**
     * id de la norma # numero de articulo
     */
    private String id;

    /**
     * clasificaicon de la norma
     */
    private String tema;

    /**
     * ruta del boletin de la norma
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
    private int consultas = 0;

    /**
     * comentarios realizados por los usuarios sobre la norma
     */
    private ArrayList <Comentario> comentarios;

    /** retorna la ruta del boletin de la norma
     * @return ruta del boletin de la norma
     */
    public String mostrarBoletin() {
        return this.boletin;        
    }

    /** retorna la ruta de la caricatura de la norma
     * @return ruta de la caricatura de la norma
     */
    public String mostrarCaricatura() {
        return this.caricatura;
        
    }

    /**  
     * aumenta la cantidad de consultas
     */
    public void aumentarConsultas() {
        this.consultas +=1;        
    }

    /** retorna el id de la norma
     * @return id de la norma
     */
    public String getId() {
        return this.id;
    }

    

}