/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcionescliente;


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
       try{
        String json = jc.getJson();  
        ControladorAlumno alumnos = new ControladorAlumno(json);   
        alumnos.imprimirLista();
       }catch(Exception e){
        System.out.println("ERROR: No se puedo conectar a la API!");
       }
       
    }        
}