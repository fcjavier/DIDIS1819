/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage.dto;

import java.util.Date;

/**
 *
 * @author Javier
 */
public class Propietario {
    //Atributos
    private String nombre,apellidos,telefono;
    private Date fecha;
    private String dni;
    private Vehiculo vehiculo;
    private String modelo,matricula;
    private double medida;
    private String peligro;
    //Constructores
    public Propietario() {
    }

    public Propietario(String nombre, String apellidos, String telefono, Date fecha,
            String dni,Vehiculo vehiculo, String modelo, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.dni = dni;
        this.vehiculo = vehiculo;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Vehiculo getTipoVehiculo() {
        return vehiculo;
    }

    public void setTipoVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    public String[] miArray(){
        String[] datos=new String[3];
        datos[0]=getMatricula();
        datos[1]=getModelo();
        datos[2]=getFecha().toString();
        return datos;
    }
    
}
