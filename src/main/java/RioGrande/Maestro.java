
package RioGrande;
/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 27/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
Reto 5 : Proyecto final para el Paradigma Orientado  a Objetos
*/

//Clase hija con implementacion de interface y metodo abstracto heredado
public class Maestro extends persona implements IRioGrande {

        //Constructor heredado
    public Maestro(String id, String nombre, String apellido, String Email) {
        super(id, nombre, apellido, Email);
    }
    
    //Metodo de la interfaz
      @Override
    public void interfaceR() {
  System.out.println("MAESTRO");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.printf(" %-15s %-15s %-15s %-15s",  "Id",  "Nombre",  "Apellido", " Email");
   System.out.println("\n" + "---------------------------------------------------------------------------------------"); 
    }
    
    //Metodo abstracto heredado que imprime los datos
  @Override
    public void imprimirPerfil(){
        System.out.format(" %-15s %-15s %-15s %-15s ",  getId(), getNombre(), getApellido(), getEmail());
    System.out.println();
      System.out.println("\n" + "---------------------------------------------------------------------------------------");
       }

  
}
