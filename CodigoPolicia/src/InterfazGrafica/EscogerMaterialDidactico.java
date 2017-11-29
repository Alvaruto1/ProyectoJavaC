package InterfazGrafica;

import Logica.CodPol;
import Logica.InicializarDatos;
import Logica.ProgramaCNP;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JFrame;

/**
 * Ventana Escoger Material Didáctico
 * @author Nicolas Herrera y Alvaro Niño
 */
public class EscogerMaterialDidactico extends javax.swing.JFrame {
    
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
     * Ventana material didactico
     */    
    private MaterialDidactico didactico;
    /**
     * Ventana perfil
     */
    private PerfilUsuario perfil;
    /**
     * programa codigo de policia
     */    
    private ProgramaCNP programa;
    /**
     * id de articulo esocogido
     */
    public static String id = "1";
    /**
     * tipo escogido de material didactico
     */
    public static int tipoDidactico = CodPol.BOLETIN;
    
    /**
     * Titulos Libro/ Titulo/ Capitulo /Articulo
     */
    private ArrayList <String> libro = new ArrayList <String>();
    private ArrayList <ArrayList<String>> titulo = new ArrayList <ArrayList<String>>();
    private ArrayList <ArrayList<ArrayList<String>>> capitulo = new ArrayList <ArrayList<ArrayList<String>>>();    
    private String[][][][] articulo = new String[3][15][5][243]; 
    
    //Métodos
    
    /**
     * constructor
     * @param p programa
     */
    public EscogerMaterialDidactico(ProgramaCNP p) {
        this.programa = p;
        inicializarArticulo();
        initComponents();        
        groupbtnEscogerMD.add(rbtnBoletin);
        groupbtnEscogerMD.add(rbtnCaricatura);
        this.setLocationRelativeTo(null);
        cerrarVentanaSecundaria();
        habilitarComponentes(false);
        btnVerMaterialDidactico.setEnabled(false);
        
        
    }
    
