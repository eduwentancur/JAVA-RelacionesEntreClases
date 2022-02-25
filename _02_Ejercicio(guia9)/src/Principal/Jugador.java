package Principal;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverDeAgua r){
        this.mojado = false;
        r.siguienteChorro();
        if (r.mojar()) {
            this.mojado = true;
            return true;
        }
        return this.mojado;
    }
    
    @Override
    public String toString() {
        return String.format("EL %s %d ",nombre, id);
    }
}
