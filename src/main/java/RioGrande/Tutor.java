
package RioGrande;
/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 27/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
Reto 5 : Proyecto final para el Paradigma Orientado  a Objetos
*/

//Clase hija que hereda de la clase alumno
public class Tutor extends Alumno implements IRioGrande {
    
    //agregamos el id del alumno para identificarlo con la calificacion
private String IDAlumno;

    //Constructor heredado
    public Tutor(String id, String nombre, String apellido, String Email, String IDAlumno, String calificacion ) {
        super(id, nombre, apellido, Email, calificacion);
        this.IDAlumno=IDAlumno;
    }

   
    
    //Metodo de la interfaz
        @Override
    public void interfaceR() {
         System.out.println("Tutor");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.printf(" %-15s %-15s %-15s %-15s %20s %15s",  "Id",  "Nombre",  "Apellido", " Email", "ID Alumno", "Calificación");
   System.out.println("\n" + "-------------------------------------------------------------------------------------------------------"); 
    }

//Metodo abstracto heredado que imprime los datos
 @Override
    public void imprimirPerfil(){
     System.out.format(" %-15s %-15s %-15s %-15s %-15s %-15s",  getId(), getNombre(), getApellido(), getEmail(), IDAlumno, getCalificacion() );
    System.out.println();
      System.out.println("\n" + "-------------------------------------------------------------------------------------------------------");
       }


}