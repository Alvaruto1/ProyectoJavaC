package InterfazGrafica;

import Logica.ProgramaCNP;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 * Ventana Normas
 * @author Nicolas Herrera y Alvaro Niño
 */
public class Normas extends javax.swing.JFrame {
    
    //Atributos
    
    /**
     * Ventana menu pricipal
     */    
    private MenuPrincipal menu; 
    /**
     * Ventana registro
     */  
    private Registro registro; 
    /**
     * ventana infraccion
     */
    private ReportarInfraccion infraccion;
    /**
     * Ventana del panico
     */    
    private Panico panico;
    /**
     * ventana perfil
     */
    private PerfilUsuario perfil;
    /**
     * Ventana articulos
     */    
    private Articulos articulo;
    /**
     * Ventana material didactico
     */    
    private EscogerMaterialDidactico escogerDidactico;
     /**
     * programa cdigo de policia
     */    
    private ProgramaCNP programa;
    
    //Métodos
    
    /**
     * Constructor
     * @param programa programa
     */
    public Normas(ProgramaCNP programa) {  
        this.programa = programa;
        initComponents();
        this.setLocationRelativeTo(null);
        cerrarVentanaSecundaria();
    }
    /**
     * oculta la ventana secundaria y muestra el menu principal
     */
    public void cerrarVentanaSecundaria(){
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                menu.setVisible(true);
            }
        });
        
    }
    
    /**
     * actualiza el nombre del usuario en la ventana
     * @param t nombre del usuario
     */    
    public void actualizarSesion(String t){
        lblUsuario.setText(t);
    }
    
    /**
     * inicia la ventana con sus respectivos parametros
     * @param menu principal     
     * @param i ventana infraccion     
     * @param panico ventana panico 
     * @param a artículo
     * @param m menú
     * @param perfil ventana perfil
     */
    public void inicioVentana(MenuPrincipal menu, ReportarInfraccion i , Panico panico, Articulos a, EscogerMaterialDidactico m, PerfilUsuario perfil){
        this.escogerDidactico = m;
        this.articulo = a;       
        this.menu = menu;        
        this.infraccion = i;
        this.panico = panico;
        this.perfil = perfil;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnMaterialDidactico = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        btnDescargarPDF = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        BtnRepInf = new javax.swing.JButton();
        btnPanico = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 704));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel2.setText("<html>CÓDIGO NACIONAL DE POLICÍA <br><center>Y CONVIVENCIA</html>");

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Usuario:");

        lblUsuario.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        lblUsuario.setText("invitado");
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(lblUsuario))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(131, 184, 61));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 67, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Normas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(131, 184, 61));

        btnMaterialDidactico.setBackground(new java.awt.Color(131, 184, 61));
        btnMaterialDidactico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnMaterialDidactico.setForeground(new java.awt.Color(16, 67, 16));
        btnMaterialDidactico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MaterialDidactico.jpeg"))); // NOI18N
        btnMaterialDidactico.setText("Material Didáctico");
        btnMaterialDidactico.setDoubleBuffered(true);
        btnMaterialDidactico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaterialDidactico.setPreferredSize(new java.awt.Dimension(180, 100));
        btnMaterialDidactico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMaterialDidactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialDidacticoActionPerformed(evt);
            }
        });

        btnArticulos.setBackground(new java.awt.Color(131, 184, 61));
        btnArticulos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnArticulos.setForeground(new java.awt.Color(16, 67, 16));
        btnArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Artículos.png"))); // NOI18N
        btnArticulos.setText("Artículos");
        btnArticulos.setDoubleBuffered(true);
        btnArticulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArticulos.setPreferredSize(new java.awt.Dimension(180, 100));
        btnArticulos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });

        btnDescargarPDF.setBackground(new java.awt.Color(131, 184, 61));
        btnDescargarPDF.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnDescargarPDF.setForeground(new java.awt.Color(16, 67, 16));
        btnDescargarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visualizarCodigo.png"))); // NOI18N
        btnDescargarPDF.setText("Visualizar Código");
        btnDescargarPDF.setDoubleBuffered(true);
        btnDescargarPDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDescargarPDF.setPreferredSize(new java.awt.Dimension(180, 100));
        btnDescargarPDF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDescargarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaterialDidactico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDescargarPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(btnArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnMaterialDidactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnDescargarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 0));

        BtnRepInf.setBackground(new java.awt.Color(0, 51, 0));
        BtnRepInf.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        BtnRepInf.setForeground(new java.awt.Color(255, 255, 255));
        BtnRepInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infraccion.png"))); // NOI18N
        BtnRepInf.setText("<html>Reportar<br>Infracción</html>");
        BtnRepInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepInfActionPerformed(evt);
            }
        });

        btnPanico.setBackground(new java.awt.Color(0, 51, 0));
        btnPanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panico.png"))); // NOI18N
        btnPanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanicoActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMenu.setDisabledIcon(null);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(BtnRepInf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnRepInf)
            .addComponent(btnPanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaterialDidacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialDidacticoActionPerformed
        escogerDidactico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMaterialDidacticoActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        articulo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void btnDescargarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarPDFActionPerformed
        visualizarCodPDF();
    }//GEN-LAST:event_btnDescargarPDFActionPerformed

    private void btnPanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanicoActionPerformed
        panico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPanicoActionPerformed

    private void BtnRepInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepInfActionPerformed
        infraccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRepInfActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        if(!programa.obtenerAlias().equals("Invitado")){
            perfil.setVisible(true);
            this.setVisible(false);            
        }
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        actualizarSesion(programa.obtenerAlias());
    }//GEN-LAST:event_formWindowActivated

    private void visualizarCodPDF(){
        SwingController controlador = new SwingController();        
        SwingViewBuilder fabrica = new SwingViewBuilder(controlador);
        JPanel visualPanel = fabrica.buildViewerPanel();
        
        controlador.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(controlador.getDocumentViewController()));
        controlador.openDocument(programa.consultarTodo());
        JPanel panel = new JPanel();
        visualPanel.setPreferredSize(new Dimension(900, 600));
        panel.setPreferredSize(new Dimension(900, 600)); 
        panel.add(visualPanel);
        JOptionPane.showMessageDialog(this,panel,"Código de Policia",JOptionPane.PLAIN_MESSAGE,null);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRepInf;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnDescargarPDF;
    private javax.swing.JButton btnMaterialDidactico;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPanico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
