package InterfazGrafica;

import Logica.ProgramaCNP;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;

/**
 *
 * @author alvar
 */
public class Articulos extends javax.swing.JFrame {
    /**
     * Ventana menu pricipal
     */    
    private MenuPrincipal menu;
    /**
     * Ventana del panico
     */    
    private Panico panico;
    /**
     * Ventana de infraccion
     */    
    private ReportarInfraccion infraccion;
    /**
     * Ventana comentarios
     */    
    private Comentarios comentario;
    /**
     * programa de codigo policia
     */    
    private ProgramaCNP programa;    
    
    /**
     * Titulos Libro/ Titulo/ Capitulo /Articulo
     */
    private ArrayList <String> libro = new ArrayList <String>();
    private ArrayList <ArrayList<String>> titulo = new ArrayList <ArrayList<String>>();
    private ArrayList <ArrayList<ArrayList<String>>> capitulo = new ArrayList <ArrayList<ArrayList<String>>>();;
    
    
    
    /**
     * Constructor
     */
    public Articulos() {   
        inicializarArticulo();
        initComponents();
        
        this.setLocationRelativeTo(null);
        cerrarVentanaSecundaria();
    }
    /**
     * Iniciliza la matriz de articulos, y coloca valores de filtros
     */
    public void inicializarArticulo(){
       //libros
        libro.add("LIBRO I DISPOSICIONES GENERALES ");
        libro.add("LIBRO II DE LA LIBERTAD, LOS DERECHOS Y DEBERES DE LAS PERSONAS EN MATERIA DE CONVIVENCIA");
        libro.add("LIBRO III MEDIOS DE POLICÍA, MEDIDAS CORRECTIVAS, AUTORIDADES DE POLICÍA Y COMPETENCIAS, PROCEDIMIENTOS, MECANISMOS ALTERNATIVOS DE SOLUCIÓN DE DESACUERDOS O CONFLICTOS");
       //titulos
        //titulos libro 1
        ArrayList <String> libro1Titulo = new ArrayList<String>();
        libro1Titulo.add("TÍTULO I OBJETO DEL CÓDIGO, ÁMBITO DE APLICACIÓN Y AUTONOMÍA BASES DE LA CONVIVENCIA ");
        libro1Titulo.add("TÍTULO IIPODER, FUNCIÓN Y ACTIVIDAD DE POLICÍA");
        //titulos libro 2
        ArrayList <String> libro2Titulo = new ArrayList<String>();
        libro2Titulo.add("TÍTULO IDEL CONTENIDO DEL LIBRO");
        libro2Titulo.add("TÍTULO IIDE LOS COMPORTAMIENTOS CONTRARIOS A LA CONVIVENCIA");
        libro2Titulo.add("TÍTULO IIIDEL DERECHO DE LAS PERSONAS A LA SEGURIDAD Y A LA DE SUS BIENES");
        libro2Titulo.add("TÍTULO IVDE LA TRANQUILIDAD Y LAS RELACIONES RESPETUOSAS");
        libro2Titulo.add("TÍTULO VDE LAS RELACIONES RESPETUOSAS CON GRUPOS ESPECÍFICOS DE LA SOCIEDAD");
        libro2Titulo.add("TÍTULO VIDEL DERECHO DE REUNIÓN");
        libro2Titulo.add("TÍTULO VIIDE LA PROTECCIÓN DE BIENES INMUEBLES");
        libro2Titulo.add("TÍTULO VIIIDE LA ACTIVIDAD ECONÓMICA");
        libro2Titulo.add("TÍTULO IXDEL AMBIENTE");
        libro2Titulo.add("TÍTULO XMINERÍA");
        libro2Titulo.add("TÍTULO XISALUD PÚBLICA");
        libro2Titulo.add("TÍTULO XIIDEL PATRIMONIO CULTURAL Y SU CONSERVACIÓN");
        libro2Titulo.add("TÍTULO XIIIDE LA RELACIÓN CON LOS ANIMALES");
        libro2Titulo.add("TÍTULO XIVDEL URBANISMO");
        libro2Titulo.add("TÍTULO XVDE LA LIBERTAD DE MOVILIDAD Y CIRCULACIÓN");
        //titulos libro 3
        ArrayList <String> libro3Titulo = new ArrayList<String>();
        libro3Titulo.add("TÍTULO IMEDIOS DE POLICÍA Y MEDIDAS CORRECTIVAS");
        libro3Titulo.add("TÍTULO IIAUTORIDADES DE POLICÍA Y COMPETENCIAS");
        libro3Titulo.add("TÍTULO IIIPROCESO ÚNICO DE POLICÍA");
        
        titulo.add(libro1Titulo);
        titulo.add(libro2Titulo);
        titulo.add(libro3Titulo);
       //capitulos        
        ArrayList <String> libro1Titulo1Capitulo = new ArrayList<String>();
        libro1Titulo1Capitulo.add("CAPÍTULO I OBJETO DEL CÓDIGO, ÁMBITO DE APLICACIÓN Y AUTONOMÍA ");
        libro1Titulo1Capitulo.add("CAPÍTULO IIBASES DE LA CONVIVENCIA Y SEGURIDAD CIUDADANA");
        ArrayList <String> libro1Titulo2Capitulo = new ArrayList<String>();
        libro1Titulo2Capitulo.add("CAPÍTULO IPODER DE POLICÍA");
        libro1Titulo2Capitulo.add("CAPÍTULO IIFUNCIÓN Y ACTIVIDAD DE POLICÍA");
        libro1Titulo2Capitulo.add("CAPÍTULO IIICONCRECIÓN DE LA ORDEN DE POLICÍA");
        ArrayList <String> libro2Titulo1Capitulo = new ArrayList<String>();
        libro2Titulo1Capitulo.add("CAPÍTULO IÚNICOASPECTOS GENERALES");
        ArrayList <String> libro2Titulo2Capitulo = new ArrayList<String>();
        libro2Titulo2Capitulo.add("CAPÍTULO IIÚNICO");
        ArrayList <String> libro2Titulo3Capitulo = new ArrayList<String>();
        libro2Titulo3Capitulo.add("CAPÍTULO IVIDA E INTEGRIDAD DE LAS PERSONAS");
        libro2Titulo3Capitulo.add("CAPÍTULO IIDE LA SEGURIDAD EN LOS SERVICIOS PÚBLICOS");
        libro2Titulo3Capitulo.add("CAPÍTULO IIIARTÍCULOS PIROTÉCNICOS Y SUSTANCIAS PELIGROSAS");
        ArrayList <String> libro2Titulo4Capitulo = new ArrayList<String>();
        libro2Titulo4Capitulo.add("CAPÍTULO IPRIVACIDAD DE LAS PERSONAS");
        libro2Titulo4Capitulo.add("CAPÍTULO IIDE LOS ESTABLECIMIENTOS EDUCATIVOS");
        ArrayList <String> libro2Titulo5Capitulo = new ArrayList<String>();
        libro2Titulo5Capitulo.add("CAPÍTULO INIÑOS, NIÑAS Y ADOLESCENTES");
        libro2Titulo5Capitulo.add("CAPÍTULO IIGRUPOS DE ESPECIAL PROTECCIÓN CONSTITUCIONAL");
        libro2Titulo5Capitulo.add("CAPÍTULO IIIEJERCICIO DE LA PROSTITUCIÓN");
        ArrayList <String> libro2Titulo6Capitulo = new ArrayList<String>();
        libro2Titulo6Capitulo.add("CAPÍTULO ICLASIFICACIÓN Y REGLAMENTACIÓN");
        libro2Titulo6Capitulo.add("CAPÍTULO IIEXPRESIONES O MANIFESTACIONES EN EL ESPACIO PÚBLICO");
        libro2Titulo6Capitulo.add("CAPÍTULO IIIACTIVIDADES QUE INVOLUCRAN AGLOMERACIONES DE PÚBLICO NO COMPLEJAS");
        libro2Titulo6Capitulo.add("CAPÍTULO IVACTIVIDADES QUE INVOLUCRAN AGLOMERACIONES DE PÚBLICO COMPLEJAS");
        ArrayList <String> libro2Titulo7Capitulo = new ArrayList<String>();
        libro2Titulo7Capitulo.add("CAPÍTULO IDE LA POSESIÓN, LA TENENCIA Y LAS SERVIDUMBRES");
        ArrayList <String> libro2Titulo8Capitulo = new ArrayList<String>();
        libro2Titulo8Capitulo.add("CAPÍTULO IDE LA ACTIVIDAD ECONÓMICA Y SU REGLAMENTACIÓN");
        libro2Titulo8Capitulo.add("CAPÍTULO IIESTACIONAMIENTOS O PARQUEADEROS");
        libro2Titulo8Capitulo.add("CAPÍTULO IIICOMPORTAMIENTOS QUE AFECTAN LA ACTIVIDAD ECONÓMICA");
        libro2Titulo8Capitulo.add("CAPÍTULO IVDE LA SEGURIDAD DE LOS EQUIPOS TERMINALES MÓVILES Y/O TARJETAS SIMCARD (IMSI)");
        ArrayList <String> libro2Titulo9Capitulo = new ArrayList<String>();
        libro2Titulo9Capitulo.add("CAPÍTULO IAMBIENTE");
        libro2Titulo9Capitulo.add("CAPÍTULO IIRECURSO HÍDRICO, FAUNA, FLORA Y AIRE");
        libro2Titulo9Capitulo.add("CAPÍTULO IIISISTEMA NACIONAL DE ÁREAS PROTEGIDAS (SINAP)");
        ArrayList <String> libro2Titulo10Capitulo = new ArrayList<String>();
        libro2Titulo10Capitulo.add("CAPÍTULO IMEDIDAS PARA EL CONTROL DE LA EXPLOTACIÓN Y APROVECHAMIENTO ILÍCITA DE MINERALES");
        ArrayList <String> libro2Titulo11Capitulo = new ArrayList<String>();
        libro2Titulo11Capitulo.add("CAPÍTULO IDE LA SALUD PÚBLICA");
        libro2Titulo11Capitulo.add("CAPÍTULO IILIMPIEZA Y RECOLECCIÓN DE RESIDUOS Y DE ESCOMBROS");
        ArrayList <String> libro2Titulo12Capitulo = new ArrayList<String>();
        libro2Titulo12Capitulo.add("CAPÍTULO IPROTECCIÓN DE LOS BIENES DEL PATRIMONIO CULTURAL Y ARQUEOLÓGICO");
        ArrayList <String> libro2Titulo13Capitulo = new ArrayList<String>();
        libro2Titulo13Capitulo.add("CAPÍTULO IDEL RESPETO Y CUIDADO DE LOS ANIMALES");
        libro2Titulo13Capitulo.add("CAPÍTULO IIANIMALES DOMÉSTICOS O MASCOTAS");
        libro2Titulo13Capitulo.add("CAPÍTULO IIIDE LA CONVIVENCIA DE LAS PERSONAS CON ANIMALES");
        libro2Titulo13Capitulo.add("CAPÍTULO IVEJEMPLARES CANINOS POTENCIALMENTE PELIGROSOS");
        ArrayList <String> libro2Titulo14Capitulo = new ArrayList<String>();
        libro2Titulo14Capitulo.add("CAPÍTULO ICOMPORTAMIENTOS QUE AFECTAN LA INTEGRIDAD URBANÍSTICA");
        libro2Titulo14Capitulo.add("CAPÍTULO IIDEL CUIDADO E INTEGRIDAD DEL ESPACIO PÚBLICO");
        ArrayList <String> libro2Titulo15Capitulo = new ArrayList<String>();
        libro2Titulo15Capitulo.add("CAPÍTULO ICIRCULACIÓN Y DERECHO DE VÍA");
        libro2Titulo15Capitulo.add("CAPÍTULO IIDE LA MOVILIDAD DE LOS PEATONES Y EN BICICLETA");
        libro2Titulo15Capitulo.add("CAPÍTULO IIICONVIVENCIA EN LOS SISTEMAS DE TRANSPORTE MOTORIZADOS");
        ArrayList <String> libro3Titulo1Capitulo = new ArrayList<String>();
        libro3Titulo1Capitulo.add("CAPÍTULO IMEDIOS DE POLICÍA");
        libro3Titulo1Capitulo.add("CAPÍTULO IIMEDIDAS CORRECTIVAS");
        ArrayList <String> libro3Titulo2Capitulo = new ArrayList<String>();
        libro3Titulo2Capitulo.add("CAPÍTULO IAUTORIDADES DE POLICÍA");
        ArrayList <String> libro3Titulo3Capitulo = new ArrayList<String>();
        libro3Titulo3Capitulo.add("CAPÍTULO IPROCESO ÚNICO DE POLICÍA");
        libro3Titulo3Capitulo.add("CAPÍTULO IIPROCESO VERBAL INMEDIATO");
        libro3Titulo3Capitulo.add("CAPÍTULO IIIPROCESO VERBAL ABREVIADO");
        libro3Titulo3Capitulo.add("CAPÍTULO IVMECANISMOS ALTERNATIVOS DE SOLUCIÓN DE DESACUERDOS Y CONFLICTOS");
        libro3Titulo3Capitulo.add("CAPÍTULO VDISPOSICIONES FINALES, VIGENCIA DEL CÓDIGO, NORMAS COMPLEMENTARIAS Y DEROGATORIAS");
        
        capitulo.add(new ArrayList<ArrayList<String>>() {{add(libro1Titulo2Capitulo);add(libro1Titulo1Capitulo);add(libro1Titulo1Capitulo);}});
        capitulo.add(new ArrayList<ArrayList<String>>() {{add(libro2Titulo1Capitulo);add(libro2Titulo2Capitulo);add(libro2Titulo3Capitulo);add(libro2Titulo4Capitulo);add(libro2Titulo5Capitulo);add(libro2Titulo6Capitulo);
            add(libro2Titulo7Capitulo);add(libro2Titulo8Capitulo);add(libro2Titulo9Capitulo);add(libro2Titulo10Capitulo);add(libro2Titulo11Capitulo);add(libro2Titulo12Capitulo);
            add(libro2Titulo13Capitulo);add(libro2Titulo14Capitulo);add(libro2Titulo15Capitulo);}});
        capitulo.add(new ArrayList<ArrayList<String>>() {{add(libro3Titulo1Capitulo); add(libro3Titulo2Capitulo);add(libro3Titulo3Capitulo);}});
        
             
        
        
        
        
                
    }
    
