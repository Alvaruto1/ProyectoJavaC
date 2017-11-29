/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Logica.MapaCais;
import Logica.ProgramaCNP;
import Logica.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Ventana Main de interfaz gráfica
 * @author Nicolas Herrera y Alvaro Niño
 */
public class NewMain {
    
    //Atributos
    
    /**
     * Objetos de programaCNP
     */
    ProgramaCNP programa;
    ArrayList <Usuario> usuario = new ArrayList();
    
    IniciarSesion ventana1= new IniciarSesion();
    Registro ventana2= new Registro();            
    MenuPrincipal ventana3= new MenuPrincipal(programa);
    
    //Métodos
    
    /**
     * Método constructor
     */
    public NewMain(){
        prueba2();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewMain();
        
        
    }
    /**
     * Método de prueba
     */
    public void prueba(){
        
        DefaultPieDataset data = new DefaultPieDataset();
        String infraccion1= "Riñas en público";
        String infraccion2= "Irrespeto a la autoridad";
        String infraccion3= "Consumo de bebidas embriagantes por menores de edad";
        String infraccion4= "No recoger las heces de las mascotas";
        String infraccion5= "Comer en transporte público";
        String infraccion6= "Invadir propiedad privada";
        String infraccion7= "Daño al espacio público";
        /*String infraccion1= ("Artículo #"+(analizarInfraccionesFrecuentes().get(0).getId()));
        String infraccion2= ("Artículo #"+(analizarInfraccionesFrecuentes().get(1).getId()));
        String infraccion3= ("Artículo #"+(analizarInfraccionesFrecuentes().get(2).getId()));
        String infraccion4= ("Artículo #"+(analizarInfraccionesFrecuentes().get(3).getId()));
        String infraccion5= ("Artículo #"+(analizarInfraccionesFrecuentes().get(4).getId()));
        String infraccion6= ("Artículo #"+(analizarInfraccionesFrecuentes().get(5).getId()));*/
        
        
        /*data.setValue(infraccion1,analizarInfraccionesFrecuentes().get(0).getAcuDenuncias());
        data.setValue(infraccion2,analizarInfraccionesFrecuentes().get(1).getAcuDenuncias());
        data.setValue(infraccion3,analizarInfraccionesFrecuentes().get(2).getAcuDenuncias());
        data.setValue(infraccion4,analizarInfraccionesFrecuentes().get(3).getAcuDenuncias());
        data.setValue(infraccion5,analizarInfraccionesFrecuentes().get(4).getAcuDenuncias());
        data.setValue(infraccion6,analizarInfraccionesFrecuentes().get(5).getAcuDenuncias());*/
        data.setValue(infraccion1,100);
        data.setValue(infraccion2,400);
        data.setValue(infraccion3,150);
        data.setValue(infraccion4,200);
        data.setValue(infraccion5,400);
        data.setValue(infraccion6,600);
        
        
        JFreeChart grafica = ChartFactory.createPieChart3D("Infracciones frecuentes", data,true,true,false);
        
        ChartPanel contenedor = new ChartPanel(grafica);
        //JOptionPane.showMessageDialog(null,contenedor,"CÓDIGO NACIONAL DE POLICIA",JOptionPane.PLAIN_MESSAGE,null);
        JFrame ventana = new JFrame();
        ventana.add(contenedor);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.pack();
        
        
    }
    
    /**
     * Segunda prueba
     */
    public void prueba2(){
        MapaCais map= new MapaCais();
        map.generarMapa(4.6706622,-74.0527601);
        JFrame ventana = new JFrame();
        ventana.add(map);
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        
    }
    
}
