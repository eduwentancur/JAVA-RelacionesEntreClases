package Principal;

import Principal.servicios.JuegoServicio;

public class PrincipalMain {
    
    public static void main(String[] args) {
        JuegoServicio juego = new JuegoServicio();
        juego.iniciarEljuego();
    }  
}
