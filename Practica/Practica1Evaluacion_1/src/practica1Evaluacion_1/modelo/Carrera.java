/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion_1.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class Carrera {
    //Atributos
    private String nombre;
    private Date fecha;
    private String lugar;
    private int maxParticipantes;
    private List<Corredor> listaCorredores;

    //Constructores
    public Carrera() {
    }

    public Carrera(String nombre, Date fecha, String lugar, int maxParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.maxParticipantes = maxParticipantes;
        this.listaCorredores =new ArrayList<Corredor>();
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }
    
  
}
