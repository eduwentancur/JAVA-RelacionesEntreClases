package Principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AdoptarService {

    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    private Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public AdoptarService() {
        this.personas = new ArrayList<>();

        this.perros = new ArrayList<>();

    }

    public void sistemaAdopcion() {

        
        System.out.println("CUANTAS PERSONAS Y PERRO DESEA INGRESAR?");
        int cantidad = teclado.nextInt();
        crearPerros(cantidad);
        crearPersonas(cantidad);
        adoptacionPerro();
        mostrarPersonasCompleto();

    }

    public void crearPerros(int cantidad) {
        int i = 0;
        while (i < cantidad) {
            Perro perro = new Perro();
            System.out.println("Ingrese nombre del PERRO NUEVO");
            perro.setNombreDelPerro(teclado.next());
            System.out.println("Ingrese raza del PERRO");
            perro.setRazaDelPerro(teclado.next());
            System.out.println("Ingrese edad del Perro");
            perro.setEdad(teclado.nextInt());
            System.out.println("Ingrese tamaño del Perro");
            perro.setTamaño(teclado.nextDouble());

            addPerro(perro);

            i++;

        }
        mostrarNombrePerros();

    }

    public void addPerro(Perro perro) {
        this.perros.add(perro);
    }

    //pedimos la informacion a la persona
    public void crearPersonas(int cantidad) {
        int i = 0;
        while (i < cantidad) {
            Persona persona = new Persona();
            System.out.println("Ingrese nombre de la PERSONA NUEVA");
            persona.setNombreDeLaPersona(teclado.next());
            System.out.println("Ingrese su apellido");
            persona.setApellidoDeLaPersona(teclado.next());
            System.out.println("Ingrese edad");
            persona.setEdad(teclado.nextInt());
            System.out.println("Ingrese su documento");
            persona.setDocumento(teclado.nextLong());

            addPerson(persona);
            i++;
        }
        mostrarNombrePersonas();
    }

    public void addPerson(Persona persona) {
        this.personas.add(persona);
    }

    public void mostrarNombrePerros() {

        for (Perro aux : perros) {
            System.out.println(aux);
        }

    }

    public void mostrarNombrePersonas() {

        for (Persona aux : personas) {
            System.out.println(aux);
        }

    }

    public void mostrarPerroCompleto() {

        for (Perro aux : perros) {
            System.out.println(aux.toString());
        }

    }

    public void adoptacionPerro() {
        int opc;
        do {
            System.out.println("SISTEMA DE ADOPTACION DE PERROS");
            System.out.println("Desea adoptar un perro?");
            System.out.println("1- Si");
            System.out.println("2- No");
            opc=teclado.nextInt();
            if (opc == 1) {
                adoptarPerro();

            }else{
                if (opc==2) {
                    System.out.println("CHAUU!!!");
                }else{
                    System.out.println("INGRESO NUEMERO INCORRECTO");
                
                }
            }

        } while (opc != 2);

    }

    public void adoptarPerro() {

        System.out.println("Ingrese nombre de la persona que quiere adoptar");
        String nomPerson = teclado.next();

        for (Persona aux : personas) {
            if (aux.getNombreDeLaPersona().equals(nomPerson)) {
                mostrarPerroCompleto();
                System.out.println("INGRESE EL NOMBRE DEL PERRO QUE DESEA ADOPTAR");
                String nombrePerro = teclado.next();
                for (Perro aux1 : perros) {
                    if (aux1.getNombreDelPerro().equals(nombrePerro)) {
                        aux.setPerro(aux1);
                        System.out.println("FELICITACIONES ACABA DE ADOPTAR UN PERRO!!!");
                    }
                }

            }

        }

    }

    public void mostrarPersonasCompleto() {

        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }

    }

}
