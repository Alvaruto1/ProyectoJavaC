/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

/**
 *
 * @author alvar
 */
public class NewMain {
    
    IniciarSesion ventana1= new IniciarSesion();
    Registro ventana2= new Registro();            
    MenuPrincipal ventana3= new MenuPrincipal();
    
    public NewMain(){
        prueba();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewMain();
        
        
    }
    public void prueba(){
        ventana1.ingresarVentana(ventana3);
        ventana2.ingresarVentana(ventana3);
        ventana3.ingresarVentana(ventana1,ventana2);
        
        ventana3.setVisible(true);
        
        
    }
    
}
