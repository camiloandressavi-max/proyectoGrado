package Modelo;


/**
 * Write a description of class Rescatista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rescatista extends Persona {
    private String certificado;

    public Rescatista(String nombre, String id, String certificado) {
        super(nombre, id); 
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    @Override
    public String toString() {
        return "Rescatista ID: " + id + ", Nombre: " + nombre + ", Certificado: " + certificado + "";
    }

}