package InterfazGrafica;


import Logica.CodPol;
import Logica.InicializarDatos;
import Logica.Norma;
import Logica.ProgramaCNP;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Ventana Reportar infracción
 * @author Nicolas Herrera y Alvaro Niño
 */
public class ReportarInfraccion extends javax.swing.JFrame {
    
    //Atributos
    
    /**
     * Ventana menu pricipal
     */    
    private MenuPrincipal menu;
    /**
     * ventana perfil
     */
    private PerfilUsuario perfil;
    /**
     * Ventana del panico
     */    
    private Panico panico;
    
    
    /**
     * programa de codigo policia
     */    
    private ProgramaCNP programa;
    /**
     * id de la norma activa
     */
    private String idNorma="1";    
    /**
     * ruta de la prueba fotografica
     */
    private String rutaPruFoto = "";
    /**
     * ruta de la prueba video
     */
    private String rutaPruVideo = "";
    
    /**
     * Titulos Libro/ Titulo/ Capitulo /Articulo
     */
    private ArrayList <String> libro = new ArrayList <String>();
    private ArrayList <ArrayList<String>> titulo = new ArrayList <ArrayList<String>>();
    private ArrayList <ArrayList<ArrayList<String>>> capitulo = new ArrayList <ArrayList<ArrayList<String>>>();
    //private ArrayList <ArrayList<ArrayList<ArrayList<String>>>> articulo = new ArrayList <ArrayList<ArrayList<ArrayList<String>>>>();
    private String[][][][] articulo = new String[3][15][5][243]; 
    
    //Métodos
    
