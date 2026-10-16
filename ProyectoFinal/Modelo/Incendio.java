package Modelo;


/**
 * Write a description of class Incendio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incendio
{
    private String municipio;
    private String nivelAlerta;
    private int cantidadIncendios;

    public Incendio(String municipio, String nivelAlerta, int cantidadIncendios) {
        this.municipio = municipio;
        this.nivelAlerta = nivelAlerta;
        this.cantidadIncendios = cantidadIncendios;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(String nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }

    public int getCantidadIncendios() {
        return cantidadIncendios;
    }

    public void setCantidadIncendios(int cantidadIncendios) {
        this.cantidadIncendios = cantidadIncendios;
    }

    @Override
    public String toString() {
        return "Incendio Municipio: " + municipio + ", Nivel de Alerta: " + nivelAlerta + ", Cantidad: " + cantidadIncendios ;
    }
}
