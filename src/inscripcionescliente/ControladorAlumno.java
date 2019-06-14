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
 * @author tomas
 */
public class ControladorAlumno {
   private List<Alumno> alumnos;
   
   public ControladorAlumno(String json){
       alumnos = new ArrayList<Alumno>();
       //https://stackoverflow.com/questions/5554217/google-gson-deserialize-listclass-object-generic-type
       //Es un truco para poder parsear el json a un tipo de dato "<List>Alumno".
       Type listType = new TypeToken<ArrayList<Alumno>>(){}.getType();
       alumnos = new Gson().fromJson(json, listType);
   }
   
   public void imprimirLista(){
       
       System.out.format("+-----------+------+--------------+---------------+---------------+--------------+----------+------------------------------+----------------+%n");
       System.out.format("|    RUT    |  DV  |    Nombre    |   ApellidoP   |   ApellidoM   |   FechaNac   |   Sexo   |            Correo            |     Comuna     |%n");
       System.out.format("+-----------+------+--------------+---------------+---------------+--------------+----------+------------------------------+----------------+%n");
       
       for (Alumno alumno : alumnos) {
           alumno.imprimirAlumno();
       System.out.format("+-----------+------+--------------+---------------+---------------+--------------+----------+------------------------------+----------------+%n");
       }
   }
    
}