     /**
     * Iniciliza la matriz de articulos, y coloca valores de filtros
     */
    public void inicializarArticulo(){
        new InicializarDatos().inicializarFiltros(programa, articulo, capitulo, titulo, libro);          
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
     * @param m ventana material didactico    
     * @param perfil Ventana perfil 
     */
    public void inicioVentana(MenuPrincipal menu, ReportarInfraccion i , Panico panico, MaterialDidactico m, PerfilUsuario perfil){
        this.didactico = m;      
        this.menu = menu;        
        this.infraccion = i;
        this.panico = panico;
        this.perfil = perfil;
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupbtnEscogerMD = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnVerMaterialDidactico = new javax.swing.JButton();
        rbtnCaricatura = new javax.swing.JRadioButton();
        rbtnBoletin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbxLibro = new javax.swing.JComboBox<>();
        cbxTitulo = new javax.swing.JComboBox<>();
        cbxCapitulo = new javax.swing.JComboBox<>();
        cbxTema = new javax.swing.JComboBox<>();
        cbxArticulo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btnRepInf = new javax.swing.JButton();
        btnPanico = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

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
        jLabel1.setText("Escoger Material Didáctico");

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

        btnVerMaterialDidactico.setBackground(new java.awt.Color(131, 184, 61));
        btnVerMaterialDidactico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVerMaterialDidactico.setForeground(new java.awt.Color(16, 67, 16));
        btnVerMaterialDidactico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MaterialDidactico.jpeg"))); // NOI18N
        btnVerMaterialDidactico.setText("Ver Material Didáctico");
        btnVerMaterialDidactico.setDoubleBuffered(true);
        btnVerMaterialDidactico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerMaterialDidactico.setPreferredSize(new java.awt.Dimension(180, 100));
        btnVerMaterialDidactico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerMaterialDidactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMaterialDidacticoActionPerformed(evt);
            }
        });

        rbtnCaricatura.setBackground(new java.awt.Color(51, 153, 0));
        rbtnCaricatura.setForeground(new java.awt.Color(255, 255, 255));
        rbtnCaricatura.setText("Caricatura");
        rbtnCaricatura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtnCaricatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCaricaturaActionPerformed(evt);
            }
        });

        rbtnBoletin.setBackground(new java.awt.Color(51, 153, 0));
        rbtnBoletin.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBoletin.setText("Boletín");
        rbtnBoletin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBoletinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 67, 16));
        jLabel4.setText("Seleccionar Caricatura ó Boletín:");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 255, 51));

        cbxLibro.setBackground(new java.awt.Color(51, 153, 0));
        cbxLibro.setForeground(new java.awt.Color(255, 255, 255));
        cbxLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { libro.get(0), libro.get(1), libro.get(2)}));
        cbxLibro.setName(""); // NOI18N
        cbxLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLibroActionPerformed(evt);
            }
        });

        cbxTitulo.setBackground(new java.awt.Color(51, 153, 0));
        cbxTitulo.setForeground(new java.awt.Color(255, 255, 255));
        cbxTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { titulo.get(0).get(0), titulo.get(0).get(1)}));
        cbxTitulo.setToolTipText("");
        cbxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTituloActionPerformed(evt);
            }
        });

        cbxCapitulo.setBackground(new java.awt.Color(51, 153, 0));
        cbxCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        cbxCapitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { capitulo.get(0).get(0).get(0), capitulo.get(0).get(0).get(1)}));
        cbxCapitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCapituloActionPerformed(evt);
            }
        });

        cbxTema.setBackground(new java.awt.Color(51, 153, 0));
        cbxTema.setForeground(new java.awt.Color(255, 255, 255));
        cbxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ámbito de aplicación","Facultades de la Policía","Convivencia Ciudadana","Intimidad","Protección Infantil","Población vulnerable","Ciclistas","Espacio público","Actuación Fuerza pública","Protección inmuebles","Actividad económica","Medio ambiente","Salud pública","Protección animal","Multas"}));
        cbxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTemaActionPerformed(evt);
            }
        });

        cbxArticulo.setBackground(new java.awt.Color(51, 153, 0));
        cbxArticulo.setForeground(new java.awt.Color(255, 255, 255));
        cbxArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ar1"+" "+articulo[0][0][0][0], "Ar2"+" "+articulo[0][0][0][1], "Ar3"+" "+articulo[0][0][0][2], "Ar4"+" "+articulo[0][0][0][3] }));
        cbxArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerMaterialDidactico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(rbtnCaricatura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnBoletin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCaricatura)
                    .addComponent(rbtnBoletin))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btnVerMaterialDidactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVerMaterialDidacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMaterialDidacticoActionPerformed
        didactico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerMaterialDidacticoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void cbxLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibroActionPerformed
        filtrarLibro();
    }//GEN-LAST:event_cbxLibroActionPerformed

    private void cbxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTituloActionPerformed
        filtrarTitulo(cbxLibro.getSelectedIndex());
    }//GEN-LAST:event_cbxTituloActionPerformed

    private void cbxCapituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCapituloActionPerformed
        filtrarCapitulo(cbxLibro.getSelectedIndex(),cbxTitulo.getSelectedIndex());
    }//GEN-LAST:event_cbxCapituloActionPerformed

    private void cbxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTemaActionPerformed
        cbxArticulo.removeAllItems();
        for(int i=0;i<243;i++){
            
            if(programa.consultarNorma(""+i,CodPol.TEMA).equals(cbxTema.getSelectedItem())){
                File f = new File(programa.consultarNorma(""+(i),EscogerMaterialDidactico.tipoDidactico));                                
                if(f.exists()){
                    cbxArticulo.addItem("Ar"+i+" "+programa.consultarNorma(""+i, CodPol.TITULO));
                }    
            }
        }
    }//GEN-LAST:event_cbxTemaActionPerformed

    private void cbxArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArticuloActionPerformed
        filtroArticulo();
    }//GEN-LAST:event_cbxArticuloActionPerformed

    private void rbtnCaricaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCaricaturaActionPerformed
        filtroArticulo();
        filtrarLibro();
        habilitarComponentes(true);
        
        
    }//GEN-LAST:event_rbtnCaricaturaActionPerformed

    private void rbtnBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBoletinActionPerformed
        filtroArticulo();
        filtrarLibro();
        habilitarComponentes(true);
    }//GEN-LAST:event_rbtnBoletinActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        if(!programa.obtenerAlias().equals("Invitado")){
            perfil.setVisible(true);
            this.setVisible(false);            
        }
    }//GEN-LAST:event_lblUsuarioMouseClicked

    
    /**
     * filtra por articulo
     */
    private void filtroArticulo(){
        for(int k=0; k<243;k++){            
            if(("Ar"+(k+1)+" "+programa.consultarNorma((k+1)+"",CodPol.TITULO)).equals(cbxArticulo.getSelectedItem())){                           
                cambiarIdDidactico(""+(k+1),devuelveSelecRadio());                
                break;
            }
                           
        }        
        //si el filtro en articulo es nulo entonces deshabilita el boton de ver didactico
        if(cbxArticulo.getSelectedItem()==null){
                    
            btnVerMaterialDidactico.setEnabled(false);
            System.out.println("entra");
        }
        else{
            btnVerMaterialDidactico.setEnabled(true);
        }
    }
    /**
     * filtra por libro por titulo
     */
    private void filtrarLibro(){
        for(int i=0; i<libro.size();i++){
            if(cbxLibro.getSelectedIndex()==i){
                cbxTitulo.removeAllItems();
                for(String a: titulo.get(i)){
                    cbxTitulo.addItem(a);                   
                }
                filtrarTitulo(i);      
                
            }            
        }
    }
    /**
     * filtra dependiendo del libro titulo capitulo
     * @param i numero del libro
     */
    private void filtrarTitulo(int i){
        for(int j=0; j<titulo.get(i).size();j++){
                    if(cbxTitulo.getSelectedIndex()==j){
                        cbxCapitulo.removeAllItems();
                        for(String a: capitulo.get(i).get(j)){                             
                            cbxCapitulo.addItem(a);                   
                        }  
                        filtrarCapitulo(i, j);
                    }            
        } 
    }
    
    /**
     * filtra por libro, titulo, capitulo 
     * @param i
     * @param p 
     */
    private void filtrarCapitulo(int i,int p){
        
       int cont=0;
        for(int j=0; j<capitulo.get(i).get(p).size();j++){
                    if(cbxCapitulo.getSelectedIndex()==j){
                        cbxArticulo.removeAllItems();
                        for(int k=0; k<243;k++){
                            if((!"".equals(articulo[i][p][j][k]))){  
                                File f = new File(programa.consultarNorma(""+(k+1),EscogerMaterialDidactico.tipoDidactico));                                
                                if(f.exists()){
                                    cbxArticulo.addItem("Ar"+(k+1)+" "+articulo[i][p][j][k]);
                                    if(cont<1){
                                        cambiarIdDidactico(""+(k+1),devuelveSelecRadio()); 
                                        cont++;
                                    }
                                }
                            }                   
                        }  
                    }            
        } 
    }
    
    /**
     * cambia el id y tipo didactico segun esocgido
     * @param id norma
     * @param op tipo de didactico
     */
    private void cambiarIdDidactico(String id, int op){
        EscogerMaterialDidactico.id = id;
        EscogerMaterialDidactico.tipoDidactico = op;
    }
    
    /**
     * devuelve el radio button selecionado
     * @return radio buton
     */
    private int devuelveSelecRadio(){
        if(rbtnBoletin.isSelected()){
            return CodPol.BOLETIN;
        }
        else{
            return CodPol.CARICATURA;
        }
    }
    
    /**
     * habilita o deshabilita las componentes de eleccios o de filtros
     * @param estado 
     */
    private void habilitarComponentes(boolean estado){
        cbxArticulo.setEnabled(estado);
        cbxCapitulo.setEnabled(estado);
        cbxTitulo.setEnabled(estado);
        cbxTema.setEnabled(estado);
        cbxLibro.setEnabled(estado);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPanico;
    private javax.swing.JButton btnRepInf;
    private javax.swing.JButton btnVerMaterialDidactico;
    private javax.swing.JComboBox<String> cbxArticulo;
    private javax.swing.JComboBox<String> cbxCapitulo;
    private javax.swing.JComboBox<String> cbxLibro;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JComboBox<String> cbxTitulo;
    private javax.swing.ButtonGroup groupbtnEscogerMD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbtnBoletin;
    private javax.swing.JRadioButton rbtnCaricatura;
    // End of variables declaration//GEN-END:variables
}
