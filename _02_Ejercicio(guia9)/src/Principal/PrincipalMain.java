

package Principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class PrincipalMain {

    
    public static void main(String[] args) {
        Scanner teclado              = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Juego juego                  = new Juego();
        RevolverDeAgua revolver      = new RevolverDeAgua();
        System.out.println("Ingrese numero de jugadores");
        int numeroDeJugadores = teclado.nextInt();
        if (numeroDeJugadores>6) {
            numeroDeJugadores = 6;
        }
        for (int i = 0; i < numeroDeJugadores; i++) {
            Jugador jugador = new Jugador(i+1,"Jugador");
            jugadores.add(jugador);
        }
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
        
    }

}
