package servicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entidades.Perro;
import entidades.Persona;

public class AdoptarService {
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;
    private Scanner teclado;

    public AdoptarService() {
        this.personas = new ArrayList<>();
        this.perros   = new ArrayList<>();
        this.teclado  = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void sistemaAdopcion(Perro perro1, Perro perro2, Persona persona1, Persona persona2) {
        agregarPerros(perro1, perro2);
        agregarPersonas(persona1, persona2);
        adopcionPerro();
        mostrarPersonas();
    }

    public void agregarPerros(Perro perro1, Perro perro2) {
        this.perros.add(perro1);
        this.perros.add(perro2);
    }

    public void agregarPersonas(Persona persona1, Persona persona2) {
        this.personas.add(persona1);
        this.personas.add(persona2);
    }

    public void adopcionPerro() {
        int agregado=0;
        System.out.println("---LISTA DE PERSONAS---");
        mostrarPersonas();
        do {
            System.out.println("Ingrese nombre de la persona que quiere adoptar(DEBE ESTAR EN LA LISTA)");
            String nomPerson = teclado.next();
            for (Persona aux : personas) {
                if (aux.getNombreDeLaPersona().equals(nomPerson)) {
                    System.out.println("---LISTA DE PERROS---");
                    mostrarPerros();
                    System.out.println("INGRESE EL NOMBRE DEL PERRO QUE DESEA ADOPTAR");
                    String nombrePerro = teclado.next();
                    for (Perro aux1 : perros) {
                        if (aux1.getNombreDelPerro().equals(nombrePerro)) {
                            aux.setPerro(aux1);
                            agregado++;
                            perros.remove(aux1);
                            System.out.println("FELICITACIONES ACABA DE ADOPTAR UN PERRO!!!");
                            break;
                        }
                    }
                }
                if (agregado==1) {
                    for (Persona persona : personas) {
                        if (persona.getPerro()==null) {
                            for (Perro perro : perros) {
                                persona.setPerro(perro);
                                agregado++;
                            }
                        }
                    }
                }
            }
        } while (agregado!=2);
    }
    
    public void mostrarPersonas(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
    public void mostrarPerros(){
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }
}
