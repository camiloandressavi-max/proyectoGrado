package Modelo;


/**
 * Write a description of class Helicoptero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicoptero extends UnidadOperativa {
    private Piloto piloto;

    public Helicoptero(String codigo, Piloto piloto, String equipamientos) {
        super(codigo); 
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    

    @Override
    public String toString() {
        return "Helicóptero de Código: " + codigo + ", Piloto: " + piloto.getNombre() + ", Equipado con el sistema Bambi Bucket ";
    }
}