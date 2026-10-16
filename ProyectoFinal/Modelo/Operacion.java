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
    private ArrayList<Incendio> listaIncendios;
    private ArrayList<UnidadTerrestre> listaUnidadesTerrestres;
    private ArrayList<Helicoptero> listaHelicopteros;

    public Operacion(ArrayList<Incendio> listaIncendios, ArrayList<UnidadTerrestre> listaUnidadesTerrestres, ArrayList<Helicoptero> listaHelicopteros) {
        this.listaIncendios = listaIncendios;
        this.listaUnidadesTerrestres = listaUnidadesTerrestres;
        this.listaHelicopteros = listaHelicopteros;
    }

    public ArrayList<Incendio> getListaIncendios() {
        return listaIncendios;
    }

    public void setListaIncendios(ArrayList<Incendio> listaIncendios) {
        this.listaIncendios = listaIncendios;
    }

    public ArrayList<UnidadTerrestre> getListaUnidadesTerrestres() {
        return listaUnidadesTerrestres;
    }

    public void setListaUnidadesTerrestres(ArrayList<UnidadTerrestre> listaUnidadesTerrestres) {
        this.listaUnidadesTerrestres = listaUnidadesTerrestres;
    }

    public ArrayList<Helicoptero> getListaHelicopteros() {
        return listaHelicopteros;
    }

    public void setListaHelicopteros(ArrayList<Helicoptero> listaHelicopteros) {
        this.listaHelicopteros = listaHelicopteros;
    }
}