/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class ControladorAlumno {
   public List<Alumno> alumnos;
   
   public ControladorAlumno(){
       alumnos = new ArrayList<Alumno>();
   }
   
   public List<Alumno> getAlumnos(){
       return alumnos;
   }
   
   public void setAlumnos(List<Alumno> alumnos){
       this.alumnos=alumnos;
   }
    
}
