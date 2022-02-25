package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver, Scanner teclado) {
        this.jugadores = jugadores;
        this.revolver = revolver;
        
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;

    }

    public void ronda() {
        boolean finalizoJuego=false;
        do {
            for (Jugador jugador : jugadores) {
                if (jugador.disparo(this.revolver)) {
                    System.out.printf("%s SE MOJO\n", jugador);
                    finalizoJuego=true;
                    break;
                } else {
                    System.out.printf("%s NO SE MOJO\n", jugador);
                }
            }
        } while (finalizoJuego == false);

    }

}
