/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;

import com.google.gson.Gson;
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
    
    
        
   
    public static void mostrarAlumnos(String alumnos){
        JSONParser parser = new JSONParser();
        Gson gson = new Gson();
        try{
           
            Object obj = parser.parse(alumnos);
            
            JSONArray array = (JSONArray) obj;
            
            //List<Alumno> al = gson.fromJson(alumnos, List<Alumno.class>);
            
            for(Iterator iterator = array.iterator(); iterator.hasNext();){
               
                Object next = iterator.next();
                JSONObject json = (JS) next;
                System.out.println(json.get("run")+"-"+json.get("dv"));
                
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
                
        }
        
        
    }
            
    
}

