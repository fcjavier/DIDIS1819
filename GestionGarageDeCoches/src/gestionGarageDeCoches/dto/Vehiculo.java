/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage.dto;

/**
 *
 * @author Javier
 */
public class Vehiculo {
    //Atributos
    private String tipo;
    private double medida;
    private String peligro;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, double medida, String peligro) {
        this.tipo = tipo;
        this.medida = medida;
        this.peligro = peligro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public String getPeligro() {
        return peligro;
    }

    public void setPeligro(String peligro) {
        this.peligro = peligro;
    }
    
    
}
