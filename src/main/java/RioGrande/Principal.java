
package RioGrande;

/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 27/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
Reto 5 : Proyecto final para el Paradigma Orientado  a Objetos
*/

//Clase que contiene lo que se va a realizar
public class Principal { 
     public static void main (String [] args) {
         
         //Creaccion del objeto que se mostrará en pantalla
         Alumno alumno = new Alumno("","","","","");
         alumno.interfaceR();
         Alumno A= new Alumno("0001","Jose" ,"Lopez" , "ljose@gmail.com     ", "      10");
         A.imprimirPerfil();
      
         
         Alumno B= new Alumno ("0002", "Luis Alberto", "Castro", "castroluis15@gmail.com     ", "8");
         B.imprimirPerfil();
        
         
          Alumno C= new Alumno ("0003", "Maria", "Mancio", "maria25@gmail.com     ", "     9");
         C.imprimirPerfil();
         
         Tutor tutor = new Tutor("","","","","","");
         tutor.interfaceR();
         Tutor tutor1 = new Tutor("001", "Adrian", "Gonzalez", "gonzadrian1@gmail.com", "        0001", "     10");
         tutor1.imprimirPerfil();
         
          Tutor tutor2 = new Tutor("002", "Luisa", "Hernandez", "hernandezluisa2@gmail.com", "    0003", "  9");
         tutor2.imprimirPerfil(); 
         
         Tutor tutor3 =new Tutor("003", "Enrique", "Maldonado", "menrique12@gmail.com", "         0002", "       8");
         tutor3.imprimirPerfil();
         
         Maestro maestro = new Maestro("","","","");
         maestro.interfaceR();
         Maestro M1 = new Maestro("01", "David", "Rámirez", "ramdavid95@gmail.com");
         M1.imprimirPerfil();
         
         Maestro M2 = new Maestro("02", "Josefa", "Mendez", "mendezjos@gmail.com");
         M2.imprimirPerfil();
     }
}
