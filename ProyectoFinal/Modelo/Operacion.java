package Modelo;

import java.util.ArrayList;
/**
 * Write a description of class Operacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operacion
{
    private String fecha;
    private ArrayList<MunicipiosAfectados> municipios;
    private ArrayList<Helicoptero> helicopteros;
    private ArrayList<UnidadTerrestre> unidadesTerrestres;
    private ArrayList<Rescatados> afectados;

    public Operacion(String fecha) {
        this.fecha = fecha;
        this.municipios = new ArrayList<>();
        this.helicopteros = new ArrayList<>();
        this.unidadesTerrestres = new ArrayList<>();
        this.afectados = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<MunicipiosAfectados> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<MunicipiosAfectados> municipios) {
        this.municipios = municipios;
    }

    public ArrayList<Helicoptero> getHelicopteros() {
        return helicopteros;
    }

    public void setHelicopteros(ArrayList<Helicoptero> helicopteros) {
        this.helicopteros = helicopteros;
    }

    public ArrayList<UnidadTerrestre> getUnidadesTerrestres() {
        return unidadesTerrestres;
    }

    public void setUnidadesTerrestres(ArrayList<UnidadTerrestre> unidadesTerrestres) {
        this.unidadesTerrestres = unidadesTerrestres;
    }

    public ArrayList<Rescatados> getAfectados() {
        return afectados;
    }

    public void setAfectados(ArrayList<Rescatados> afectados) {
        this.afectados = afectados;
    }
}