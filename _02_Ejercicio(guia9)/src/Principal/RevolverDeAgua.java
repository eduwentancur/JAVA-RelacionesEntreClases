
package Principal;


public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        this.posicionActual = ((int)(Math.random()*6)+1);
        this.posicionAgua = ((int)(Math.random()*6)+1);
    
    }
    
    public boolean mojar(){
        if (this.posicionActual != this.posicionAgua) {
            return false;
        }
        return true;
    
    }
    
    public void siguienteChorro(){
        
        if (this.posicionActual == 6) {
            this.posicionActual = 1;
        }else {
            this.posicionActual++;
        }
    }
    
    
    
    @Override
    public String toString() {
        return String.format("Posicion Acutual: %s Posicion del Agua: %s",this.posicionActual,this.posicionAgua);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
