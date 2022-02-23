package Principal;

import entidades.Perro;
import entidades.Persona;
import enumeraciones.TamañoAnimal;
import servicios.AdoptarService;

public class Principal {

    public static void main(String[] args) {
        AdoptarService adopcion = new AdoptarService();
        Perro perro1 = new Perro("coco","caniche",2,TamañoAnimal.CHIQUITO);
        Perro perro2 = new Perro("firulais","bull dog",1,TamañoAnimal.MEDIANO);
        Persona persona1 = new Persona("Lionel","Messi",36,23232323);
        Persona persona2 = new Persona("Cristiano","Ronaldo",38,232424242);
        adopcion.sistemaAdopcion(perro1,perro2,persona1,persona2);
    }

}
