/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Carrera {

    //Atributos
    private String nomCarrera;
    private String fecha;
    private String lugar;
    private int maxParticipantes;
    private List<Participante> listaDeParticipantes;

    //Constructores
    public Carrera() {
    }

    public Carrera(String nomCarrera, String fecha, String lugar, int maxParticipantes) {
        this.nomCarrera = nomCarrera;
        this.fecha = fecha;
        this.lugar = lugar;
        this.maxParticipantes = maxParticipantes;
        listaDeParticipantes=new ArrayList<>();
         
    }

    //Getters and Setters
    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public List<Participante> getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public void setListaDeParticipantes(List<Participante> listaDeParticipantes) {
        this.listaDeParticipantes = listaDeParticipantes;
    }
 
}
