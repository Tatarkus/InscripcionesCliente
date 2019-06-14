/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author tarkus
 */
public class InscripcionesCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       NewJerseyClient jc = new NewJerseyClient();
       String json = jc.getJson();  
       ControladorAlumno alumnos = new ControladorAlumno(json);   
       alumnos.imprimirLista();
    }        
}