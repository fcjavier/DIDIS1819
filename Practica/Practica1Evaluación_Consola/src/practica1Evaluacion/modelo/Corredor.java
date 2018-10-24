/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion.modelo;

 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Corredor implements Comparable<Corredor>{
    //Atributos
    private String nombre;
    private String dni;
    private String fechaNacimiento; 
    private String direccion;
    private String telefono;
    private String dorsal;
    private List<Corredor>listaCorredores=new ArrayList<Corredor>();
    //Constructores
    public Corredor() {
    }

    public Corredor(String nombre, String dni, String fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
    
    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Corredor: nombre= " + nombre + ", dni= " + dni + ", fechaNacimiento= " 
         + fechaNacimiento + ", direccion= " + direccion + ", telefono= " + telefono + ", dorsal= " + dorsal;
    }

    @Override
    public int compareTo(Corredor c) {
         return this.fechaNacimiento.compareTo(c.getFechaNacimiento());
    }
 
}
