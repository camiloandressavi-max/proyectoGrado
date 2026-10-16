package Modelo;

import java.util.ArrayList;

/**
 * Write a description of class UnidadTerrestre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class UnidadTerrestre extends UnidadOperativa {
    private ArrayList<Rescatista> listaRescatistas; 

    public UnidadTerrestre(String codigo) {
        super(codigo); 
        this.listaRescatistas = new ArrayList<>();
    }
        
    public ArrayList<Rescatista> getListaRescatistas() {
        return listaRescatistas;
    }

    public void setListaRescatistas(ArrayList<Rescatista> listaRescatistas) {
        this.listaRescatistas = listaRescatistas;
    }     
        
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unidad Terrestre [Código: ").append(codigo).append("] - Personal:\n");
        for (Rescatista r : listaRescatistas) {
            sb.append("   -> ").append(r.toString()).append("\n");
        }
        return sb.toString();
    }

}