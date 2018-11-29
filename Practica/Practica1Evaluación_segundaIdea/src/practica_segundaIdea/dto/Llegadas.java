/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.dto;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Llegadas implements Serializable{
    //Atributos      
    private String dorsal;
    private String tiempo;
    private String nomCorredor;

    public Llegadas() {
    }

    public Llegadas(String dorsal, String tiempo, String nomCorredor) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
        this.nomCorredor = nomCorredor;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNomCorredor() {
        return nomCorredor;
    }

    public void setNomCorredor(String nomCorredor) {
        this.nomCorredor = nomCorredor;
    }
 
}
