package Logica;

import com.teamdev.jxmaps.GeocoderCallback;
import com.teamdev.jxmaps.GeocoderRequest;
import com.teamdev.jxmaps.GeocoderResult;
import com.teamdev.jxmaps.GeocoderStatus;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;


/**
 *
 * @author alvar
 */
public class Geolocalizar extends MapView {
    
    
    /**
     * ruta del archivo
     */
    private String rutaArchivo="";
    /**
     * latitud  localizacion
     */
    private String latitud="";
    /**
     * longitud  localizacion
     */
    private String longitud="";
    
    
    /**
     * lugar corespondiente a las coordenadas
     */
    private String lugar="";
    
    
    /**
     * abrir navegador con la URL
     * @param URL direccion de la pagina web
     */
    private void abrirNavegador(String URL){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException ex) {                    
                }
            }
        }
    } 
    /**
     * obtener el lugar
     * @return lugar
     */
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    /**
     * obtener ruta del archivo
     * @return ruta arhcivo
     */
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    /**
     * obtener latitud de ubicacion
     * @return latitud
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * obtener longitud de ubicacion
     * @return longitud
     */
    public String getLongitud() {
        return longitud;
    }
    
    /**
     * busca un archivo en un directorio 
     * @param archivo nombre del archivo a buscar
     * @param directorio nombre del directorio en donde se va abuscar
     */
    private void buscarArchivo (String archivo,File directorio) {       
        File[] list = directorio.listFiles();        
        if(list!=null){
            for (File fil : list){
                if (fil.isDirectory()){
                    buscarArchivo(archivo,fil);
                }                
                else if (archivo.equalsIgnoreCase(fil.getName())){                    
                    rutaArchivo = fil.getPath();                                       
                }
            } 
        }
        
    }
    
    /**
     * captura las coordenadas del usuario
     * @return estado de obtencion de coodenadas
     */
    public boolean capturarCoordenadas(){
        
        File file = new File("src/Logica/capturarUbicacion.html");
        
        try{
            String h = "file://"+file.toURL().getPath();
            abrirNavegador(h);
        }catch(MalformedURLException e){
            
        }
        
        buscarArchivo("coordenadas.txt",new File("C:/"));        
        File archivo = new File(rutaArchivo);        
        System.out.println(archivo.exists());        
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            try{
                String linea = br.readLine();
                br.close();
                fr.close();
                for(int i=0;i<linea.length();i++){
                    if(linea.charAt(i)==' '){
                        latitud=linea.substring(0, i-1);
                        longitud=linea.substring(i+1,linea.length());
                        System.out.println(longitud + " "+latitud);
                        archivo.delete();
                        obtenerLugar();                        
                        return true;
                                                
                    }                                        
                }
                
            }catch(IOException e){
                System.out.println("Error IOException");
                return false;
            }
        }catch(FileNotFoundException e){
            return false;
        }
        return false;  
    }
    /**
     * Obtener el lugar o ubiciacion apartir de las coordenadas
     */
    private void obtenerLugar(){
        Map map = getMap();
        
        GeocoderRequest request = new GeocoderRequest();
        request.setAddress(latitud+" "+longitud);
        int con = 0;
        while(con<11){
                getServices().getGeocoder().geocode(request, new GeocoderCallback(map) {
                    @Override
                    public void onComplete(GeocoderResult[] results, GeocoderStatus status) {
                        // Checking operation status
                        if ((status == GeocoderStatus.OK) && (results.length > 0)) {
                            // Getting the first result
                            GeocoderResult result = results[0];
                            // Getting a location of the result
                            LatLng location = result.getGeometry().getLocation();
                            lugar=result.getFormattedAddress();
                            System.out.println(result.getFormattedAddress()+" "+location.toString());
                        }
                    } 
                    });
                con++;
                System.out.println(lugar+" 8544654465");
        }
        
    }
    
    
    
    
    
    
}
