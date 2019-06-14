/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;





/**
 *
 * @author tarkus
 */
public class InscripcionesCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewJerseyClient jc = new NewJerseyClient();
        //System.out.println(jc.getJson());
        mostrarAlumnos(jc.getJson());
        
    }
    
    
        
   public static void mostrarAlumnos(String json){
       
       Gson gson = new Gson();
       JSONParser parser = new JSONParser();
       
       ControladorAlumno alumnos = new ControladorAlumno();
       
       try{
       
           
           alumnos=gson.fromJson(json,ControladorAlumno.class);
           System.out.println("asd");
           System.out.println(alumnos);
           if(alumnos != null){
               for(Alumno a : alumnos.getAlumnos()){
                   System.out.println(a.getApMaterno());
               }
           }
       }catch(Exception e){
           
       }
       
   }
            
    
}