    /**
     * Constructor
     * @param p programa
     */
    public ReportarInfraccion(ProgramaCNP p) {    
        this.programa = p;
        inicializarArticulo();
        initComponents();
        this.setLocationRelativeTo(null);
        cerrarVentanaSecundaria();
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
     * @param p ventana panico
     * @param perfil ventana perfil
     */
    public void inicioVentana(MenuPrincipal menu, Panico p, PerfilUsuario perfil){ 
        
        this.menu = menu;    
        this.panico = p;
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
        btnAdjuntarVideo = new javax.swing.JButton();
        btnInfraccionesFrecuentes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAdjuntarFoto = new javax.swing.JButton();
        btnEnviarComentario2 = new javax.swing.JButton();
        btnEnviarReporteInfraccion = new javax.swing.JButton();
        cbxLibro = new javax.swing.JComboBox<>();
        cbxTitulo = new javax.swing.JComboBox<>();
        cbxCapitulo = new javax.swing.JComboBox<>();
        cbxTema = new javax.swing.JComboBox<>();
        cbxArticulo = new javax.swing.JComboBox<>();
        lblAdjuntoFoto = new javax.swing.JLabel();
        lblAdjuntoVideo = new javax.swing.JLabel();
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
        jLabel1.setText("Reportar Infracción");

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

        btnAdjuntarVideo.setBackground(new java.awt.Color(0, 102, 0));
        btnAdjuntarVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adjuntarVideo.png"))); // NOI18N
        btnAdjuntarVideo.setMaximumSize(new java.awt.Dimension(75, 80));
        btnAdjuntarVideo.setMinimumSize(new java.awt.Dimension(75, 80));
        btnAdjuntarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarVideoActionPerformed(evt);
            }
        });

        btnInfraccionesFrecuentes.setBackground(new java.awt.Color(131, 184, 61));
        btnInfraccionesFrecuentes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnInfraccionesFrecuentes.setForeground(new java.awt.Color(16, 67, 16));
        btnInfraccionesFrecuentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infracciones.png"))); // NOI18N
        btnInfraccionesFrecuentes.setText("Ver Infracciones");
        btnInfraccionesFrecuentes.setDoubleBuffered(true);
        btnInfraccionesFrecuentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfraccionesFrecuentes.setPreferredSize(new java.awt.Dimension(180, 100));
        btnInfraccionesFrecuentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfraccionesFrecuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfraccionesFrecuentesActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        txtDescripcion.setBackground(new java.awt.Color(153, 255, 102));
        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 67, 16));
        jLabel5.setText("Descripción Infracción:");

        btnAdjuntarFoto.setBackground(new java.awt.Color(0, 102, 0));
        btnAdjuntarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adjuntarFoto.png"))); // NOI18N
        btnAdjuntarFoto.setMaximumSize(new java.awt.Dimension(75, 80));
        btnAdjuntarFoto.setMinimumSize(new java.awt.Dimension(75, 80));
        btnAdjuntarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarFotoActionPerformed(evt);
            }
        });

        btnEnviarComentario2.setBackground(new java.awt.Color(0, 102, 0));
        btnEnviarComentario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adjuntarUbicacion.png"))); // NOI18N
        btnEnviarComentario2.setMaximumSize(new java.awt.Dimension(75, 80));
        btnEnviarComentario2.setMinimumSize(new java.awt.Dimension(75, 80));

        btnEnviarReporteInfraccion.setBackground(new java.awt.Color(131, 184, 61));
        btnEnviarReporteInfraccion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEnviarReporteInfraccion.setForeground(new java.awt.Color(16, 67, 16));
        btnEnviarReporteInfraccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviarSugerencia.png"))); // NOI18N
        btnEnviarReporteInfraccion.setText("Enviar Reporte");
        btnEnviarReporteInfraccion.setDoubleBuffered(true);
        btnEnviarReporteInfraccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviarReporteInfraccion.setPreferredSize(new java.awt.Dimension(180, 100));
        btnEnviarReporteInfraccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnviarReporteInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarReporteInfraccionActionPerformed(evt);
            }
        });

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

        lblAdjuntoFoto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdjuntoFoto.setForeground(new java.awt.Color(255, 0, 0));
        lblAdjuntoFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdjuntoFoto.setText("Adjunto: 0");

        lblAdjuntoVideo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdjuntoVideo.setForeground(new java.awt.Color(255, 0, 0));
        lblAdjuntoVideo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdjuntoVideo.setText("Adjunto: 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnInfraccionesFrecuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviarReporteInfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAdjuntoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdjuntarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnEnviarComentario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdjuntarVideo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(lblAdjuntoVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdjuntoFoto)
                    .addComponent(lblAdjuntoVideo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarComentario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdjuntarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdjuntarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfraccionesFrecuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarReporteInfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    }//GEN-LAST:event_btnRepInfActionPerformed

    private void btnInfraccionesFrecuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfraccionesFrecuentesActionPerformed
        hacerGrafica();
    }//GEN-LAST:event_btnInfraccionesFrecuentesActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEnviarReporteInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarReporteInfraccionActionPerformed
        
        programa.obtenerCodigoPolicia().devolverNorma(idNorma).acumDenuncias();
        if(programa.enviarReporte(txtDescripcion.getText(),rutaPruFoto,rutaPruVideo)){
            JOptionPane.showMessageDialog(this,"El reporte de la infracción se ha enviado correctamente","Estado mensaje",JOptionPane.INFORMATION_MESSAGE);
            txtDescripcion.setText("");
            rutaPruFoto="";
            rutaPruVideo="";
            lblAdjuntoVideo.setText("Adjunto: 0");
            lblAdjuntoFoto.setText("Adjunto: 0");
        }
        else{
            JOptionPane.showMessageDialog(this,"No se ha podido enviar, intentelo mas tarde","Estado mensaje",JOptionPane.WARNING_MESSAGE);            
        }
        
    }//GEN-LAST:event_btnEnviarReporteInfraccionActionPerformed

    private void btnAdjuntarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarFotoActionPerformed
            getRutaPrueba();
    }//GEN-LAST:event_btnAdjuntarFotoActionPerformed

    private void btnAdjuntarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarVideoActionPerformed
        getRutaPrueba();
    }//GEN-LAST:event_btnAdjuntarVideoActionPerformed

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
                cbxArticulo.addItem("Ar"+i+" "+programa.consultarNorma(""+i, CodPol.TITULO));
            }
        }
    }//GEN-LAST:event_cbxTemaActionPerformed

    private void cbxArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArticuloActionPerformed
        filtroArticulo();
    }//GEN-LAST:event_cbxArticuloActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        actualizarSesion(programa.obtenerAlias());
        if("Invitado".equals(programa.obtenerAlias())){
            cbxArticulo.setEnabled(false);
            cbxCapitulo.setEnabled(false);
            cbxTitulo.setEnabled(false);
            cbxTema.setEnabled(false);
            cbxLibro.setEnabled(false);
            btnAdjuntarFoto.setEnabled(false);
            btnAdjuntarVideo.setEnabled(false);
            btnEnviarReporteInfraccion.setEnabled(false);
            txtDescripcion.setEnabled(false);
            
        }
        else{
            cbxArticulo.setEnabled(true);
            cbxCapitulo.setEnabled(true);
            cbxTitulo.setEnabled(true);
            cbxTema.setEnabled(true);
            cbxLibro.setEnabled(true);
            btnAdjuntarFoto.setEnabled(true);
            btnAdjuntarVideo.setEnabled(true);
            btnEnviarReporteInfraccion.setEnabled(true);
            txtDescripcion.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        if(!programa.obtenerAlias().equals("Invitado")){
            perfil.setVisible(true);
            this.setVisible(false);            
        }
    }//GEN-LAST:event_lblUsuarioMouseClicked
    /**
     * obtener la ruta de la prueba
     * @return ruta
     */
    public String getRutaPrueba(){
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        if(btnAdjuntarFoto.isFocusOwner()){
            filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png"); 
            JFileChooser fc = new JFileChooser("src/img/");
            fc.setFileFilter(filtro);
            int boton = fc.showOpenDialog(null);
            if(boton == JFileChooser.APPROVE_OPTION){
                this.rutaPruFoto=fc.getSelectedFile().getAbsolutePath(); 
                lblAdjuntoFoto.setText("Adjunto: 1");
            }        
            return rutaPruFoto;
        }
        else if(btnAdjuntarVideo.isFocusOwner()){
            filtro = new FileNameExtensionFilter("MP4 y AVI","mp4","avi");
            JFileChooser fc = new JFileChooser("src/img/");
            fc.setFileFilter(filtro);
            int boton = fc.showOpenDialog(null);
            if(boton == JFileChooser.APPROVE_OPTION){
                this.rutaPruVideo=fc.getSelectedFile().getAbsolutePath();
                lblAdjuntoVideo.setText("Adjunto: 1");
            }        
            return rutaPruVideo;
        }
        
              
        return "";
    }
    
    /**
     * filtra por articulo
     */
    private void filtroArticulo(){
        for(int k=0; k<243;k++){            
            if(("Ar"+(k+1)+" "+programa.consultarNorma((k+1)+"",CodPol.TITULO)).equals(cbxArticulo.getSelectedItem())){
                                
                idNorma=""+(k+1);
                
                break;
            }
                           
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
                            if(!"".equals(articulo[i][p][j][k])){
                                cbxArticulo.addItem("Ar"+(k+1)+" "+articulo[i][p][j][k]);
                                if(cont<1){
                                    idNorma=""+(k+1);
                                    cont++;
                                }
                                
                            }                   
                        }  
                    }            
        } 
    }
    
    /*
    getter Id norma
    */
    public String getIdNorma() {
        return idNorma;
    }
    
    private ArrayList <Norma> analizarInfraccionesFrecuentes(){
        
        ArrayList<Norma> infraccionesFrecuentes = new ArrayList<Norma>();
        
        ArrayList<Norma> normas = (ArrayList<Norma>) programa.obtenerCodigoPolicia().getNormas().clone();
        
        int cont=0,cont1=0;
        
        System.out.println("--------------------------------------------------");
        while(cont1<6){
            Norma aux = normas.get(0);
            for(int i=0;i<normas.size();i++){
                if(normas.get(i).getAcuDenuncias()>aux.getAcuDenuncias()){
                    aux=normas.get(i);  
                    cont=i;
                }
            }
            infraccionesFrecuentes.add(normas.get(cont));
            normas.remove(cont);
            
            System.out.println("Art"+infraccionesFrecuentes.get(cont1).getId()+"-"+infraccionesFrecuentes.get(cont1).getAcuDenuncias());
            cont1++;
        }
        return infraccionesFrecuentes;
    }
    
    
    public void hacerGrafica(){        
        DefaultPieDataset data = new DefaultPieDataset();
        
        ArrayList <Norma> infracFrecuente = analizarInfraccionesFrecuentes();
        
        for(Norma n: infracFrecuente){
            data.setValue("Articulo #"+n.getId(),n.getAcuDenuncias());
        }
        JFreeChart grafica = ChartFactory.createPieChart3D("Infracciones frecuentes", data,true,true,false);
        
        ChartPanel contenedor = new ChartPanel(grafica);
        JOptionPane.showMessageDialog(this,contenedor,"CÓDIGO NACIONAL DE POLICIA",JOptionPane.PLAIN_MESSAGE,null);      
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntarFoto;
    private javax.swing.JButton btnAdjuntarVideo;
    private javax.swing.JButton btnEnviarComentario2;
    private javax.swing.JButton btnEnviarReporteInfraccion;
    private javax.swing.JButton btnInfraccionesFrecuentes;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPanico;
    private javax.swing.JButton btnRepInf;
    private javax.swing.JComboBox<String> cbxArticulo;
    private javax.swing.JComboBox<String> cbxCapitulo;
    private javax.swing.JComboBox<String> cbxLibro;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JComboBox<String> cbxTitulo;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdjuntoFoto;
    private javax.swing.JLabel lblAdjuntoVideo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
