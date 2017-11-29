package Logica;

import com.teamdev.jxmaps.ControlPosition;
import com.teamdev.jxmaps.Icon;
import com.teamdev.jxmaps.InfoWindow;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapMouseEvent;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.MapTypeId;
import com.teamdev.jxmaps.MapTypeStyle;
import com.teamdev.jxmaps.MapTypeStyleElementType;
import com.teamdev.jxmaps.MapTypeStyleFeatureType;
import com.teamdev.jxmaps.MapTypeStyler;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.MouseEvent;
import com.teamdev.jxmaps.StyledMapType;
import com.teamdev.jxmaps.swing.MapView;

import java.util.ArrayList;


/**
 * Clase en donde se muestran los mapas de los CAI´s
 * @author Nicolas Herrera y Alvaro Niño
 */
public class MapaCais extends MapView{
    
    //Atributos
    
    /**
     * arreglo dwe marcadores del mapa cais
     */
    private ArrayList<Marker> marcaCais = new ArrayList<>();
    /**
     * arrgelo de info de los maracdores cais 
     */
    private ArrayList<InfoWindow> infoCais= new ArrayList<>();
    /**
     * arreglo datos por cai, nombre, dir, tel, coordenadas
     */
    public static ArrayList<String[]> datosCais = new ArrayList<String[]>();
    /**
     * marcador seleccionado
     */
    private int pos=0;
    
    //Métodos
    
    /**
     * Método constructor
     */
    public MapaCais(){
            
    }
    /**
     * obtener informacion cais
     * @return datos de los cais
     */
    public ArrayList<String[]> getDatosCais() {
        return datosCais;
    }

