
package RioGrande;
/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 27/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
Reto 5 : Proyecto final para el Paradigma Orientado  a Objetos
*/
//Creamos la clase padre de forma abstracta
public abstract class persona {
    
    //Encapsulamiento de atributos
    private String id; 
    private String nombre;
    private String apellido;
    private String Email;


//Constructor de la clase
    public persona(String id, String nombre, String apellido, String Email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Email= Email;
    }

      //Metodo abstractos
    public abstract void imprimirPerfil();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    }

