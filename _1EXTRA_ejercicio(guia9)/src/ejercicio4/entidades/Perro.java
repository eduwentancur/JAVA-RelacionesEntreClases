

package ejercicio4.entidades;

import ejercicio4.enumeraciones.TamañoCanino;


public class Perro {

    private String nombreDelPerro;
    private String razaDelPerro;
    private int edad;
    private TamañoCanino tamaño;

    public Perro() {
    }

    public Perro(String nombreDelPerro, String razaDelPerro, int edad, TamañoCanino tamaño) {
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

    public TamañoCanino getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoCanino tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %-5s | Raza: %-5s | Edad: %s años | Tamaño: %-5s \n",nombreDelPerro, razaDelPerro, edad, tamaño );
    }
}
