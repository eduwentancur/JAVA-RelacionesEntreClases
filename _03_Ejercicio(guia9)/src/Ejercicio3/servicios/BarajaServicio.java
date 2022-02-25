package Ejercicio3.servicios;

import Ejercicio3.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import Ejercicio3.enumeraciones.Palos;
import java.util.EnumSet;

public class BarajaServicio {
    private ArrayList<Carta> mazoCompleto;
    private ArrayList<Carta> cartasQueSalieron;
    private Scanner teclado;

    public BarajaServicio() {
        this.mazoCompleto      = new ArrayList<>();
        this.cartasQueSalieron = new ArrayList<>();
        this.teclado           = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void crearMazo() {
        crearCartas();
        int opcion;
        do {
            System.out.println("---MENU---");
            System.out.println("1- Barajar el mazo");
            System.out.println("2- Sacar una carta");
            System.out.println("3- Ver cuantas cartas estan disponible");
            System.out.println("4- Sacar muchas cartas");
            System.out.println("5- Muestra las cartas que se saco");
            System.out.println("6- Muestra la baraja");
            System.out.println("7- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    barajar();
                    System.out.println("SE BARAJO LAS CARTAS");
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    System.out.printf("%s cartas disponibles",cartasDisponibles());
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 7:
                    System.out.println("CHAU");
                    break;
                default:
                    System.out.println("INGRESO NUMERO INCORRECTO");
            }
        } while (opcion != 7);
    }

    public ArrayList<Carta> crearCartas() {
        ArrayList<Carta> cartas = new ArrayList<>();
        for (Palos palo : EnumSet.range(Palos.ESPADA, Palos.COPAS)) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    Carta carta = new Carta(i, palo);
                    cartas.add(carta);
                    this.mazoCompleto.add(carta);
                }
            }
        }    
        return cartas;
    }

    public void barajar() {
        Collections.shuffle(this.mazoCompleto);
    }

    public void siguienteCarta() {
        Carta carta = new Carta();
        if (!this.mazoCompleto.isEmpty()) {
            carta = this.mazoCompleto.get(0);
            this.cartasQueSalieron.add(carta);
            System.out.println(carta);
            this.mazoCompleto.remove(0);
        }else{
            System.out.println("No hay mas carta para dar");
        }
    }

    public int cartasDisponibles() {
        return this.mazoCompleto.size();
    }

    public void darCartas() {
        System.out.println("Cuantas cartas desea?");
        int numeroDeCartasPedidas = teclado.nextInt();
        if (numeroDeCartasPedidas<=this.mazoCompleto.size()) {
            for (int i = 0; i < numeroDeCartasPedidas; i++) {
                System.out.println(this.mazoCompleto.get(i));
                this.cartasQueSalieron.add(this.mazoCompleto.get(i));
            }
        } else {
            System.out.printf("NO HAY CARTAS SUFICIENTES, HAY %s cartas\n", this.mazoCompleto.size());
        }
        this.mazoCompleto.removeAll(this.cartasQueSalieron);
    }

    public void cartasMonton() {
        if (this.cartasQueSalieron.size() > 0) {
            System.out.println("LAS CARTAS QUE SALIERON:");
            for (Carta carta : cartasQueSalieron) {
                System.out.println(carta);
            }
        } else {
            System.out.println("NO SALIO NINGUNA CARTA DEL MAZO");
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : mazoCompleto) {
            System.out.println(carta);
        }
    }
}
