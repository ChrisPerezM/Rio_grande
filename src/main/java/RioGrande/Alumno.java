
package RioGrande;
/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 27/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
Reto 5 : Proyecto final para el Paradigma Orientado  a Objetos
*/

//Clase hija con implementacion de interface y metodo abstracto heredado
public class Alumno extends persona implements IRioGrande {
private String calificacion;

//Metodo de la interfaz
  @Override
    public void interfaceR() {
          System.out.println("ALUMNO");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.printf(" %-15s %-15s %-15s %-15s %20s",  "Id",  "Nombre",  "Apellido", " Email", "Calificación");
   System.out.println("\n" + "---------------------------------------------------------------------------------------"); 
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
    //Constructor heredado
public Alumno(String id, String nombre, String apellido, String Email, String calificacion) {
        super( id, nombre, apellido, Email);
        this.calificacion = calificacion;
    }


//Metodo abstracto heredado que imprime los datos
    @Override
    public void imprimirPerfil(){  
        
       System.out.format(" %-15s %-15s %-15s %-15s %-30s",  getId(), getNombre(), getApellido(), getEmail(), getCalificacion() );
    System.out.println();
      System.out.println("\n" + "---------------------------------------------------------------------------------------");
    }

  
   
  
       
    
}
