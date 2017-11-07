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
     */
    public Norma(String id, String boletin, String caricatura, String tema) {
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

    /** registra un comentario sobre la norma
     * @param t describcion comentario
     * @param email del usuario 
     * @return estado de registro
     */
    public boolean registrarComentario(String t, String email) {
        Comentario com= new Comentario();
        boolean estado = true;
        //analisis texto
        if(t.equals("") || t.charAt(0)==' '){
            estado = estado && false;                    
        }
        
        // analisis email
        int cont=0,cont1=0;        
        // no vacia, la primera no espacio, y no debeb tener espacios
        if(email.length()!=0 || email.charAt(0)!=' ' || !email.trim().equals(email)){
            estado = estado && false;
        }
        // verficar que halla un @ y un .
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) =='@'){
                cont++;
            }
            if(email.charAt(i) =='.'){
                cont1++;
            }
            if(cont>1||cont1>1){
                estado = estado && false;
            }
        }
        
        if (estado) {
            com.registrarComentario(t, email);
            comentarios.add(com);
        } 
        
        return estado;
        
            
    }

}