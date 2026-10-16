package Modelo;


/**
 * Write a description of class Piloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piloto extends Persona {
    private String licenciaVuelo;

    public Piloto(String nombre, String id, String licenciaVuelo) {
        super(nombre, id); 
        this.licenciaVuelo = licenciaVuelo;
    }

    public String getLicenciaVuelo() {
        return licenciaVuelo;
    }

    public void setLicenciaVuelo(String licenciaVuelo) {
        this.licenciaVuelo = licenciaVuelo;
    }

    @Override
    public String toString() {
        return "Piloto ID: " + id + ", Nombre: " + nombre + ", Licencia: " + licenciaVuelo + "";
    }
}
