package Modelo;

import java.util.ArrayList;
/**
 * Write a description of class MunicipiosAfectados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MunicipiosAfectados
{
    private String nombreMunicipio;
    private int poblacion;
    private NivelDeAlerta nivelAlerta; 
    private ArrayList<Incendios> incendios; 

    public MunicipiosAfectados(String nombreMunicipio, int poblacion, NivelDeAlerta nivelAlerta) {
        this.nombreMunicipio = nombreMunicipio;
        this.poblacion = poblacion;
        this.nivelAlerta = nivelAlerta;
        this.incendios = new ArrayList<>();
    }

        public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public NivelDeAlerta getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(NivelDeAlerta nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }
    
    public ArrayList<Incendios> getIncendios() {
        return incendios;
    }

    public void setIncendios(ArrayList<Incendios> incendios) {
        this.incendios = incendios;
    }
   
    public void agregarIncendio(Incendios incendio) {
        this.incendios.add(incendio);
    }

    @Override
    public String toString() {
        return "Municipio: " + nombreMunicipio + ", Población: " + poblacion + ", Nivel de Alerta: " + nivelAlerta + ", Cantidad de Incendios: " + incendios.size();
    }

    
}