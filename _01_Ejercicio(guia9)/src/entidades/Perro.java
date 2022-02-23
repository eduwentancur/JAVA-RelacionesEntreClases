
package entidades;

import enumeraciones.TamañoAnimal;


public class Perro {
    
    private String nombreDelPerro;
    private String razaDelPerro;
    private int edad;
    private TamañoAnimal tamaño;

    public Perro() {
    }

    public Perro(String nombreDelPerro, String razaDelPerro, int edad, TamañoAnimal tamaño) {
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

    public TamañoAnimal getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoAnimal tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreDelPerro=" + nombreDelPerro + ", razaDelPerro=" + razaDelPerro + ", edad=" + edad + ", tamaño=" + tamaño + '}';
    }
    
    
    
    
    
    
    
    
    
}
