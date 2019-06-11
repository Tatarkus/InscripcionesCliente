/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;

import java.util.Iterator;
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
        try{
            
            Object obj = parser.parse(alumnos);
            
            JSONArray array = (JSONArray) obj;
            
            for(Iterator iterator = array.iterator(); iterator.hasNext();){
                
                Object next = iterator.next();
                JSONObject json = (JSONObject) next;
                System.out.println(json.get("run")+"-"+json.get("dv"));
                
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
                
        }
        
        
    }
            
    
}