    /**
     * obtener maracdor seleccionado
     * @return posicion
     */
    public int getPos() {
        return pos;
    }
    
    
    /**
     * generar mapa cais
     * @param latitud ubicacion
     * @param longitud ubicacion
     */
    public void generarMapa(double latitud, double longitud){
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus status) {
                
                if (status == MapStatus.MAP_STATUS_OK) {
                    // Getting the associated map object
                    Map map = getMap();
                    // Creating a map options object
                    MapOptions options = new MapOptions();
                    // Creating a map type control options object
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                    // Changing position of the map type control
                    controlOptions.setPosition(ControlPosition.TOP_RIGHT);
                    // Setting map type control options
                    options.setMapTypeControlOptions(controlOptions);
                    // Setting map options
                    map.setOptions(options);
                    // Setting the map center
                    map.setCenter(new LatLng(latitud,longitud));
                    
                    // Setting initial zoom value
                    map.setZoom(15.0);
                    // Creating a new marker object
                    
                    Marker miUbicacion = new Marker(map);  
                    
                    Icon iconoU = new Icon();
                    iconoU.loadFromFile("src/img/usuario.png");
                    
                    miUbicacion.setIcon(iconoU);
                    // Setting marker position
                    miUbicacion.setPosition(map.getCenter());
                    // Creating info window, that will be initially displayed on the marker
                    final InfoWindow infoWindow = new InfoWindow(map);
                    // Setting info window text
                    infoWindow.setContent("Ud se encuentra aqui");
                    // Showing info windows under the marker
                    infoWindow.open(map,miUbicacion);           
                    
                    estiloPolicia(map, "#40FF00");
                    
                    colocarMarcadoresCais(map);
                    
                    
                    
                    
                      
                    
                    

                }
                
            }
        });                
    }
    
    
    /**
     * inicializar maracdores e informacion de cais y estciones
     * @param map mapa
     */
    private void colocarMarcadoresCais(Map map){  
        datosCais.clear();
        //datos cais
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA USAQUÉN","CALLE 165 # 8A-43","678 4927-6781577","-74.0259314","4.7417851"});
        datosCais.add(new String[] {"CAI CONTADOR","CARRERA 19 # 136-31","626 4494","-74.0486111","4.7210093"});
        datosCais.add(new String[] {"CAI NAVARRA","AUTOPISTA NORTE # 108-96","619 3227","-74.0581136","4.6966433"});
        datosCais.add(new String[] {"CAI VILLA NIDIA","CALLE 163 # 6A-25","672 2797","-74.0247784","4.7375927"});
        datosCais.add(new String[] {"CAI TOBERIN","CALLE 164 # 16C-00","678 9988","-74.041717","4.7435097"});
        datosCais.add(new String[] {"CAI UNICENTRO","CALLE 122 # 20-15","619 6639","-74.0533785","4.7021003"});
        datosCais.add(new String[] {"CAI VERBENAL","CALLE 187 # 19-00","673 0111","-74.0420749","4.7645469"});
        datosCais.add(new String[] {"CAI CODITO","CARRERA 4 # 187A BIS","671 8230","-74.0263532","4.7640444"});
        datosCais.add(new String[] {"CAI LISBOA","CARRERA 7 # 130-00","274 7918","-74.0308925","4.7083158"});
        datosCais.add(new String[] {"CAI SANTA BARBARA","CARRERA 6 CON CALLE 116","629 0897","-74.0336171","4.6929863"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA CHAPINERO","CARRERA 2 # 56-40","2489616","-74.0610593","4.6414016"});
        datosCais.add(new String[] {"CAI CHILE","CALLE 72 # 7-00","211 8355","-74.0576971","4.6547662"});
        datosCais.add(new String[] {"CAI EL VIRREY","CARRERA 15 # 88-00","236 9129","-74.0560338","4.6730704"});
        datosCais.add(new String[] {"CAI ESTADERO","CARRERA 11 # 87-00","610 1819","-74.0527601","4.6706622"});
        datosCais.add(new String[] {"CAI GRANADA","CARRERA 3B # 64-00","212 5888","-74.0590908","4.6468569"});
        datosCais.add(new String[] {"CAI LOURDES","CALLE 64 # 10-00","211 1269","-74.0639699","4.649837"});
        datosCais.add(new String[] {"CAI OXY","CARRERA 11 CON CALLE 77","217 7555","-74.0578973","4.6616532"});
        datosCais.add(new String[] {"CAI ROSALES","AVENIDA CIRCUNVALAR # 76A-00","211 6777","-74.0511253","4.6561866"});
        datosCais.add(new String[] {"CAI CHAPINERO","CALLE 60 # 9-12","217 7472","-74.0644863","4.6459569"});
        datosCais.add(new String[] {"CAI LA CALERA","KILOMETRO 3.5 VÍA LA CALERA","632 0840","-74.0205972","4.6723565"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA SANTA FÉ","CARRERA 1 # 18A-90","284 3517-336 1257","-74.0680218","4.6021754"});
        datosCais.add(new String[] {"CAI GIRARDOT","CALLE 2 BIS # 2-04","280 1311","-74.077574","4.5867332"});
        datosCais.add(new String[] {"CAI LOS LACHES","CARRERA 8 ESTE CON DIAGONAL 4","289 6756","-74.069999","4.5853891"});
        datosCais.add(new String[] {"CAI LAS CRUCES","CARRERA 8 CON CALLE 2","280 4343","-74.0836994","4.5896942"});
        datosCais.add(new String[] {"CAI SAN VICTORINO","AV. CARACAS CON CALLE 10","286 4454","-74.0837643","4.6010766"});
        datosCais.add(new String[] {"CAI SAN DIEGO","CARRERA 7 CON CALLE 26","286 0580","-74.0970437","4.570298"});
        datosCais.add(new String[] {"CAI TELECOM","CARRERA 13 CON CALLE 23","561 0163","-74.0754391","4.6104992"});
        datosCais.add(new String[] {"CAI TORRES BLANCAS","CARRERA 3 CON CALLE 23","286 2555","-74.0686591","4.6069198"});
        datosCais.add(new String[] {"CAI COLSEGUROS","CARRERA 10 CON CALLE 17","286 1133","-74.0769844","4.6051104"});
        datosCais.add(new String[] {"CAI DORADO","CARRERA 8 ESTE CON CALLE 1A BIS 00","233 4782","-74.0744289","4.5803664"});
        datosCais.add(new String[] {"CAI MONSERRATE","AV. CIRCUNVALAR CON CALLE 20","286 9408","-74.1145202","4.6443793"});
        datosCais.add(new String[] {"CAI GUAVIO","CALLE 6 # 6-37 ESTE","246 0908","-74.1201215","4.5762744"});
        datosCais.add(new String[] {"CAI MIRADOR","KLM 5 VÍA CHOACHI","289 2389","-74.0676932","4.5919329"});
        datosCais.add(new String[] {"PUESTO DE POLICIA EL CIRCO","KILOMETRO 3 VÍA CHOACHI","289 2390","-73.9830687","4.56385"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA SAN CRISTOBAL","AV. 1 DE MAYO # 1-90 ESTE","246 3107-328 2000-242 8235","-74.0881012","4.5699709"});
        datosCais.add(new String[] {"CAI 20 DE JULIO","CARRERA 7 CON CALLE 22 A SUR","209 2509","-74.0943187","4.573399"});
        datosCais.add(new String[] {"CAI CARCEL DISTRITAL","CARREA 8 CON CALLE 1C SUR","337 0376","-74.086632","4.5856057"});
        datosCais.add(new String[] {"CAI BELLO HORIZONTE","CARRERA 3A CON CALLE 31 C","363 4652","-74.0662577","4.6161574"});
        datosCais.add(new String[] {"CAI GUACAMAYAS","CARRERA 2A # 38-20 SUR","207 7934","-74.088492","4.5690772"});
        datosCais.add(new String[] {"CAI LA VICTORIA","CALLE 46B BIS CON CARRERA 3B","363 3099 - 362 0944","-74.0976504","4.5454357"});
        datosCais.add(new String[] {"CAI LOS LIBERTADORES","CALLE 56 SUR # 14A-11 ESTE","206 7354","-74.0928833","4.5330775"});
        datosCais.add(new String[] {"CAI ALTAMIRA","CALLE 48 SUR # 13B-20 ESTE","362 1000","-74.0882661","4.5370546"});
        datosCais.add(new String[] {"CAI JUAN REY","CALLE 74 SUR CON CARRERA 15 ESTE","365 5111","-74.0922093","4.5175"});
        datosCais.add(new String[] {"CAI RAMAJAL","CALLE 30 # 9A-00 ESTE","206 7528","-74.0961458","4.5586964"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA USME","AV. USME # 96A-97 SUR","762 5917-762 ","-74.1198887","4.50111"});
        datosCais.add(new String[] {"CAI LA AURORA","CARRERA 3 CON CALLE 71F SUR","768 4004","-74.1229147","4.5209028"});
        datosCais.add(new String[] {"CAI SANTA MARTA","CR 1 B-BIS 68B-54 SUR ESTE","911 9763","-74.1391166","4.5198251"});
        datosCais.add(new String[] {"CAI SANTA LIBRADA","CALLE 75 SUR # 1D-12 SUR","911 9660","-74.1160864","4.51474"});
        datosCais.add(new String[] {"CAI YOMASA","CARRERA 3D CON CALLE 91 SUR","773 4900","-74.1129212","4.5032822"});
        datosCais.add(new String[] {"CAI USME","CARRERA 5 CON CL 6 USME CENTRO","766 0381","0","0"});
        datosCais.add(new String[] {"CAI ANTONIO JOSÉ DE SUCRE","CARRERA 3 BIS ESTE CON CALLE 111 SUR","763 2944","-74.1169313","4.490698"});
        datosCais.add(new String[] {"CAI NUEVO PROVENIR","CARRERA 6 ESTE CON CALLE 100 SUR","762 4800","-74.1064597","4.491917"});
        datosCais.add(new String[] {"CAI DANUBIO AZUL","TRANSVERSAL 2 ESTE # 53D-82 SUR","205 4898","-74.0879281","4.5838019"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA TUNJUELITO","TRANSV. 33 # 48C-21 SUR ","740 2284-740 ","-74.1354558","4.5856354"});
        datosCais.add(new String[] {"CAI SAN CARLOS","DIAGONAL 51 CON CARRERA 18A-20 SUR","205 7215","-74.0725109","4.6390709"});
        datosCais.add(new String[] {"CAI TUNAL","CALLE 48C CON KRA. 24 SUR (ESQUINA)","714 0985","-74.1321406","4.5769997"});
        datosCais.add(new String[] {"CAI VENECIA","TRANSV. 44 SUR CON KRA. 53 SUR (ESQUINA)","711 9848","-74.1434147","4.5882326"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA BOSA","CALLE 65J SUR # 77N-23","780 7255-780","-74.1887212","4.6001443"});
        datosCais.add(new String[] {"CAI VILLA DEL RIO","CALLE 57B SUR # 71B -03","270 5062","-74.164419","4.5996001"});
        datosCais.add(new String[] {"CAI PIAMONTE","CARRERA 78C CON CALLE 69B BIS SUR","775 5388","-74.1922945","4.6020811"});
        datosCais.add(new String[] {"CAI LAURELES","CARRERA 87J CON CALLE 72 C SUR","776 2197","-74.1987832","4.6186934"});
        datosCais.add(new String[] {"CAI LIBERTAD","CARRERA 88C CON CALLE 59 SUR","783 7267","-74.1930229","4.6262675"});
        datosCais.add(new String[] {"CAI BRASILIA","CARRERA 87J CON CALLE 49C BIS SUR","785 9260","-74.1812961","4.6299139"});
        datosCais.add(new String[] {"CAI LA ESTACION","CARRERA 77G CON CALLE 63 SUR","775 9093","-74.1815597","4.5973947"});
        datosCais.add(new String[] {"CAI ANTONIA SANTOS","CALLE 63 CON CARRERA 81G SUR","777 8844","-74.1891945","4.6129192"});
        datosCais.add(new String[] {"CAI SAN JOSÉ","CARRERA 80 I # 79A SUR","4494437","-74.1726869","4.5680392"});
        datosCais.add(new String[] {"CAI METROVIVIENDA","CARRERA 97 CON CALLE 69 SUR","723 4049","-74.1861927","4.641014"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA KENNEDY","CALLE 41D SUR # 78N-05"," 264 2427-273","-74.1618369","4.6202949"});
        datosCais.add(new String[] {"CAI PLAZA DE LAS AMÉRICAS","AV. BOYACÁ CON AV. 1 DE MAYO","290 4677","-74.1342513","4.6043778"});
        datosCais.add(new String[] {"CAI ONEIDA","AV. 1 DE MAYO # 73-25","293 5095","-74.1471069","4.6187643"});
        datosCais.add(new String[] {"CAI PATIO BONITO","CALLE 26 SUR  CON CARRERA 87","299 9952","-74.1631064","4.6389261"});
        datosCais.add(new String[] {"CAI BRITALIA","CALLE 46 SUR CON CARRERA 81 H","293 4903","-74.1719707","4.6221366"});
        datosCais.add(new String[] {"CAI CALDAS","DIAGONAL 38 CON CARRERA 80","292 6298","-74.160228","4.6275396"});
        datosCais.add(new String[] {"CAI ROMA","CARRERA 80 CON CALLE 56A","777 4811","-74.1775453","4.6140101"});
        datosCais.add(new String[] {"CAI TECHO","CARRERA 78B # 0-26","299 7800","-74.1490794","4.6261531"});
        datosCais.add(new String[] {"CAI CASTILLA","CALLE 9 # 78C-15 SUR","292 7420","-74.1432419","4.6420121"});
        datosCais.add(new String[] {"CAI SOCORRO","CARRERA P 52 SUR CON CALLE 49","293 5102","-74.1418593","4.5917681"});
        datosCais.add(new String[] {"CAI TIMIZA","CARRERA 74 CON CALLE 43 SUR","448 4482","-74.1612991","4.6096298"});
        datosCais.add(new String[] {"CAI DELICIAS","AV. BOYACÁ CON CALLE 44 SUR","710 9606","-74.1471413","4.5991346"});
        datosCais.add(new String[] {"CAI VILLA CLAUDIA","CARRERA 68 I # 34-00 SUR","728 4069","-74.1376064","4.6096497"});
        datosCais.add(new String[] {"CAI BELLAVISTA","CARRERA 95 CON CALLE 42A SUR","454 9769","-74.1777403","4.6437841"});
        datosCais.add(new String[] {"CAI TINTAL","CALLE 6D CON CARRERA 87A-05 SUR","273 1936","-74.1556509","4.6450034"});
        datosCais.add(new String[] {"CAI MARSELLA","TRASVERSAL 70 CON CALLE 9A SUR","447 6681","-74.1319269","4.6354369"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA FONTIBÓN","CARRERA 98 # 16B-50","267 6757-267","-74.150511","4.6683357"});
        datosCais.add(new String[] {"CAI GRANJAS","CARRERA 68D # 21-10","412 7886","-74.1172793","4.6482076"});
        datosCais.add(new String[] {"CAI MACARENA","CARRERA 114 CON CALLE 16-99","415 6061 - 415 6001","-74.1578006","4.681018"});
        datosCais.add(new String[] {"CAI MODELIA","CARRERA 74 CON 24-00","263 8613","-74.1209276","4.6648643"});
        datosCais.add(new String[] {"CAI SANTANDER","CALLE 20D CON CARRERA 96C","298 1430","-74.1401276","4.6709891"});
        datosCais.add(new String[] {"CAI VERSALLES","CARRERA 109 CON CALLE 23-31","298 7957","-74.1458551","4.6846592"});
        datosCais.add(new String[] {"CAI SABANA GRANDE","CARRERA 106 CON CALLE 14-99","421 7431","-74.1600836","4.6690137"});
        datosCais.add(new String[] {"CAI HAYUELOS","CARRERA 80 CON CALLE 22","426 0853","-74.0645014","4.6674264"});
        datosCais.add(new String[] {"CAI CIUDAD SALITRE","CALLE 25 # 68D-00","350 380 6688","-74.1100542","4.6559531"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA ENGATIVÁ","CARRERA 78A # 70-54","251 9052-436","-74.1049887","4.690164"});
        datosCais.add(new String[] {"CAI ALAMOS","TRANSVERSAL 93 # 64G-00","276 0835","-74.1196756","4.6898337"});
        datosCais.add(new String[] {"CAI BACHUE","CALLE 89 # 95D-75","228 6621","-74.1049247","4.7165941"});
        datosCais.add(new String[] {"CAI ENGATIVA","CARRERA 123 # 64-65","442 2228","-74.1439909","4.7155547"});
        datosCais.add(new String[] {"CAI FERIAS","AVENIDA CALLE 72 # 69K-00","660 3703","-74.0927668","4.6828425"});
        datosCais.add(new String[] {"CAI FLORIDA","CARRERA 90 CON CALLE 69A-00","276 9807","-74.1132619","4.6938477"});
        datosCais.add(new String[] {"CAI NORMANDIA","AV. BOYACÁ CON CALLE 52-00","295 5919","-74.110234","4.6702943"});
        datosCais.add(new String[] {"CAI VILLA LUZ","CARRERA 77A CON CALLE 64B-00","251 0703","-74.1096491","4.6812908"});
        datosCais.add(new String[] {"CAI SERENA","AVENIDA CIUDAD DE CALI # 90-00","224 5535","-74.0967065","4.7099463"});
        datosCais.add(new String[] {"CAI QUIRIGUA","AV. CALLE 80 CON TRANSVERSAL 94-00","276 7763","-74.1099999","4.7063245"});
        datosCais.add(new String[] {"CAI CIUDADELA COLSUBSIDIO","CALLE 86A CON CARRERA 111C","435 0425","-74.1149607","4.724113"});
        datosCais.add(new String[] {"CAI VILLAS DE GRANADA","CARRERA 112A # 77A-30","229 5058","-74.1252773","4.7169188"});
        datosCais.add(new String[] {"CAI SANTA MARÍA DEL LAGO","CARRERA 76 CON CALLE 75-00","224 7211","-74.0988602","4.6932869"});
        datosCais.add(new String[] {"CAI JABOQUE","CALLE 67A # 110-00","433 2033","-74.1311694","4.7032195"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA SUBA","CARRERA 92 # 146-49","685 0646-685","-74.0874945","4.7396809"});
        datosCais.add(new String[] {"CAI AURES","CARRERA 101 # 131A-00","692 2230","-74.0988124","4.7333852"});
        datosCais.add(new String[] {"CAI ANDES","AV. SUBA CON CALLE 104","226 6898","-74.0683974","4.6919085"});
        datosCais.add(new String[] {"CAI COLINA CAMPESTRE","AVENIDA CARRERA 58 CON CALLE 131","226 8881","-74.0697434","4.7211467"});
        datosCais.add(new String[] {"CAI GAITANA","CALLE 139 # 118-03","689 5310","-74.1074785","4.7441488"});
        datosCais.add(new String[] {"CAI MAZUREN","CALLE 164 CON CARRERA 54","258 1012","-74.065896","4.6884537"});
        datosCais.add(new String[] {"CAI EL PINAR","CARRERA 93 # 152B-50","681 2338","-74.1091093","4.7059009"});
        datosCais.add(new String[] {"CAI RINCÓN","CARRERA CON CALLE 128C-10","682 1676","-74.0376549","4.7083146"});
        datosCais.add(new String[] {"CAI GUAYMARAL","AV.GUAYMARAL A CHIA","676 0076","-74.0860266","4.8366034"});
        datosCais.add(new String[] {"CAI LA ALHAMBRA","CALLE 116 CON CARRERA 54B","637 2437","-74.0673454","4.7012437"});
        datosCais.add(new String[] {"CAI VILLA DEL PRADO","CALLE 172 CON AUTOPISTA NORTE","671 6907","-74.0483186","4.7528859"});
        datosCais.add(new String[] {"CAI TIERRA LINDA","CALLE 127C # 49-00","627 8674","-74.0589812","4.7112602"});
        datosCais.add(new String[] {"CAI FONTANAR","CARRERA 136A CON CALLE 145","693 6376","-74.1124752","4.7536183"});
        datosCais.add(new String[] {"CAI SAN JOSÉ DE BAVARIA","CALLE 169 CON AV. BOYACÁ","321 300 0676","-74.0660876","4.7533298"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA BARRIOS UNIDOS","Calle 72 # 62-81","221 8404-240","-74.0838101","4.6741314"});
        datosCais.add(new String[] {"CAI MODELO","CALLE 68 # 56B-41","225 7969","-74.0816493","4.6681206"});
        datosCais.add(new String[] {"CAI POLO CLUB","CARRERA 24 CON CALLE 86A","236 6986","-74.0648666","4.6747832"});
        datosCais.add(new String[] {"CAI RIO NEGRO","CALLE 94 # 65A-29","226 3121","-74.0743867","4.6848583"});
        datosCais.add(new String[] {"CAI ALCAZARES","CALLE 71 CON CARRERA 24","225 2171","-74.0703109","4.6615452"});
        datosCais.add(new String[] {"CAI 7 DE AGOSTO","CARRERA 30 CON CALLE 64","660 2248","-74.0793957","4.6584883"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA TEUSAQUILLO","CARRERA 13 # 39-86","285 0825","-74.0694403","4.6272945"});
        datosCais.add(new String[] {"CAI ESMERALDA","CALLE 44C # 54-00","222 2673","-74.0945261","4.6455161"});
        datosCais.add(new String[] {"CAI GALERIAS","CALLE 53 # 25-01","217 9190","-74.0766958","4.6418323"});
        datosCais.add(new String[] {"CAI TEUSAQUILLO","CALLE 34 # 16-13","288 5252","-74.0735925","4.6233252"});
        datosCais.add(new String[] {"CAI SOLEDAD","CARRERA 24 # 41-00","288 6685","-74.0770397","4.6314603"});
        datosCais.add(new String[] {"CAI FEDERMAN","CARRERA 45 # 58A-10","222 2252","-74.0854319","4.64939"});
        datosCais.add(new String[] {"CAI SAN LUIS","CALLE 60 # 18-50","345 7366","-74.0712988","4.6478123"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA LOS MÁRTIRES","CR 24 # 12-32","247 8788","-74.0911501","4.6089982"});
        datosCais.add(new String[] {"CAI SAMPER MENDOZA","CARRERA 22 CON CALLE 24","269 6363","-74.0804992","4.6184436"});
        datosCais.add(new String[] {"CAI PALOQUEMAO","CARRERA 25 CON CALLE 17","201 2451","-74.0884402","4.6131014"});
        datosCais.add(new String[] {"CAI RICAURTE","CALLE 10 CON CARRERA 28","201 3344","-74.0955295","4.6089628"});
        datosCais.add(new String[] {"CAI SANTA ISABEL","CARRERA 27 CON CALLE 1F","201 9299","-74.1025329","4.5982777"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA ANTONIO NARIÑO","CARRERA 24 # 18-90 SUR","361 1635","-74.0789413","4.6161134"});
        datosCais.add(new String[] {"CAI CIUDAD BERNA","CALLE 11 # 10-03 SUR","280 4555","-74.0803456","4.6001118"});
        datosCais.add(new String[] {"CAI RESTREPO","DIAGONAL 12 SUR # 16-50","209 0909","-74.1000746","4.5866526"});
        datosCais.add(new String[] {"CAI VALVANERA","CALLE 17A SUR # 24G-18","209 3788","-74.1028636","4.5854494"});
        datosCais.add(new String[] {"CAI VILLA MAYOR","CALLE 36 SUR POR CARRERA 34D ESQUINA","203 1392","-74.1230503","4.5928336"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA PUENTE ARANDA","CARRERA 39 # 10-25","552 1110 Ext. 11610","-74.1048694","4.6172075"});
        datosCais.add(new String[] {"CAI LA ALQUERÍA","CALLE 43 CON CARRERA 52C","204 6738","-74.1378317","4.5962203"});
        datosCais.add(new String[] {"CAI GALAN","CARRERA 56 # 3A-96","290 4666","-74.1142849","4.6282596"});
        datosCais.add(new String[] {"CAI GORGONZOLA","AV. CALLE 6 CON TRANSVERSAL 42A","420 4738","-74.1083387","4.6191252"});
        datosCais.add(new String[] {"CAI PUENTE ARANDA","CALLE 8 SUR CON CARRERA 35 ESQUINA","446 2117","-74.1122052","4.6011097"});
        datosCais.add(new String[] {"CAI SANTA MATILDE","CALLE 8 SUR CON CARRERA 34","202 1630","-74.1118132","4.6008699"});
        datosCais.add(new String[] {"CAI TEJAR","AV. CARRERA 68 CON AV. 1 DE MAYO","230 3203","-74.1322067","4.6101214"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA CANDELARIA","CRA 7 No. 6ª-12","2806316","-74.0757442","4.6013169"});
        datosCais.add(new String[] {"CAI BOLVIA","CRA 10 CON CALLE 7","2804466","-74.082637","4.5959893"});
        datosCais.add(new String[] {"CAI ROSARIO","AV JIMENEZ NO. 5-00","2860744","-74.0745041","4.600998"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA RAFAEL URIBE","CALLE 27 SUR # 24C-51","272 8879","-74.1127625","4.5856479"});
        datosCais.add(new String[] {"CAI CLARET","CALLE 44 SUR # 27-50","205 9006","-74.1292743","4.5836052"});
        datosCais.add(new String[] {"CAI DIANA TURBAY","CALLE 48C SUR # 1-03","772 0153","-74.1039911","4.5462891"});
        datosCais.add(new String[] {"CAI LOMAS","DIAGONAL 38 D SUR # 11-00","272 7220","-74.1098449","4.5639566"});
        datosCais.add(new String[] {"CAI LOS MOLINOS","CALLE 49D BIS SUR # 5U-03","769 2199","-74.119671","4.5547714"});
        datosCais.add(new String[] {"CAI CENTENARIO","CARRERA 24 No. 24 - 06 SUR","720 1440","-74.0814459","4.6194685"});
        datosCais.add(new String[] {"CAI GUSTAVO RESTREPO","CALLE 31A SUR # 13A-00","209 1111","-74.1086686","4.573435"});
        datosCais.add(new String[] {"CAI SAN JORGE","TRANSVERSAL 16 # 45F-02 SUR","714 4220","-74.072391","4.6338129"});
        datosCais.add(new String[] {"CAI PALERMO SUR","CARRERA 2B # 52B-06","760 4317","-74.1186309","4.613004"});
        datosCais.add(new String[] {"ESTACIÓN DE POLICÍA CIUDAD BOLÍVAR","Diagonal 70 Sur # 54-14","731 3145","-74.1665666","4.5768753"});
        datosCais.add(new String[] {"CAI VISTA HERMOSA","CALLE 70 # 18I-70","765 1121","-74.0953046","4.6815895"});
        datosCais.add(new String[] {"CAI LUCERO","CALLE 64 # 71 G 54","765 8363","-74.1030606","4.6749119"});
        datosCais.add(new String[] {"CAI COMPARTIR","TRANSVERSAL 18T CON CALLE 66 SUR","731 3924","-74.1486643","4.5570031"});
        datosCais.add(new String[] {"CAI SAN FRANCISCO","CARRERA 20C # 67-10","716 9661","-74.0698513","4.6568154"});
        datosCais.add(new String[] {"CAI LA CANDELARIA","AVENIDA VILLAVICENCIO CON 43","715 1934","-74.1646968","4.6151325"});
        datosCais.add(new String[] {"CAI PERDOMO","CARRERA 73 # 63A-12","775 4486","-74.1709526","4.5866772"});
        datosCais.add(new String[] {"CAI LA JOYA","CARRERA 18B CON CALLE 80B","766 1001","-74.1455748","4.5376742"});
        datosCais.add(new String[] {"CAI SANTO DOMINGO","CARRERA 77C # 69 A 05","780 7304","-74.1052146","4.6884333"});
        datosCais.add(new String[] {"CAI ARBORIZADORA ALTA","CARRERA 42 # 73-00","731 8534","-74.1654274","4.5682715"});
        datosCais.add(new String[] {"CAI PARAISO","CALLE 71P # 27M-04","790 2883","-74.1655266","4.549387"});



        //colocar infos cais        
        for(String[] s: datosCais){                                                                     
            infoCais.add(new InfoWindow(map));                      
            marcaCais.add(new Marker(map));
                        
        }
        //numero posicion estaciones de policia
        int num[]={0,10,20,34,44,53,57,67,83,92,106,120,126,133,138,143,150,153,162};            
        for(int i=0;i<infoCais.size();i++){
             
            marcaCais.get(i).setIcon(new Icon());
            marcaCais.get(i).setPosition(new LatLng(Double.parseDouble(datosCais.get(i)[4]),Double.parseDouble(datosCais.get(i)[3])));  
            
            Icon icono= new Icon();
            if(i==num[0]||i==num[1]||i==num[2]||i==num[3]||i==num[4]||i==num[5]||i==num[6]||i==num[7]||i==num[8]||i==num[9]||i==num[10]||
                    i==num[11]||i==num[12]||i==num[13]||i==num[14]||i==num[15]||i==num[16]||i==num[17]||i==num[18]){
                
                icono.loadFromFile("src/img/estacion.png");
            }
            else{
                
                icono.loadFromFile("src/img/cai.png");                
            }
                
            marcaCais.get(i).setIcon(icono);
            infoCais.get(i).setContent("<HTML><B>"+datosCais.get(i)[0]+"</B><BR><I>DIRECCIÓN:</I> "+datosCais.get(i)[1]+"<BR><I>TELÉFONO:</I> "+datosCais.get(i)[2]+"</HTML>"); 
            marcaCais.get(i).addEventListener("click",new eventoMapa(map,i));
            
        }
        
        

        
        
    }
    
    /**
     * clase de evento mapa
     */
    private class eventoMapa extends MapMouseEvent{
        private Map map;
        private int i;
        public eventoMapa(Map map,int i){
            this.map = map;
            this.i =i;
        }
        @Override
        public void onEvent(MouseEvent me){                     
            infoCais.get(i).open(map,marcaCais.get(i));
            pos=i;            
            for(int j=0;j<infoCais.size();j++){
                if(j!=i){
                    infoCais.get(j).close();
                }
            }
            map.setZoom(16.0);
        }
        
    }
    
    /**
     * cambiar estilo del mapa estilo policia
     * @param map mapa   
     * @param hue color en html 
     */
    private void estiloPolicia(Map map, String hue) {
        
        MapTypeStyle style = new MapTypeStyle();        
        style.setElementType(MapTypeStyleElementType.ALL);        
        style.setFeatureType(MapTypeStyleFeatureType.ALL);
        MapTypeStyler styler = new MapTypeStyler();        
        styler.setHue(hue);
        // Setting a new saturation value the map types styler object
        styler.setSaturation(-20);
        // Setting a new visibility type value the map types styler object
        styler.setVisibility("simplified");
        // Setting a new gamma value the map types styler object
        styler.setGamma(0.5);
        // Setting a new weight value the map types styler object
        styler.setWeight(0.5);
        // Applying the map type styler to the map style object
        style.setStylers(new MapTypeStyler[]{styler});        
        MapTypeStyler roadStyler = new MapTypeStyler();
        // Setting a new lightness value the road styler object
        roadStyler.setLightness(100);
        // Setting a new visibility type value the road styler object
        roadStyler.setVisibility("simplified");
        // Creating a map type style object for roads
        MapTypeStyle roadStyle = new MapTypeStyle();
        // Styling will be applied to geometry elements
        roadStyle.setElementType(MapTypeStyleElementType.GEOMETRY);
        // Styling will be applied to roads
        roadStyle.setFeatureType(MapTypeStyleFeatureType.ROAD);
        // Applying the road styler to road style object
        roadStyle.setStylers(new MapTypeStyler[]{roadStyler});
        MapTypeStyle[] styles = {style, roadStyle};
        // Creating a styled map type with the previously created styles
        StyledMapType styledMap = new StyledMapType(map, styles);        
        StyledMapType verdeMap = styledMap;
        map.mapTypes().set("Policia", verdeMap);
        map.setMapTypeId(new MapTypeId("Policia"));     
        
    }
    
    /**
     * algoritmo cai mas cercano
     * @param lat latitud ubicacion usuario
     * @param lon longitud ubicacion usuario
     * @return posición
     */
    public int caiMasCercano(Double lat, Double lon){
        double minValor=1000000000;
        int minPos=0;
        
        ArrayList <Double> distancia= new ArrayList<>();        
        
        for(int i=0;i<datosCais.size();i++){
        double dis = Math.sqrt(Math.pow(lat-Double.parseDouble(datosCais.get(i)[4]),2)+Math.pow(lon-Double.parseDouble(datosCais.get(i)[3]),2));
            distancia.add(dis);
            if(minValor>distancia.get(i)){
                minValor=distancia.get(i);
                minPos=i;
            }
        }
        System.out.println(minPos+"*"+minValor+"*"+datosCais.size());
        return minPos;   
    }
            
        
    
    
}
