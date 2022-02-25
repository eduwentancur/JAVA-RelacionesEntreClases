package Principal.servicios;

import Principal.Juego;
import Principal.Jugador;
import Principal.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class JuegoServicio {
    private Scanner teclado;
    private ArrayList<Jugador> jugadores; 
    private Juego juego;                  
    private RevolverDeAgua revolver;

    public JuegoServicio() {
        this.teclado   = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.jugadores = new ArrayList<>();   
        this.juego     = new Juego();
        this.revolver  = new RevolverDeAgua();
    }
    
    public void iniciarEljuego(){
        cargaDeJugadores(ingresaNumeroJugadores());
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();   
    }   
    
    public int ingresaNumeroJugadores(){
        System.out.println("Ingrese numero de jugadores");
        int numeroDeJugadores = teclado.nextInt();
        if (numeroDeJugadores>6) {
            return 6;
        }
        return numeroDeJugadores;
    }
    
    public void cargaDeJugadores(int numeroDeJugadores){
        for (int i = 0; i < numeroDeJugadores ; i++) {
            Jugador jugador = new Jugador(i+1,"Jugador");
            this.jugadores.add(jugador);
        }
    }
}
    
 

