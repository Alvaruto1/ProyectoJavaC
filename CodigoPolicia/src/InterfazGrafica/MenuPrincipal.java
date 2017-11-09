/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author alvar
 */
public class MenuPrincipal extends javax.swing.JFrame {
    IniciarSesion sesion;
    Registro registro;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public void actualizarSesion(String t){
        lblUsuario.setText(t);
    }
    public void inicioVentana(IniciarSesion venSesion, Registro venRegistro){
        this.sesion=venSesion;
        this.registro=venRegistro;
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
        lecQuizBtn = new javax.swing.JButton();
        normaBtn = new javax.swing.JButton();
        sugerenciasBtn = new javax.swing.JButton();
        inicSesiBtn = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        repInfBtn = new javax.swing.JButton();
        panicoBtn = new javax.swing.JButton();
        menuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

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
        jLabel1.setText("Menú Principal");

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

        lecQuizBtn.setBackground(new java.awt.Color(131, 184, 61));
        lecQuizBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lecQuizBtn.setForeground(new java.awt.Color(16, 67, 16));
        lecQuizBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leccion.png"))); // NOI18N
        lecQuizBtn.setText("Lecciones & Quices");
        lecQuizBtn.setDisabledIcon(null);
        lecQuizBtn.setDoubleBuffered(true);
        lecQuizBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lecQuizBtn.setPreferredSize(new java.awt.Dimension(180, 100));
        lecQuizBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lecQuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecQuizBtnActionPerformed(evt);
            }
        });

        normaBtn.setBackground(new java.awt.Color(131, 184, 61));
        normaBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        normaBtn.setForeground(new java.awt.Color(16, 67, 16));
        normaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/norma.png"))); // NOI18N
        normaBtn.setText("Normas");
        normaBtn.setDoubleBuffered(true);
        normaBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        normaBtn.setPreferredSize(new java.awt.Dimension(180, 100));
        normaBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        normaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normaBtnActionPerformed(evt);
            }
        });

        sugerenciasBtn.setBackground(new java.awt.Color(131, 184, 61));
        sugerenciasBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        sugerenciasBtn.setForeground(new java.awt.Color(16, 67, 16));
        sugerenciasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sugerencia.png"))); // NOI18N
        sugerenciasBtn.setText("Sugerencias");
        sugerenciasBtn.setDoubleBuffered(true);
        sugerenciasBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sugerenciasBtn.setPreferredSize(new java.awt.Dimension(180, 100));
        sugerenciasBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sugerenciasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugerenciasBtnActionPerformed(evt);
            }
        });

        inicSesiBtn.setBackground(new java.awt.Color(0, 153, 153));
        inicSesiBtn.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        inicSesiBtn.setForeground(new java.awt.Color(0, 51, 0));
        inicSesiBtn.setText("Iniciar Sesión");
        inicSesiBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicSesiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicSesiBtnMouseClicked(evt);
            }
        });
        inicSesiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicSesiBtnActionPerformed(evt);
            }
        });

        registrarBtn.setBackground(new java.awt.Color(0, 102, 0));
        registrarBtn.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(0, 51, 0));
        registrarBtn.setText("Registrarse");
        registrarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBtnMouseClicked(evt);
            }
        });
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(normaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lecQuizBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sugerenciasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117)
                .addComponent(inicSesiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(normaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lecQuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(sugerenciasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicSesiBtn)
                    .addComponent(registrarBtn))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 0));

        repInfBtn.setBackground(new java.awt.Color(0, 51, 0));
        repInfBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        repInfBtn.setForeground(new java.awt.Color(255, 255, 255));
        repInfBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infraccion.png"))); // NOI18N
        repInfBtn.setText("<html>Reportar<br>Infracción</html>");
        repInfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repInfBtnActionPerformed(evt);
            }
        });

        panicoBtn.setBackground(new java.awt.Color(0, 51, 0));
        panicoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panico.png"))); // NOI18N
        panicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panicoBtnActionPerformed(evt);
            }
        });

        menuBtn.setBackground(new java.awt.Color(51, 51, 51));
        menuBtn.setForeground(new java.awt.Color(255, 255, 255));
        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBtn.setDisabledIcon(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(repInfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panicoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(repInfBtn)
            .addComponent(panicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void lecQuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecQuizBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecQuizBtnActionPerformed

    private void normaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normaBtnActionPerformed

    private void sugerenciasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugerenciasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sugerenciasBtnActionPerformed

    private void inicSesiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicSesiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicSesiBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void panicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panicoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panicoBtnActionPerformed

    private void repInfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repInfBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repInfBtnActionPerformed

    private void inicSesiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicSesiBtnMouseClicked
        sesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicSesiBtnMouseClicked

    private void registrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseClicked
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarBtnMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicSesiBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JButton lecQuizBtn;
    private javax.swing.JButton menuBtn;
    private javax.swing.JButton normaBtn;
    private javax.swing.JButton panicoBtn;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JButton repInfBtn;
    private javax.swing.JButton sugerenciasBtn;
    // End of variables declaration//GEN-END:variables
}
