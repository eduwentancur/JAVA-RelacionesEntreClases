package ejercicio4.servicios;

import ejercicio4.entidades.Perro;
import ejercicio4.entidades.Persona;
import ejercicio4.enumeraciones.TamañoCanino;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Scanner;

public class ServicioDeAdopcion {

    ArrayList<Persona> personas;
    ArrayList<Perro> perros;
    private Scanner teclado;

    public ServicioDeAdopcion() {
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void Adopcion() {
        int cantidad = cantidadIngresada();
        datosPerros(cantidad);
        datosPersonas(cantidad);
        mostrarPerros();
        adoptarPerro();
        mostrarPersonas();
    }

    public int cantidadIngresada() {
        System.out.println("Cuantas personas y perros desea ingresar?");
        return teclado.nextInt();
    }

    public void datosPerros(int cantidad) {
        this.perros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Perro perro = new Perro();
            System.out.println("Ingrese nombre del perro NUEVO");
            perro.setNombreDelPerro(teclado.next());
            System.out.println("Ingrese raza del perro");
            perro.setRazaDelPerro(teclado.next());
            System.out.println("Ingrese la edad del perro");
            perro.setEdad(teclado.nextInt());
            System.out.println("Ingrese el tamaño del perro GRANDE/MEDIANO/CHIQUITO ");
            String tamanio = teclado.next();
            for (TamañoCanino t : EnumSet.range(TamañoCanino.GRANDE, TamañoCanino.CHIQUITO)) {
                if (tamanio.equalsIgnoreCase(t.toString())) {
                    perro.setTamaño(t);
                }
            }
            perros.add(perro);
        }

    }

    public void datosPersonas(int cantidad) {
        this.personas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Persona persona = new Persona();
            System.out.println("Ingrese nombre de la Persona NUEVA");
            persona.setNombreDeLaPersona(teclado.next());
            System.out.println("Ingrese apellido de la persona");
            persona.setApellidoDeLaPersona(teclado.next());
            System.out.println("Ingrese edad");
            persona.setEdad(teclado.nextInt());
            System.out.println("Ingrese numero de documento");
            persona.setDocumento(teclado.nextInt());
            personas.add(persona);
        }
    }

    public void mostrarPerros() {
        System.out.println("BIENVENIDO AL SISTEMA DE ADOPCION DE PERROS");
        System.out.println("---LISTA DE PERROS---");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public void adoptarPerro() {
        for (int i = 0; i < personas.size(); i++) {
            int contAdoptado = 0;
            do {
                System.out.printf("%s que perro desea adoptar? Ingrese nombre del perro\n", personas.get(i).getNombreDeLaPersona().toUpperCase());
                String nombrePerro = teclado.next();
                for (Perro perro : perros) {
                    if (nombrePerro.equalsIgnoreCase(perro.getNombreDelPerro())) {
                        personas.get(i).setPerro(perro);
                        System.out.printf("FELICIDADES %s ACABA DE ADOPTAR A %s\n", personas.get(i).getNombreDeLaPersona().toUpperCase(), perro.getNombreDelPerro());
                        perros.remove(perro);
                        contAdoptado++;
                        break;
                    }
                }
                if (contAdoptado == 0) {
                    System.out.println("NO SE ENCONTRO ESE PERRO O YA FUE ADOPTADO");
                }
            } while (contAdoptado == 0);
        }
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
