package Modelo;

import java.util.ArrayList;

/**
 * Write a description of class ClaseGestora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestorIncendios {
    private ArrayList<MunicipiosAfectados> municipios;
    private ArrayList<UnidadOperativa> unidadesOperativas;
    private ArrayList<Operacion> operaciones;
    

    public GestorIncendios() {
        this.municipios = new ArrayList<>();
        this.unidadesOperativas = new ArrayList<>();
        this.operaciones = new ArrayList<>();
    }

    public ArrayList<MunicipiosAfectados> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<MunicipiosAfectados> municipios) {
        this.municipios = municipios;
    }

    public ArrayList<UnidadOperativa> getUnidadesOperativas() {
        return unidadesOperativas;
    }

    public void setUnidadesOperativas(ArrayList<UnidadOperativa> unidadesOperativas) {
        this.unidadesOperativas = unidadesOperativas;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
    
    public boolean registrarMunicipios(MunicipiosAfectados m, String codigo){
        Incendio i = new Incendio(codigo);
        for(Incendio in: m.getIncendios()){
            if(in.getCodigo().equals(codigo)){
            System.out.println("Ese codigo ya ha sido registrado");
            return false;
        }
        }
        
        
        m.getIncendios().add(i);
        municipios.add(m);
        return true;
    }
    
    public String listarMunicipios(String respuesta){
        if(municipios.isEmpty()){
        return "No hay municipios registrados";
        }
        for(MunicipiosAfectados m: municipios){
           respuesta ="Municipio: " + m.getNombreMunicipio()+ "De Poblacion: "+ m.getPoblacion();
               
           int cantidadIncendios= m.getIncendios().size();
           String nivelAlerta= "";
               if(cantidadIncendios>=0||cantidadIncendios<=3){
                   nivelAlerta+="BAJO";
               }else if(cantidadIncendios>3||cantidadIncendios<=6){
                   nivelAlerta+="MEDIO";
               }else if(cantidadIncendios>6){
                   nivelAlerta+="ALTO";
               }
               
           respuesta+="Cantidad de incendios: "+cantidadIncendios+"Nivel de Alerta"+ nivelAlerta;
               
        if (m.getIncendios().isEmpty()) {
            respuesta += "Municipio de " + m.getNombreMunicipio() 
                       + " de población " + m.getPoblacion() 
                       + "  Sin incendios registrados. Nivel de alerta: " + nivelAlerta + "\n";
        } else {
            for (Incendio inc : m.getIncendios()) {
                respuesta += "Municipio de " + m.getNombreMunicipio() 
                           + " de población " + m.getPoblacion() 
                           + " con código de incendio " + inc.getCodigo() 
                           + " nivel de alerta " + nivelAlerta + "\n";
            }
        }
    }

    return respuesta;
}
    
    public boolean registrarUnidadesTerrestres(String codigo, int equipoTotal, boolean equipoCertificado){
        for(UnidadOperativa uni: unidadesOperativas){
            if(uni.getCodigo().equals(codigo)){
                System.out.println("Ya existe una unidad asignada a ese codigo");
                return false;
            }
        }
        UnidadTerrestre u= new UnidadTerrestre(codigo,equipoTotal,equipoCertificado);
        
        unidadesOperativas.add(u);
        return true;
    }
    
    public String listarUnidadesTerrestres(String respuesta){
        respuesta="";
        for(UnidadOperativa u: unidadesOperativas){
            if(u instanceof UnidadTerrestre){
                respuesta=u.toString()+"\n";
            }
        }
        
        
        
        return respuesta;
    }
}   
