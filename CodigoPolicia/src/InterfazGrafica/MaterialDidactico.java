package InterfazGrafica;

import Logica.CodPol;
import Logica.ProgramaCNP;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 * Ventana Material Didáctico
 * @author Nicolas Herrera y Alvaro Niño
 */
public class MaterialDidactico extends javax.swing.JFrame {
    
    //Atributos
    
    /**
     * Ventana menu pricipal
     */    
    private MenuPrincipal menu;     
    /**
     * ventana infraccion
     */
    private ReportarInfraccion infraccion;
    /**
     * Ventana del panico
     */    
    private Panico panico;  
    /**
     * Ventana de comentarios
     */    
    private Comentarios comentario; 
    /**
     * ventana perfil
     */
    private PerfilUsuario perfil;
    /**
     * Ventana de escoger material didactico
     */    
    private EscogerMaterialDidactico escoger;
    /**
     * programa codigo de policia
     */
    private ProgramaCNP programa;
    /**
     * id de la norma activa
     */
    private String idNorma="1";
    
    //Métodos
    
    /**
     * constructor
     * @param p programa
     */
    public MaterialDidactico(ProgramaCNP p) {
        programa = p;
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
     * @param com ventana comentario 
     * @param es escoger material didactico
     * @param perfil ventana perfil
     */
    public void inicioVentana(MenuPrincipal menu, ReportarInfraccion i , Panico panico, Comentarios com, EscogerMaterialDidactico es, PerfilUsuario perfil){
        this.escoger = es;
        this.comentario = com;              
        this.menu = menu;        
        this.infraccion = i;
        this.panico = panico;
        this.perfil = perfil;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnEnviarComentario = new javax.swing.JButton();
        lblMaterialDidactico = new javax.swing.JLabel();
        btnVerComentarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        lblArticulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnRepInf = new javax.swing.JButton();
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
        jLabel1.setText("Material Didáctico");

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

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 67, 16));
        jLabel5.setText("Enviar Comentario ");

        btnAtras.setBackground(new java.awt.Color(131, 184, 61));
        btnAtras.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(16, 67, 16));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Atras.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setDoubleBuffered(true);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPreferredSize(new java.awt.Dimension(180, 100));
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEnviarComentario.setBackground(new java.awt.Color(0, 102, 0));
        btnEnviarComentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enviar.png"))); // NOI18N
        btnEnviarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarComentarioActionPerformed(evt);
            }
        });

        lblMaterialDidactico.setBackground(new java.awt.Color(255, 255, 255));
        lblMaterialDidactico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaterialDidacticoMouseClicked(evt);
            }
        });

        btnVerComentarios.setBackground(new java.awt.Color(131, 184, 61));
        btnVerComentarios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVerComentarios.setForeground(new java.awt.Color(16, 67, 16));
        btnVerComentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verComentarios.png"))); // NOI18N
        btnVerComentarios.setText("Ver Comentarios");
        btnVerComentarios.setDoubleBuffered(true);
        btnVerComentarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerComentarios.setPreferredSize(new java.awt.Dimension(180, 100));
        btnVerComentarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerComentariosActionPerformed(evt);
            }
        });

        txtComentarios.setBackground(new java.awt.Color(153, 255, 102));
        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        jScrollPane1.setViewportView(txtComentarios);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        lblArticulo.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblArticulo.setForeground(new java.awt.Color(16, 67, 16));
        lblArticulo.setText("Artículo 1. Nombre del articulo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnviarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMaterialDidactico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVerComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaterialDidactico, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarComentario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnVerComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 0));

        btnRepInf.setBackground(new java.awt.Color(0, 51, 0));
        btnRepInf.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnRepInf.setForeground(new java.awt.Color(255, 255, 255));
        btnRepInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infraccion.png"))); // NOI18N
        btnRepInf.setText("<html>Reportar<br>Infracción</html>");
        btnRepInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepInfActionPerformed(evt);
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
                .addComponent(btnRepInf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRepInf)
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

    private void btnPanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanicoActionPerformed
        panico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPanicoActionPerformed

    private void btnRepInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepInfActionPerformed
        infraccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRepInfActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        escoger.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnVerComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerComentariosActionPerformed
        comentario.setVisible(true);
        this.setVisible(false);
        Comentarios.ventanaAnterior=Comentarios.VEN_DIDACTICO;
        
        idNorma=EscogerMaterialDidactico.id;
        
    }//GEN-LAST:event_btnVerComentariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        actualizarSesion(programa.obtenerAlias());
        mostrarMaterial();
        idNorma=EscogerMaterialDidactico.id;
        if("Invitado".equals(programa.obtenerAlias())){
            txtComentarios.setEnabled(false);
            btnEnviarComentario.setEnabled(false);
        }
        else{
            txtComentarios.setEnabled(true);
            btnEnviarComentario.setEnabled(true);
        } 
    }//GEN-LAST:event_formWindowActivated

    private void lblMaterialDidacticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaterialDidacticoMouseClicked
        ImageIcon icon = new ImageIcon(programa.consultarNorma(EscogerMaterialDidactico.id, EscogerMaterialDidactico.tipoDidactico));
        JLabel imagen= new JLabel(icon);
        JScrollPane panel = new JScrollPane(imagen);        
        panel.setPreferredSize(new Dimension(900, 600));               
        JOptionPane.showMessageDialog(this,panel,"Material Didactico Articulo "+EscogerMaterialDidactico.id,JOptionPane.PLAIN_MESSAGE,null);        
    }//GEN-LAST:event_lblMaterialDidacticoMouseClicked

    private void btnEnviarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarComentarioActionPerformed
        programa.comentarNorma(txtComentarios.getText(), idNorma);         
        txtComentarios.setText("");
    }//GEN-LAST:event_btnEnviarComentarioActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        if(!programa.obtenerAlias().equals("Invitado")){
            perfil.setVisible(true);
            this.setVisible(false);            
        }
    }//GEN-LAST:event_lblUsuarioMouseClicked
    
    /**
     * redimensiona imagen del material idactico y lo muestra en pantalla
     */
    private void mostrarMaterial(){
        lblArticulo.setText("Articulo "+EscogerMaterialDidactico.id+". "+programa.consultarNorma(EscogerMaterialDidactico.id, CodPol.TITULO));
        ImageIcon icon = new ImageIcon(programa.consultarNorma(EscogerMaterialDidactico.id, EscogerMaterialDidactico.tipoDidactico));
        Image imagen = icon.getImage();
        if(EscogerMaterialDidactico.tipoDidactico == CodPol.BOLETIN){
            imagen=imagen.getScaledInstance(120,-1,Image.SCALE_DEFAULT);
        }
        else{
            imagen=imagen.getScaledInstance(250,-1,Image.SCALE_DEFAULT);
        }
        
        icon = new ImageIcon(imagen);        
        lblMaterialDidactico.setIcon(icon);
        lblMaterialDidactico.setHorizontalAlignment(JLabel.CENTER);
    }
    
    /*
    getter Id norma
    */
    public String getIdNorma() {
        return idNorma;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviarComentario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPanico;
    private javax.swing.JButton btnRepInf;
    private javax.swing.JButton btnVerComentarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblMaterialDidactico;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtComentarios;
    // End of variables declaration//GEN-END:variables
}
