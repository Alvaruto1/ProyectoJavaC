package Logica;

import java.util.ArrayList;

/**
 * 
 */
public class Norma {

    /**
     * contructor parametrico crea y registra datos de una norma
     * @param id de la norma # articulo
     * @param texto de la norma articulo 
     * @param tema de la norma
     * @param multa de la norma
     * @param titulo titulo de la norma
     */
    public Norma(String id, String texto, String tema, String multa, String titulo) {
        this.precioMulta = multa;
        this.id = id;
        this.texto = texto;
        this.caricatura = "/src/img/caricatura"+id+".pdf";
        this.boletin = "/src/img/boletin"+id+".pdf";
        this.tema = tema;   
        this.titulo = titulo;
    }

    /**
     * id de la norma # numero de articulo
     */
    private String id;    
    /**
     * descripcion de la norma articulo
     */
    private String texto;    
    /**
     * titulo articulo
     */
    private String titulo;
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
    
/** retorna la descipcion de la norma
     * @return la descipcion de la norma
     */
    public String mostrarLeyenda() {
        return this.texto;        
    }

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
    
    /**
     * Registro de un comentario a la norma
     * @param t descripcion del comentario
     * @param email correo del usuario
     */
    public void registrarComentario(String t, String email) {
        Comentario c = new Comentario();
        c.registrarComentario(t,email); 
        comentarios.add(c);             
    }

    

}