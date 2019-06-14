package inscripcionescliente;
// Generated Jun 7, 2019 5:55:30 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private int run;
     private String dv;
     private String nombre;
     private String apPaterno;
     private String apMaterno;
     private String fecNac;
     private String sexo;
     private String correo;
     private String comuna;

    public Alumno() {
    }

    public Alumno(int run, String dv, String nombre, String apPaterno, String apMaterno, String fecNac, String sexo, String correo, String comuna) {
       this.run = run;
       this.dv = dv;
       this.nombre = nombre;
       this.apPaterno = apPaterno;
       this.apMaterno = apMaterno;
       this.fecNac = fecNac;
       this.sexo = sexo;
       this.correo = correo;
       this.comuna = comuna;
    }
    
    public void imprimirAlumno(){
        String formato = "| %-9s |  %-1s   |   %-11s|  %-11s  |  %-10s   | %-12s |%-10s| %-29s|  %-13s |%n";
        System.out.format(formato, String.valueOf(run),dv,nombre,apPaterno,apMaterno,fecNac,sexo,correo,comuna);

    }
   


}


