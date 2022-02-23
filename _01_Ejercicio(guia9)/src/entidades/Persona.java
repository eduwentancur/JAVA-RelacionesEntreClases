
package entidades;


public class Persona {

    private String nombreDeLaPersona;
    private String apellidoDeLaPersona;
    private int edad;
    private long documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombreDeLaPersona, String apellidoDeLaPersona, int edad, long documento) {
        this.nombreDeLaPersona = nombreDeLaPersona;
        this.apellidoDeLaPersona = apellidoDeLaPersona;
        this.edad = edad;
        this.documento = documento;
        
    }

    public String getNombreDeLaPersona() {
        return nombreDeLaPersona;
    }

    public void setNombreDeLaPersona(String nombreDeLaPersona) {
        this.nombreDeLaPersona = nombreDeLaPersona;
    }

    public String getApellidoDeLaPersona() {
        return apellidoDeLaPersona;
    }

    public void setApellidoDeLaPersona(String apellidoDeLaPersona) {
        this.apellidoDeLaPersona = apellidoDeLaPersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return String.format("Persona : Nombre y Apellido: %s %s Edad: %d años Documento: %d Perro:%s ", nombreDeLaPersona,apellidoDeLaPersona,edad, documento,perro );
    }
    
    
    
    
    
    
    
   
    
    
    
    
    
    
}
