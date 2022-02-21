
package entidades;


public class Perro {
    
    private String nombreDelPerro;
    private String razaDelPerro;
    private int edad;
    private double tamaño;

    public Perro() {
    }

    public Perro(String nombreDelPerro, String razaDelPerro, int edad, double tamaño) {
        this.nombreDelPerro = nombreDelPerro;
        this.razaDelPerro = razaDelPerro;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombreDelPerro() {
        return nombreDelPerro;
    }

    public void setNombreDelPerro(String nombreDelPerro) {
        this.nombreDelPerro = nombreDelPerro;
    }

    public String getRazaDelPerro() {
        return razaDelPerro;
    }

    public void setRazaDelPerro(String razaDelPerro) {
        this.razaDelPerro = razaDelPerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreDelPerro=" + nombreDelPerro + ", razaDelPerro=" + razaDelPerro + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
    
    
    
    
    
    
}