    /**
     * oculta la ventana secundaria y muestra el menu principal
     */
    public void cerrarVentanaSecundaria(){
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
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
     * @param menu ventana principal     
     * @param panico     
     * @param r ventana infraccion   
     * @param com ventana comentario     
     * @param p programa codigo policia
     */
    public void inicioVentana(MenuPrincipal menu, Panico panico, ReportarInfraccion r, Comentarios com, ProgramaCNP p){
        this.comentario = com;
        this.programa = p;        
        this.menu = menu;
        this.panico = panico;
        this.infraccion = r;
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
        cbxLibro = new javax.swing.JComboBox<>();
        cbxTitulo = new javax.swing.JComboBox<>();
        cbxCapitulo = new javax.swing.JComboBox<>();
        btnEnviarComentario = new javax.swing.JButton();
        cbxTema = new javax.swing.JComboBox<>();
        cbxArticulo1 = new javax.swing.JComboBox<>();
        btnVerComentarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
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
        jLabel1.setText("Artículos");

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
        cbxTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título 1", "Título 2", "Título 3", "Tíulo4" }));
        cbxTitulo.setToolTipText("");
        cbxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTituloActionPerformed(evt);
            }
        });

        cbxCapitulo.setBackground(new java.awt.Color(51, 153, 0));
        cbxCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        cbxCapitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capítulo 1", "Capítulo 2", "Capítulo 3", "Capítulo 4" }));
        cbxCapitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCapituloActionPerformed(evt);
            }
        });

        btnEnviarComentario.setBackground(new java.awt.Color(0, 102, 0));
        btnEnviarComentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enviar.png"))); // NOI18N
        btnEnviarComentario.setMaximumSize(new java.awt.Dimension(75, 80));
        btnEnviarComentario.setMinimumSize(new java.awt.Dimension(75, 80));

        cbxTema.setBackground(new java.awt.Color(51, 153, 0));
        cbxTema.setForeground(new java.awt.Color(255, 255, 255));
        cbxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tema 1", "Tema 2", "Tema 3", "Tema 4" }));

        cbxArticulo1.setBackground(new java.awt.Color(51, 153, 0));
        cbxArticulo1.setForeground(new java.awt.Color(255, 255, 255));
        cbxArticulo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Título artículo", "2. Título artículo", "3. Título artículo", "4. Título artículo" }));

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

        jTextArea1.setBackground(new java.awt.Color(153, 255, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 67, 16));
        jLabel4.setText("Enviar Comentario");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(153, 255, 102));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jSeparator2.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(btnVerComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbxArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
                    .addComponent(cbxArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cbxCapituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCapituloActionPerformed
        
    }//GEN-LAST:event_cbxCapituloActionPerformed

    private void btnVerComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerComentariosActionPerformed
        comentario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerComentariosActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void cbxLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibroActionPerformed
                
        for(int i=0; i<libro.size();i++){
            if(cbxLibro.getSelectedIndex()==i){
                cbxTitulo.removeAllItems();
                for(String a: titulo.get(i)){
                    cbxTitulo.addItem(a);                   
                }
                filtrasCapitulo(i);      
                
            }            
        }
        
        
        
        
    }//GEN-LAST:event_cbxLibroActionPerformed

    private void cbxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTituloActionPerformed
        filtrasCapitulo(cbxLibro.getSelectedIndex());
    }//GEN-LAST:event_cbxTituloActionPerformed

    /**
     * filtra dependiendo del libro titulo capitulo
     * @param i numero del libro
     */
    private void filtrasCapitulo(int i){
        for(int j=0; j<titulo.get(i).size();j++){
                    if(cbxTitulo.getSelectedIndex()==j){
                        cbxCapitulo.removeAllItems();
                        for(String a: capitulo.get(i).get(j)){
                            cbxCapitulo.addItem(a);                   
                        }  
                    }            
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarComentario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPanico;
    private javax.swing.JButton btnRepInf;
    private javax.swing.JButton btnVerComentarios;
    private javax.swing.JComboBox<String> cbxArticulo1;
    private javax.swing.JComboBox<String> cbxCapitulo;
    private javax.swing.JComboBox<String> cbxLibro;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JComboBox<String> cbxTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
