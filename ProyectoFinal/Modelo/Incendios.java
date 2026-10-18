package Modelo;


/**
 * Write a description of class Incendio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incendios
{
   private String idIncendio;
   
    public Incendios(String idIncendio) {
        this.idIncendio = idIncendio;
        }

    public String getIdIncendio() {
        return idIncendio;
    }

    public void setIdIncendio(String idIncendio) {
        this.idIncendio = idIncendio;
    }

   
    @Override
    public String toString() {
        return "Incendio ID: " + idIncendio ;
    }
}