/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresosGastos.dto;

import java.util.Date;

/**
 *
 * @author Javier
 */
public class Movimiento {
    //Atributos 
    private Date fecha;
    private String concepto;
    private String cantidad;
    private String balance;

    public Movimiento() {
    }
    

    public Movimiento(Date fecha, String concepto, String cantidad) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    
    public String[] movimientoArray(){
        String[] mov = new String[3];
        mov[0]=fecha.toString();
        mov[1]=concepto;
        mov[2]=cantidad;
        return mov;
    }
    
}
