import java.io.Serializable;

public class Persona implements Serializable {
   private int edad;
   private String nombre;
   private String apellido;
   private String DNI;
   private String sexo;

    public Persona(int edad, String nombre, String apellido, String DNI,String sexo) {
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public Persona(Persona persona) {
        this.edad = persona.edad;
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
        this.DNI = persona.DNI;
        this.sexo = persona.sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + edad + " " + sexo +" " + DNI;
    }
}
